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
public class Money {
    private long cents;
    private int dollers;
    
    private Money(){
        
    }
    
    private Money(Builder build)
    {
        cents = build.cents;
    }
    public static class Builder{
        private long cents;
        private int dollers;
        private Money amntadd;
        private Money amntsubtract;
        public Builder(int cents)
        {
            this.cents = cents;
        }

        public Builder Dollers(int dollers) {
            this.dollers = dollers;
            return this;
        }
        public Builder add(Money amntadd)
        {
            this.cents += amntadd.cents;
            return this;
        }
        public Builder Subtract(Money amntsubtract)
        {
            this.cents -= amntsubtract.cents;
            return this;
        }
        public  Builder  lessequal(Money compareTo)
        {
            this.cents = compareTo.cents;
            return this;
        }
        
        public Money buolder()
        {
            return new Money(this);
        }
    }

        public long getCents() {
            return cents;
        }

        public int getDollers() {
            return dollers;
        }
        /////Fucntions

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 47 * hash + (int) (this.cents ^ (this.cents >>> 32));
            hash = 47 * hash + this.dollers;
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
            if (this.cents != other.cents) {
                return false;
            }
            if (this.dollers != other.dollers) {
                return false;
            }
            return true;
        }
        
        
    
            
    
}
