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
public class Balance {
    
    private Money total;
    private Money availabe;
    
    private Balance()
    {
        
    }
    private Balance(Builder build)
    {
        total = build.total;
    }
    public static class Builder{
    private Money total;
    private Money availabe;
    
    public Builder(Money total)
    {
        this.total = total;
    }

        public Builder Availabe(Money availabe) {
            availabe = availabe;
          return this;
        }
        
        public Balance build()
        {
            return new Balance(this);
        }
        
    }

    public Money getTotal() {
        return total;
    }

    public Money getAvailabe() {
        return availabe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.availabe);
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
        final Balance other = (Balance) obj;
        if (!Objects.equals(this.availabe, other.availabe)) {
            return false;
        }
        return true;
    }
    
    
}
