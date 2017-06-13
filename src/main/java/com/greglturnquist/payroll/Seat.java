package com.greglturnquist.payroll;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by bartek on 14.06.17.
 */
@Table(name = "SEATS")
@Entity
public class Seat {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long seatID;

    public String getRowno() {
        return rowno;
    }

    public String getSeatno() {
        return seatno;
    }

    public Venue getVenue() {
        return venue;
    }

    private String rowno;
    private String seatno;
    @ManyToOne
    @JoinColumn(name = "VENUEID")
    private Venue venue;

    public Seat(){}

    public Seat(String rowNo, String seatNo, Venue venue){
        this.rowno = rowNo;
        this.seatno = seatNo;
        this.venue = venue;
    }

}
