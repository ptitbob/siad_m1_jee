package fr.univ.blois.siad.m1.javaee.jpa.ex01.domain;

import javax.persistence.*;

/**
 * Created by francois on 13/11/14.
 */
@TableGenerator(name="PERSON_TABLE_GENERATOR",
        table="SEQUENCE_GENERATOR_TABLE",
        pkColumnName= "SEQUENCE_NAME",
        valueColumnName= "SEQUENCE_VALUE",
        pkColumnValue= "PERSON_SEQUENCE")
@Entity
public class Person {

    @Id
    @Column(name = "PERSON_ID")
    @GeneratedValue(strategy=GenerationType.TABLE,
            generator= "PERSON_TABLE_GENERATOR")
    private Long id;

    @Column(name = "PERSON_NAME")
    private String name;

    @Column(name = "PERSON_SURNAME")
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
