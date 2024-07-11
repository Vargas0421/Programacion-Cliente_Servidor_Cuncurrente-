package com.mycompany.proyectoclienteservidor;

public abstract class Persona {

        protected int id;
        protected String name;
        protected String lastName;
        protected String addres;
        protected String email;
        protected double monyOnTheAccount;
        protected formPay formOfPay;
    
    public enum formPay{
        cash,
        bankTrnsfer,
        card,
    }      
    
}
