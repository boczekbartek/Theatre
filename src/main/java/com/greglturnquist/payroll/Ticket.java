package com.greglturnquist.payroll;

import javax.persistence.*;
import java.util.Date;


@Table(name = "TICKETS")
@Entity
public class Ticket {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ticketID;
    private Date timeissued;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEEID")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "SEATID")
    private Seat seat;
    @ManyToOne
    @JoinColumn(name = "PERFORMANCEID")
    private Performance performance;
    public TicketType getTicketType() {
        return ticketType;
    }
    @ManyToOne
    @JoinColumn(name = "TICKETTYPEID")
    private TicketType ticketType;




    public Ticket(){}

    public Ticket(Date timeissued, Employee employee, Seat seat, Performance performance, TicketType ticketType){
        this.timeissued = timeissued;
        this.employee = employee;
        this.seat = seat;
        this.performance = performance;
        this.ticketType = ticketType;
    }
}
