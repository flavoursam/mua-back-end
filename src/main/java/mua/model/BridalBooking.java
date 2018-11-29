package mua.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

@Entity
public class BridalBooking {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private long number;
    private String email;
    private String address;
    private Date date;
    private LocalTime timeOfCeremony;
    private LocalTime arrivalTimeOfPhotographer;
    private int bride;
    private int numOfBridesmaids;
    private boolean motherOfBride;
    private String other;

    public BridalBooking(UUID id, String firstName, String lastName, long number, String email, String address, Date date, LocalTime timeOfCeremony, LocalTime arrivalTimeOfPhotographer, int bride, int numOfBridesmaids, boolean motherOfBride) {
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getTimeOfCeremony() {
        return timeOfCeremony;
    }

    public void setTimeOfCeremony(LocalTime timeOfCeremony) {
        this.timeOfCeremony = timeOfCeremony;
    }

    public LocalTime getArrivalTimeOfPhotographer() {
        return arrivalTimeOfPhotographer;
    }

    public void setArrivalTimeOfPhotographer(LocalTime arrivalTimeOfPhotographer) {
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
