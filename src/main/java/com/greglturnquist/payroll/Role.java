//package com.greglturnquist.payroll;
//
//import javax.persistence.*;
//
///**
// * Created by bartek on 14.06.17.
// */
//@Table(name = "ROLES")
//public class Role {
//    private @Id
//    @GeneratedValue
//    Long roleID;
//
//    public String getCharactername() {
//        return charactername;
//    }
//
//    private String charactername;
//    @ManyToOne
//    @JoinColumn(name = "PRODUCTIONID")
//    private Production production;
//
//    public Role(){}
//
//    public Role(String charactername, Production production){
//        this.charactername = charactername;
//        this.production = production;
//    }
//}
