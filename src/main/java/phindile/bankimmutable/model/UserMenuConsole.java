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
public class UserMenuConsole {
    private String message;
    private String Readpin;
    private double Amount;
    
    private UserMenuConsole()
    {
        
    }
    private UserMenuConsole(Builder build)
    {
        message =build.message;
    }
    public static class Builder{
    private String message;
    private String Readpin;
    private double Amount;
    
    public Builder(String message)
    {
        this.message = message;
        
    }

        public Builder Readpin(String Readpin) {
            Readpin = Readpin;
            return this;
        }

        public Builder Amount(double Amount) {
            Amount = Amount;
            return this;
        }
        
        public  UserMenuConsole build()
        {
            return new  UserMenuConsole(this);
        }
    }

    public String getMessage() {
        return message;
    }
    

    public String getReadpin() {
        return Readpin;
    }

    public double getAmount() {
        return Amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Readpin);
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
        final UserMenuConsole other = (UserMenuConsole) obj;
        if (!Objects.equals(this.Readpin, other.Readpin)) {
            return false;
        }
        return true;
    }
    
    
  
    
}
