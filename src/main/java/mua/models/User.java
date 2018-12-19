package mua.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {

    @Id
    private String email;

    private String mobile;

    private String firstName;

    private String lastName;

}
