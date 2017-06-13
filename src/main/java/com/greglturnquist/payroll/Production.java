package com.greglturnquist.payroll;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Data
@Table(name="PRODUCTIONS")
@Entity
public class Production {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long productionID;
    private String description;
    private String name;
    private String playwright;
    @OneToMany(mappedBy = "production", cascade = CascadeType.ALL)
    private Set<Performance> performances;

    private Production() {}

    Production(String name, String playwright, String description) {
        this.name = name;
        this.playwright = playwright;
        this.description = description;
    }

}
