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
public final class SavingsAccount {
    private String AccountNumber;
    private double Deposit;
    private String Name;
    private String Surname;
     private int pin;
    
    private SavingsAccount()
    {
        
    }
    
    private SavingsAccount(Builder build){
        AccountNumber = build.AccountNumber;
    
    }
    public static class Builder{
        
    private String AccountNumber;
    private int pin;
    private double Deposit;
    private String Name;
    private String Surname;
    
    public Builder(String AccountNumber)
    {
        this.AccountNumber = AccountNumber; 
    }
    public Builder Name (String Name){
        Name = Name;
        return this;
    }
     public Builder Pin (int pn){
       pin = pn;
        return this;
    }
    public Builder SurName (String SurName){
        Surname = SurName;
        return this;
    }
     public Builder Deposit (double Depo){
       Deposit= Depo;
        return this;
    }
      public Builder AccountNumber(String Account) {
            AccountNumber = Account;
            return this;
        }
     
      public SavingsAccount build(){
            return new SavingsAccount(this);
        }
    }

//      GETTERS///
    public String getName()
    {
        return Name;
    }

        public int getPin() {
            return pin;
        }
    
    public String getSurName(){
        return Surname;
    }
    public double getDeposit(){
        return Deposit;
    }

        public String getAccountNumber() {
            return AccountNumber;
        }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.pin;
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
        final SavingsAccount other = (SavingsAccount) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    
}
