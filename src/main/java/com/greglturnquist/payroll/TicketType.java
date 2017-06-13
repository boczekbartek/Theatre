package com.greglturnquist.payroll;

import javax.persistence.*;

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

    public String getType() {
        return type;
    }

    public TicketType(){}

    public TicketType(String type, String discount){
        this.type = type;
        this.discount = discount;
    }

}
