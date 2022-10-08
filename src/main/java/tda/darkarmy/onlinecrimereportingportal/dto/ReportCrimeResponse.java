package tda.darkarmy.onlinecrimereportingportal.dto;



import tda.darkarmy.onlinecrimereportingportal.model.ReportCrime;
import tda.darkarmy.onlinecrimereportingportal.model.User;

public class ReportCrimeResponse {
    private ReportCrime reportCrime;
    private User user;


    public ReportCrimeResponse() {
    }

    public ReportCrimeResponse(ReportCrime reportCrime, User user) {
        this.reportCrime = reportCrime;
        this.user = user;
    }

    public ReportCrime getReportCrime() {
        return this.reportCrime;
    }

    public void setReportCrime(ReportCrime reportCrime) {
        this.reportCrime = reportCrime;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    @Override
    public String toString() {
        return "{" +
            " reportCrime='" + getReportCrime() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }

    
}
