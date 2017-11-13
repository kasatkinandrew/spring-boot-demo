package kasatkin.andrew.spring.boot.demo.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

/**
 * Created by Drew on 13.11.2017.
 */
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int role_id;

    @Column(name = "role_name")
    private String role_name;


    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
