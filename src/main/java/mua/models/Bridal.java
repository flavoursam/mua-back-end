package mua.models;

import javax.persistence.*;


@Entity
@Table(name = "bridal")
public class Bridal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "mobile")
    private Long mobile;

    @Column(name = "email")
    private String email;

    public Bridal(){}

    public Bridal(String fullName, Long mobile, String email) {
        this.fullName = fullName;
        this.mobile = mobile;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setNumber(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
