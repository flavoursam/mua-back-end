package mua.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

//@Entity
public class Bridal {

//    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String address;
    private String date;
    private String timeOfCeremony;
    private String arrivalTimeOfPhotographer;
    private int bride;
    private int numOfBridesmaids;
    private boolean motherOfBride;
    private String other;

    public Bridal(){}

    public Bridal(int id, String firstName, String lastName, String number, String email, String address, String date, String timeOfCeremony, String arrivalTimeOfPhotographer, int bride, int numOfBridesmaids, boolean motherOfBride) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        this.address = address;
        this.date = date;
        this.timeOfCeremony = timeOfCeremony;
        this.arrivalTimeOfPhotographer = arrivalTimeOfPhotographer;
        this.bride = bride;
        this.numOfBridesmaids = numOfBridesmaids;
        this.motherOfBride = motherOfBride;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeOfCeremony() {
        return timeOfCeremony;
    }

    public void setTimeOfCeremony(String timeOfCeremony) {
        this.timeOfCeremony = timeOfCeremony;
    }

    public String getArrivalTimeOfPhotographer() {
        return arrivalTimeOfPhotographer;
    }

    public void setArrivalTimeOfPhotographer(String arrivalTimeOfPhotographer) {
        this.arrivalTimeOfPhotographer = arrivalTimeOfPhotographer;
    }

    public int getBride() {
        return bride;
    }

    public void setBride(int bride) {
        this.bride = bride;
    }

    public int getNumOfBridesmaids() {
        return numOfBridesmaids;
    }

    public void setNumOfBridesmaids(int numOfBridesmaids) {
        this.numOfBridesmaids = numOfBridesmaids;
    }

    public boolean isMotherOfBride() {
        return motherOfBride;
    }

    public void setMotherOfBride(boolean motherOfBride) {
        this.motherOfBride = motherOfBride;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
