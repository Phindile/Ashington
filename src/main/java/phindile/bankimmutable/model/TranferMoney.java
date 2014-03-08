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
public final class TranferMoney {
    private String AccountTO;
    private double Tamount;
    private String pin;
    private String NameFrome;
    private String NameTO;
    
    private TranferMoney()
    {
        
    }
    private TranferMoney(Builder build)
    {
        AccountTO = build.AccountTO;
      
    }
    public static class Builder{
        
    private String AccountTO;
    private double Tamount;
    private String pin;
    private String NameFrome;
    private String NameTO;   
    
    public Builder(String AccountTO)
    {
        this.AccountTO = AccountTO;
    }

       

        public Builder Tamount(double Tam) {
            Tamount = Tam;
            return this;
        }

        public Builder Pin(String pn) {
            pin = pn;
            return this;
        }

        public Builder NameFrome(String NameFrom) {
            NameFrome = NameFrom;
            return this;
        }

        public Builder NameTO(String NameT) {
            NameTO = NameT;
            return this;
        }
        public TranferMoney build(){
            return new TranferMoney(this);
        }

        /////
    }

    public String getAccountTO() {
        return AccountTO;
    }

        public double getTamount() {
            return Tamount;
        }

        public String getPin() {
            return pin;
        }

        public String getNameFrome() {
            return NameFrome;
        }

        public String getNameTO() {
            return NameTO;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 23 * hash + Objects.hashCode(this.pin);
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
            final Builder other = (Builder) obj;
            if (!Objects.equals(this.pin, other.pin)) {
                return false;
            }
            return true;
        }
        
        
    
}
