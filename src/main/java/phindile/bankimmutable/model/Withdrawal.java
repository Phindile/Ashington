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
public class Withdrawal {
    private long pin;
    private long Amount;
    
    private Withdrawal()
    {
        
    }
    
    public Withdrawal(Builder build)
    {
        pin = build.pin;
    }
    
    public static class Builder{
        private long pin;
        private long Amount;
        
        public Builder(long pin)
        {
            this.pin = pin;
        }

        public Builder Amount(long Amount) {
            this.Amount = Amount;
            return this;
        }
        public Withdrawal build()
        {
            return new Withdrawal(this);
        }
    }

    public long getPin() {
        return pin;
    }

    public long getAmount() {
        return Amount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (this.pin ^ (this.pin >>> 32));
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
        final Withdrawal other = (Withdrawal) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    
    
}
