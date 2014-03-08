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
public final class EnvolopAcceptor {
    private ATMLog log;
    
    private EnvolopAcceptor()
    {
        
    }
    
    private EnvolopAcceptor(Builder build){
        
        log = build.log;
        
    }
    
    public static class Builder{
        private ATMLog log;
        
        public Builder(ATMLog log)
        {
            this.log = log;
        }
       public EnvolopAcceptor build()
       {
           return new EnvolopAcceptor  (this);
       }
        
    }

    public ATMLog getLog() {
        return log;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.log);
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
        final EnvolopAcceptor other = (EnvolopAcceptor) obj;
        if (!Objects.equals(this.log, other.log)) {
            return false;
        }
        return true;
    }
    

}
