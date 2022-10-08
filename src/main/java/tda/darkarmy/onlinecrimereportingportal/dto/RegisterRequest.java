package tda.darkarmy.onlinecrimereportingportal.dto;

public class RegisterRequest {
    private String userName;
    private String address;
    private String contactNumber;
    private String gender;
    private String aadhar;
    private String dob;
    private String email;
    private String password;
    private String roles;



    public RegisterRequest() {
    }

    public RegisterRequest(String userName, String address, String contactNumber, String gender, String aadhar, String dob, String email, String password, String roles) {
        this.userName = userName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.aadhar = aadhar;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAadhar() {
        return this.aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public RegisterRequest userName(String userName) {
        setUserName(userName);
        return this;
    }

    public RegisterRequest address(String address) {
        setAddress(address);
        return this;
    }

    public RegisterRequest contactNumber(String contactNumber) {
        setContactNumber(contactNumber);
        return this;
    }

    public RegisterRequest gender(String gender) {
        setGender(gender);
        return this;
    }

    public RegisterRequest aadhar(String aadhar) {
        setAadhar(aadhar);
        return this;
    }

    public RegisterRequest dob(String dob) {
        setDob(dob);
        return this;
    }

    public RegisterRequest email(String email) {
        setEmail(email);
        return this;
    }

    public RegisterRequest password(String password) {
        setPassword(password);
        return this;
    }

    public RegisterRequest roles(String roles) {
        setRoles(roles);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " userName='" + getUserName() + "'" +
            ", address='" + getAddress() + "'" +
            ", contactNumber='" + getContactNumber() + "'" +
            ", gender='" + getGender() + "'" +
            ", aadhar='" + getAadhar() + "'" +
            ", dob='" + getDob() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", roles='" + getRoles() + "'" +
            "}";
    }
    

}
