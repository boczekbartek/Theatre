package com.greglturnquist.payroll;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by bartek on 13.06.17.
 */
@Table(name = "VENUES")
@Entity
public class Venue {
    private @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long venueID;

    public String getName() {
        return name;
    }

    private String name;
    private String street;
    @ManyToOne
    @JoinColumn(name = "THEATREOFFICEID")
    private TheatreOffice theatreOffice;
    private String housenumber;
    private String zipcode;
    private String city;
    @OneToMany(mappedBy = "venue", cascade = CascadeType.ALL)
    private Set<Seat> seats;



    public TheatreOffice getTheatreOffice() {
        return theatreOffice;

    }

    public Venue(){}


    public Venue(String name, String street,TheatreOffice theatreOffice, String housenumber, String zipcode, String city){
        this.name = name;
        this.street = street;
        this.theatreOffice = theatreOffice;
        this.housenumber = housenumber;
        this.zipcode = zipcode;
        this.city = city;
    }
}
