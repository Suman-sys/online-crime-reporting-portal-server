package tda.darkarmy.onlinecrimereportingportal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tda.darkarmy.onlinecrimereportingportal.dto.ReportCrimeRequest;
import tda.darkarmy.onlinecrimereportingportal.service.ReportCrimeService;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/crime-report")
public class ReportCrimeController {

    @Autowired
    private ReportCrimeService reportCrimeService;

    // @PostMapping("/report")
    // public ResponseEntity<?> reportCrime(@RequestParam MultipartFile[] files,
    // @ModelAttribute ReportCrime reportCrime){
    // System.out.println(reportCrime.toString());
    // return
    // ResponseEntity.status(201).body(reportCrimeService.reportCrime(reportCrime,
    // files));
    // }

    @PostMapping("/report")
    public ResponseEntity<?> reportCrime(@ModelAttribute ReportCrimeRequest reportCrimeRequest) {
        System.out.println(reportCrimeRequest.toString());
        return ResponseEntity.status(201).body(reportCrimeService.reportCrime(reportCrimeRequest));
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllReport() {
        return ResponseEntity.status(200).body(reportCrimeService.getAllReport());
    }

    @GetMapping("/my-report")
    public ResponseEntity<?> getMyReports() {
        return ResponseEntity.status(200).body(reportCrimeService.getMyReport());
    }

    @GetMapping("/case-number/{caseNumber}")
    public ResponseEntity<?> getAllReport(@PathVariable("caseNumber") String caseNumber) {
        return ResponseEntity.status(200).body(reportCrimeService.getReportByCaseNumber(caseNumber));
    }

    @PutMapping("/update-status/{id}")
    public ResponseEntity<?> updateStatus(@PathVariable("id") Long id, @RequestBody Map<String, String> status) {
        System.out.println("Status" + status.get("status"));
        return ResponseEntity.status(200).body(reportCrimeService.updateStatus(id, status.get("status")));
    }
}
