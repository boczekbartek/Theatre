package com.greglturnquist.payroll;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by bartek on 14.06.17.
 */
@Table(name = "EMPLOYEES")
@Entity
public class Employee {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long employeeID;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private Date birthdate;
    private String street;
    private String housenumber;
    private String zipcode;
    private String city;
    private String phonenumber;
    @ManyToOne
    @JoinColumn(name = "THEATREOFFICEID")
    private TheatreOffice theatreOffice;
    @ManyToOne
    @JoinColumn(name = "PROFESSIONID")
    private Profession profession;

    public Employee(){}

    public Employee(String firstname, String middlename, String lastname, String gender, Date birthdate,
                    String street, String housenumber, String zipcode, String city, String phonenumber){
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.street = street;
        this.housenumber = housenumber;
        this.zipcode = zipcode;
        this.city = city;
        this.phonenumber = phonenumber;
    }
}
