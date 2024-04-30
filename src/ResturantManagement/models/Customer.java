package ResturantManagement.models;

public class Customer extends UserModel{

    String userName;
    static int customerCount;
    String password;
    public Customer(int userID, String firstName, String lastName,
                    String emailId, int phoneNo,
                    boolean termsOfAgree,String userName,String password) {
        super(userID, firstName, lastName, emailId, phoneNo,termsOfAgree);
        this.userName=userName;
        this.password=password;
        customerCount++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNo=" + phoneNo +
                ", termsOfAgree=" + termsOfAgree +
                '}';
    }
}
