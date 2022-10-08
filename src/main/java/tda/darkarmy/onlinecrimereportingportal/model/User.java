package tda.darkarmy.onlinecrimereportingportal.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String address;
    private String contactNumber;
    private String gender;
    private String aadhar;
    private String dob;
    private String email;
    private String password;
    private Boolean isActive;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLES", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLES_ID"))
	private Set<Roles> roles= new HashSet<>();


    public User() {
    }

    public User(Long userId, String userName, String address, String contactNumber, String gender, String aadhar, String dob, String email, String password, Boolean isActive, Set<Roles> roles) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.aadhar = aadhar;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.roles = roles;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Boolean isIsActive() {
        return this.isActive;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Set<Roles> getRoles() {
        return this.roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    public User userId(Long userId) {
        setUserId(userId);
        return this;
    }

    public User userName(String userName) {
        setUserName(userName);
        return this;
    }

    public User address(String address) {
        setAddress(address);
        return this;
    }

    public User contactNumber(String contactNumber) {
        setContactNumber(contactNumber);
        return this;
    }

    public User gender(String gender) {
        setGender(gender);
        return this;
    }

    public User aadhar(String aadhar) {
        setAadhar(aadhar);
        return this;
    }

    public User dob(String dob) {
        setDob(dob);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User isActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    public User roles(Set<Roles> roles) {
        setRoles(roles);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", userName='" + getUserName() + "'" +
            ", address='" + getAddress() + "'" +
            ", contactNumber='" + getContactNumber() + "'" +
            ", gender='" + getGender() + "'" +
            ", aadhar='" + getAadhar() + "'" +
            ", dob='" + getDob() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", isActive='" + isIsActive() + "'" +
            ", roles='" + getRoles() + "'" +
            "}";
    }
    

}
