package tda.darkarmy.onlinecrimereportingportal.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ReportCrimeRequest {
    private String reportType;
    private String crimeLocation;
    private String crimeCategory;
    private String crimeDate;
    private String crimeTitle;
    private String crimeDescription;
    private String crimeReportStatus;

    private List<MultipartFile> files = new ArrayList<>();

    public ReportCrimeRequest() {
    }

    public ReportCrimeRequest(String reportType, String crimeLocation, String crimeCategory, String crimeDate, String crimeTitle, String crimeDescription, String crimeReportStatus, List<MultipartFile> files) {
        this.reportType = reportType;
        this.crimeLocation = crimeLocation;
        this.crimeCategory = crimeCategory;
        this.crimeDate = crimeDate;
        this.crimeTitle = crimeTitle;
        this.crimeDescription = crimeDescription;
        this.crimeReportStatus = crimeReportStatus;
        this.files = files;
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

    public List<MultipartFile> getFiles() {
        return this.files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }

    public ReportCrimeRequest reportType(String reportType) {
        setReportType(reportType);
        return this;
    }

    public ReportCrimeRequest crimeLocation(String crimeLocation) {
        setCrimeLocation(crimeLocation);
        return this;
    }

    public ReportCrimeRequest crimeCategory(String crimeCategory) {
        setCrimeCategory(crimeCategory);
        return this;
    }

    public ReportCrimeRequest crimeDate(String crimeDate) {
        setCrimeDate(crimeDate);
        return this;
    }

    public ReportCrimeRequest crimeTitle(String crimeTitle) {
        setCrimeTitle(crimeTitle);
        return this;
    }

    public ReportCrimeRequest crimeDescription(String crimeDescription) {
        setCrimeDescription(crimeDescription);
        return this;
    }

    public ReportCrimeRequest crimeReportStatus(String crimeReportStatus) {
        setCrimeReportStatus(crimeReportStatus);
        return this;
    }

    public ReportCrimeRequest files(List<MultipartFile> files) {
        setFiles(files);
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " reportType='" + getReportType() + "'" +
            ", crimeLocation='" + getCrimeLocation() + "'" +
            ", crimeCategory='" + getCrimeCategory() + "'" +
            ", crimeDate='" + getCrimeDate() + "'" +
            ", crimeTitle='" + getCrimeTitle() + "'" +
            ", crimeDescription='" + getCrimeDescription() + "'" +
            ", crimeReportStatus='" + getCrimeReportStatus() + "'" +
            ", files='" + getFiles() + "'" +
            "}";
    }

    
}
