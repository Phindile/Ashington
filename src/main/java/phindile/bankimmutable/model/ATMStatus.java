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
public final class ATMStatus {
    private long pin;
    
    private ATMStatus()
    {
        
    }
    private ATMStatus(Builder build)
    {
        pin = build.pin;
    }

   

    
    public static class Builder{
        private long pin;
        
        public Builder(long pin)
        {
            this.pin = pin;
        }
        
        public ATMStatus build()
        {
            return new ATMStatus(this);
        }

       
    }

    public long getPin() {
        return pin;
    }
  
    public String toString()
    {
        if(isSucced())
        
            return "SUCCESS";
        
        else if(isInvalid())
        
           return "InvalidPin";
        else
            return "failure";
       
      
    }

    public  boolean isSucced()
    {
        return true;
    }
    public  boolean isInvalid()
    {
        return false;
    }
    
 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (this.pin ^ (this.pin >>> 32));
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
        final ATMStatus other = (ATMStatus) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    
    
    
   
    
    
    
    
    
}
