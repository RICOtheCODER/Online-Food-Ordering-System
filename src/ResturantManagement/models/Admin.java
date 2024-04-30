package ResturantManagement.models;

public class Admin extends UserModel{
    int userId;

    static int adminCount;
    String userName;
    String passWord;
    public Admin(int userID, String firstName, String lastName, String emailId,
                 String phoneNo, boolean termsOfAgree) {
        super(userID, firstName, lastName, emailId, phoneNo, termsOfAgree);
        adminCount++;
        userId++;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNo=" + phoneNo +
                ", termsOfAgree=" + termsOfAgree +
                '}';
    }

    public static int getAdminCount() {
        return adminCount;
    }

    public static void setAdminCount(int adminCount) {
        Admin.adminCount = adminCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
