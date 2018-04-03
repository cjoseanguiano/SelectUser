package user.select.carlosanguiano.selectuser.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseModel  implements Serializable{

    @SerializedName("website")
    private String website;
//
//    @SerializedName("address")
//    private List<Address> address = new ArrayList<>();

    @SerializedName("phone")
    private String phone;

    @SerializedName("name")
    private String name;
//
//    @SerializedName("company")
//    private List<Company> company = new ArrayList<>();

    /*@SerializedName("data")
    public List<Datum> data = new ArrayList<>();*/

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    @SerializedName("username")
    private String username;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}

//class Address implements Serializable{
//
//    @SerializedName("zipcode")
//    private String zipcode;
//
//    @SerializedName("geo")
//    private Geo geo;
//
//    @SerializedName("suite")
//    private String suite;
//
//    @SerializedName("city")
//    private String city;
//
//    @SerializedName("street")
//    private String street;
//}

//class Company implements Serializable{
//
//    @SerializedName("bs")
//    private String bs;
//
//    @SerializedName("catchPhrase")
//    private String catchPhrase;
//
//    @SerializedName("name")
//    private String name;
//}

class Geo implements Serializable{

    @SerializedName("lng")
    private String lng;

    @SerializedName("lat")
    private String lat;
}