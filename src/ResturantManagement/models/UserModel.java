package ResturantManagement.models;

public class UserModel {
    int userID;
    String firstName;
    String lastName;
    String emailId;
    String  phoneNo;
    boolean termsOfAgree;
//    enum Choice{
//        ADMIN,USER
//    };

    public UserModel(int userID, String firstName, String lastName,
                     String emailId, String  phoneNo, boolean termsOfAgree) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.termsOfAgree = termsOfAgree;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public boolean isTermsOfAgree() {
        return termsOfAgree;
    }

    public void setTermsOfAgree(boolean termsOfAgree) {
        this.termsOfAgree = termsOfAgree;
    }
}

