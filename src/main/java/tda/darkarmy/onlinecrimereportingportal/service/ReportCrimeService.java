package tda.darkarmy.onlinecrimereportingportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tda.darkarmy.onlinecrimereportingportal.dto.ReportCrimeRequest;
import tda.darkarmy.onlinecrimereportingportal.dto.ReportCrimeResponse;
import tda.darkarmy.onlinecrimereportingportal.model.ReportCrime;
import tda.darkarmy.onlinecrimereportingportal.model.User;
import tda.darkarmy.onlinecrimereportingportal.repository.ReportCrimeRepository;
import tda.darkarmy.onlinecrimereportingportal.repository.UserRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

import org.springframework.util.StringUtils;

@Service
public class ReportCrimeService {

    private final String BASE_URL = "http://localhost:8000";

    private Path fileStoragePath;

    @Autowired
    private ReportCrimeRepository reportCrimeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthService authService;

    public ReportCrimeService() {
        try {
            fileStoragePath = Paths.get("src\\main\\resources\\static\\fileStorage").toAbsolutePath().normalize();
            Files.createDirectories(fileStoragePath);
        } catch (IOException e) {
            throw new RuntimeException("Issue in creating file directory");
        }
    }

    public ReportCrime updateStatus(Long id, String status) {

        Optional<ReportCrime> reportCrime = reportCrimeRepository.findById(id);

        if (!reportCrime.isPresent())
            return null;

        ReportCrime reportCrime2 = reportCrime.get();
        reportCrime2.setCrimeReportStatus(status);
        return reportCrimeRepository.save(reportCrime2);
    }

    public ReportCrime getReportByCaseNumber(String caseNumber) {
        return reportCrimeRepository.findByCaseNumber(caseNumber);
    }

    public List<ReportCrimeResponse> getAllReport() {
        List<ReportCrime> reportCrime = reportCrimeRepository.findAll();
        List<ReportCrimeResponse> reportCrimeResponses = new ArrayList<>();

        for(ReportCrime reportCrime2: reportCrime){
            User user=null;
            if(reportCrime2.getEmail()!=null){
                user = userRepository.findByEmail(reportCrime2.getEmail());
            }
            
            reportCrimeResponses.add(new ReportCrimeResponse(reportCrime2,  user));
        }

        return reportCrimeResponses;
    }


    public List<ReportCrimeResponse> getMyReport() {
        User user = authService.getLoggedInUser();
        List<ReportCrime> reportCrime = reportCrimeRepository.findByEmail(user.getEmail());
        List<ReportCrimeResponse> reportCrimeResponses = new ArrayList<>();

        for(ReportCrime reportCrime2: reportCrime){
            reportCrimeResponses.add(new ReportCrimeResponse(reportCrime2,  user));
        }


        return reportCrimeResponses;
    }

    public ReportCrime reportCrime(ReportCrimeRequest reportCrimeRequest) {

        User user = authService.getLoggedInUser();

        ReportCrime reportCrime = new ReportCrime();

        if (!reportCrimeRequest.getReportType().equalsIgnoreCase("anonymous"))
            reportCrime.setEmail(user.getEmail());
        reportCrime.setCaseNumber(Integer.toString(100000000 + new Random().nextInt(1000000000)));
        reportCrime.setCrimeCategory(reportCrimeRequest.getCrimeCategory());
        reportCrime.setCrimeDate(reportCrimeRequest.getCrimeDate());
        reportCrime.setCrimeDescription(reportCrimeRequest.getCrimeDescription());
        reportCrime.setCrimeLocation(reportCrimeRequest.getCrimeLocation());
        reportCrime.setCrimeTitle(reportCrimeRequest.getCrimeTitle());
        reportCrime.setCrimeReportStatus("Filed");
        reportCrime.setReportType(reportCrimeRequest.getReportType());
        List<String> list = new ArrayList<>();

        System.out.println("Files"+ reportCrimeRequest.getFiles().size());
        for (MultipartFile file : reportCrimeRequest.getFiles()) {
            String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
            fileName = fileName.replace(" ", "");
            Path filePath = Paths.get(fileStoragePath + "\\" + fileName);

            try {
                
                Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {

                e.printStackTrace();
            }
            list.add(BASE_URL + "/fileStorage/" + fileName);
        }

        reportCrime.setEvidences(list);
        return reportCrimeRepository.save(reportCrime);
    }

}
