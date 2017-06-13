package com.greglturnquist.payroll;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bartek on 14.06.17.
 */

@Table(name = "PERFORMANCES")
@Entity
public class Performance {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long performanceID;
    private String baseticketprice;
    private Date performancedate;
    @ManyToOne
    @JoinColumn(name = "PRODUCTIONID")
    private Production production;

    public Venue getVenue() {
        return venue;
    }

    @ManyToOne
    @JoinColumn(name = "VENUEID")
    private Venue venue;


    public Performance(){}
    public Performance(String basetickerprice, Date performancedate, Production production, Venue venue){
        this.baseticketprice = basetickerprice;
        this.performancedate = performancedate;
        this.production = production;
        this.venue = venue;
    }
}
