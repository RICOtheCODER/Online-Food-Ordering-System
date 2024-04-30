package ResturantManagement.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private  int restaurantID;
    private String name;
    private String address;
    private LocalTime openTime;
    private LocalTime closeTime;
    private float rating;
    private String emailID;
    private int phoneNo;
    private List<String> menu;

    public Restaurant(int restaurantID, String name, String address, LocalTime openTime,
                      LocalTime closeTime, float rating, String emailID,
                      int phoneNo, List<String> menu) {
        this.restaurantID = restaurantID;
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.rating = rating;
        this.emailID = emailID;
        this.phoneNo = phoneNo;
        this.menu = menu;
    }

    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantID=" + restaurantID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", rating=" + rating +
                ", emailID='" + emailID + '\'' +
                ", phoneNo=" + phoneNo +
                ", menu=" + menu +
                '}';
    }
}
