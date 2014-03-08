/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankimmutable.model;

/**
 *
 * @author chrisy
 */
public class CashDespenser {
    private int pin;
    private ATMLog log;
    private Money CashonHand;
    
    private CashDespenser(){
        
    }
    
    private CashDespenser(Builder build)
    {
        pin =build.pin;
    }
    
    public static class Builder{
    private int pin;
    private ATMLog log;
    private Money CashonHand;
    
    public Builder(int pin){
        this.pin = pin;
    }

        public Builder Log(ATMLog log) {
            this.log = log;
            return this;
        }

        public Builder CashonHand(Money CashonHand) {
            this.CashonHand = CashonHand;
            return this;
        }
        
        public CashDespenser build()
        {
            return new CashDespenser(this);
        }
    }

    public int getPin() {
        return pin;
    }

    public ATMLog getLog() {
        return log;
    }

    public Money getCashonHand() {
        return CashonHand;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.pin;
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
        final CashDespenser other = (CashDespenser) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    
    
}
