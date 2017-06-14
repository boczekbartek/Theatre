package com.greglturnquist.payroll;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by bartek on 14.06.17.
 */
@Table(name = "TICKETTYPES")
@Entity
public class TicketType {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long tickettypeID;
    private String type;
    private String discount;
    @OneToMany(mappedBy = "ticketType", cascade = CascadeType.ALL)
    private Set<Ticket> tickets;
    public String getType() {
        return type;
    }

    public TicketType(){}

    public TicketType(String type, String discount){
        this.type = type;
        this.discount = discount;
    }

}
