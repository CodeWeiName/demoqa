package dto;

public class PracticFormData {

    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String currentAddress;

    public PracticFormData(String firstName, String lastName, String email, String mobile, String currentAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.currentAddress = currentAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

  /*  public String getSubjects() {
        return subjects;
    }*/

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

   /* public void setSubjects(String subjects) {
        this.subjects = subjects;
    }*/

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
}
