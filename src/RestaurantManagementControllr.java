import ResturantManagement.Services.RestaurantInterface;
import ResturantManagement.Services.RestaurantInterfaceImpls;
import ResturantManagement.models.Admin;
import ResturantManagement.models.UserModel;

import java.util.Scanner;

public class RestaurantManagementControllr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RestaurantInterface restaurantInterface=new RestaurantInterfaceImpls();
        do{
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("Enter you choice");
            int choice=sc.nextInt();
            if(choice==1){

            }
        }while (true);
    }
}
