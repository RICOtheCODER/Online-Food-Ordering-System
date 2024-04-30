package ResturantManagement.Services;

import ResturantManagement.models.Admin;
import ResturantManagement.models.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantInterfaceImpls  implements  RestaurantInterface{

    Scanner sc=new Scanner(System.in);
    List<Restaurant> listOfRest=new ArrayList<>();

    @Override
    public boolean isRegistered() {
        System.out.println("Enter First Name");
        String name= sc.nextLine();
        System.out.println("Enter Last Name");
        String lname= sc.nextLine();
        System.out.println("enter the Email Id");
        String email=sc.nextLine();
        System.out.println("Enter Phone No :");
        String phone=sc.nextLine();
        System.out.println("Terms of Agreement ?");
        boolean b=sc.nextBoolean();
        System.out.println("Set you username");
        String userName= sc.nextLine();
        System.out.println("Enter your Password");
        String password=sc.nextLine();

       //Admin admin=new Admin();
        return false;
    }

    @Override
    public void addRestaurant(Restaurant restaurant) {
        listOfRest.add(restaurant);
    }
}
