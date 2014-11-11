package fr.univ.blois.siad.m1.javaee.jpa.ex03;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "USER")
public class User {
    @Id
    private Long id;

    private Identification identification;

    private Address address;

    private UserRules userRules;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
