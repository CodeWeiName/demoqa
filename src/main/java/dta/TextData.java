package dta;

public class TextData {
    String userName;
    String userEmail;
    String currentAddress;
    String permanentAddress;

    public TextData(String userName, String userEmail, String currentAddress, String permanentAddress) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
