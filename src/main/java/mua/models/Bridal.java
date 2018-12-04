package mua.models;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Table(name = "bridal")
public class Bridal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "number")
    private BigInteger number;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "date")
    private String date;

    @Column(name = "timeOfCeremony")
    private String timeOfCeremony;

    @Column(name = "arrivalTimeOfPhotographer")
    private String arrivalTimeOfPhotographer;

    @Column(name = "bride")
    private int bride;

    @Column(name = "numOfBridesmaids")
    private int numOfBridesmaids;

    @Column(name = "motherOfBride")
    private boolean motherOfBride;

    @Column(name = "other")
    private String other;

    public Bridal(){}

    public Bridal(String firstName, String lastName, BigInteger number, String email, String address, String date, String timeOfCeremony, String arrivalTimeOfPhotographer, int bride, int numOfBridesmaids, boolean motherOfBride, String other) {
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
        this.other = other;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
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
