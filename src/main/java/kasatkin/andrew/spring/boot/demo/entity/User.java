package kasatkin.andrew.spring.boot.demo.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Drew on 29.10.2017.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int user_id;

//    @NotNull
//    @Pattern(regexp = "^[a-zA-Z0-9_-]{3,16}$")
//    @Column(name = "username", unique = true)
    private String username;

//    @NotNull
//    @Size(min = 6, max = 30)
//    @Column(name = "password")
    private String password;


//    @Email
//    @Column(name = "email", unique = true)
    private String email;

//    @NotNull
//    @Size(min = 2, max = 20)
//    @Column(name = "firstname")
    private String firstname;

//    @NotNull
//    @Size(min = 2, max = 20)
//    @Column(name = "lastname")
    private String lastname;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
