/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankimmutable.model;

import java.util.Objects;

/**
 *
 * @author chrisy
 */
public class Deposit implements ATMinter {
    
    private String AccountNumber;
     private String FirstName;
    private String LastName;
    private double Amount;
    
    
    private Deposit()
    {
        
    }
    
    private Deposit(Builder build)
    {
        AccountNumber = build.AccountNUmber; 
    }

   
    
    public static class Builder{
    private String AccountNUmber;
    private double Amount; 
    private String FirstName;
    private String LastName;
    
    public Builder(String AccountNumber)
    {
        this.AccountNUmber = AccountNUmber;
    }
    public Builder Deposite(double Amount)
    {
        Amount = Amount;
        return this;
    }
    public Builder FirstName(String Name)
    {
        FirstName = Name;
        return this;
    }
    public Builder LastName(String lName)
    {
        LastName = lName;
        return this;
    }
     public Deposit build(){
            return new Deposit(this);
        }
    
        
    }
    @Override
    public double Deposite() {
        return Amount;
        
    }
     @Override
    public String FirstName(){
        return FirstName;
        
    }

    @Override
    public String LastName() {
        return LastName;
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.AccountNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Deposit other = (Deposit) obj;
        if (!Objects.equals(this.AccountNumber, other.AccountNumber)) {
            return false;
        }
        return true;
    }

        
    
            

   
    
}
