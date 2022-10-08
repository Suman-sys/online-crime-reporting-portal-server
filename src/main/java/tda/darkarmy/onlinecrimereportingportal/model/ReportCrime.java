package tda.darkarmy.onlinecrimereportingportal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class ReportCrime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportCrimeId;
    private String caseNumber;
    private String reportType;
    private String crimeLocation;
    private String crimeCategory;
    private String crimeDate;
    private String crimeTitle;

    @Lob
    @Column(name = "crimeDescription", length = 5120)
    private String crimeDescription;
    private String crimeReportStatus;

    @Column
    @ElementCollection(targetClass = String.class)
    private List<String> evidences = new ArrayList<>();

    // @Column
    // @ElementCollection(targetClass=MultipartFile.class)
    // private List<MultipartFile> files = new ArrayList<>();

    private String email;

    public ReportCrime() {
    }

    public ReportCrime(Long reportCrimeId, String caseNumber, String reportType, String crimeLocation,
            String crimeCategory, String crimeDate, String crimeTitle, String crimeDescription,
            String crimeReportStatus, List<String> evidences, String email) {
        this.reportCrimeId = reportCrimeId;
        this.caseNumber = caseNumber;
        this.reportType = reportType;
        this.crimeLocation = crimeLocation;
        this.crimeCategory = crimeCategory;
        this.crimeDate = crimeDate;
        this.crimeTitle = crimeTitle;
        this.crimeDescription = crimeDescription;
        this.crimeReportStatus = crimeReportStatus;
        this.evidences = evidences;
        this.email = email;
    }

    public Long getReportCrimeId() {
        return this.reportCrimeId;
    }

    public void setReportCrimeId(Long reportCrimeId) {
        this.reportCrimeId = reportCrimeId;
    }

    public String getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getReportType() {
        return this.reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getCrimeLocation() {
        return this.crimeLocation;
    }

    public void setCrimeLocation(String crimeLocation) {
        this.crimeLocation = crimeLocation;
    }

    public String getCrimeCategory() {
        return this.crimeCategory;
    }

    public void setCrimeCategory(String crimeCategory) {
        this.crimeCategory = crimeCategory;
    }

    public String getCrimeDate() {
        return this.crimeDate;
    }

    public void setCrimeDate(String crimeDate) {
        this.crimeDate = crimeDate;
    }

    public String getCrimeTitle() {
        return this.crimeTitle;
    }

    public void setCrimeTitle(String crimeTitle) {
        this.crimeTitle = crimeTitle;
    }

    public String getCrimeDescription() {
        return this.crimeDescription;
    }

    public void setCrimeDescription(String crimeDescription) {
        this.crimeDescription = crimeDescription;
    }

    public String getCrimeReportStatus() {
        return this.crimeReportStatus;
    }

    public void setCrimeReportStatus(String crimeReportStatus) {
        this.crimeReportStatus = crimeReportStatus;
    }

    public List<String> getEvidences() {
        return this.evidences;
    }

    public void setEvidences(List<String> evidences) {
        this.evidences = evidences;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ReportCrime reportCrimeId(Long reportCrimeId) {
        setReportCrimeId(reportCrimeId);
        return this;
    }

    public ReportCrime caseNumber(String caseNumber) {
        setCaseNumber(caseNumber);
        return this;
    }

    public ReportCrime reportType(String reportType) {
        setReportType(reportType);
        return this;
    }

    public ReportCrime crimeLocation(String crimeLocation) {
        setCrimeLocation(crimeLocation);
        return this;
    }

    public ReportCrime crimeCategory(String crimeCategory) {
        setCrimeCategory(crimeCategory);
        return this;
    }

    public ReportCrime crimeDate(String crimeDate) {
        setCrimeDate(crimeDate);
        return this;
    }

    public ReportCrime crimeTitle(String crimeTitle) {
        setCrimeTitle(crimeTitle);
        return this;
    }

    public ReportCrime crimeDescription(String crimeDescription) {
        setCrimeDescription(crimeDescription);
        return this;
    }

    public ReportCrime crimeReportStatus(String crimeReportStatus) {
        setCrimeReportStatus(crimeReportStatus);
        return this;
    }

    public ReportCrime evidences(List<String> evidences) {
        setEvidences(evidences);
        return this;
    }

    public ReportCrime email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " reportCrimeId='" + getReportCrimeId() + "'" +
                ", caseNumber='" + getCaseNumber() + "'" +
                ", reportType='" + getReportType() + "'" +
                ", crimeLocation='" + getCrimeLocation() + "'" +
                ", crimeCategory='" + getCrimeCategory() + "'" +
                ", crimeDate='" + getCrimeDate() + "'" +
                ", crimeTitle='" + getCrimeTitle() + "'" +
                ", crimeDescription='" + getCrimeDescription() + "'" +
                ", crimeReportStatus='" + getCrimeReportStatus() + "'" +
                ", evidences='" + getEvidences() + "'" +
                ", email='" + getEmail() + "'" +
                "}";
    }

}