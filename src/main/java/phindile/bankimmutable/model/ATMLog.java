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
public final class ATMLog {
    private ATMMessage message;
    private ATMStatus status;
    private Money amount;
    
    private ATMLog()
    {
        
    }
    
    private ATMLog(Builder build)
    {
        message =build.message;
    }
    public static class Builder{
    private ATMMessage message;
    private ATMStatus status;
    private Money amount;
    
    public Builder(ATMMessage message)
    {
        this.message = message;
    }

        public Builder Status(ATMStatus status) {
            this.status = status;
            return this;
        }

        public Builder Amount(Money amount) {
            this.amount = amount;
            return this;
        }
        public ATMLog build()
        {
            return new ATMLog(this);
        }
    }

    public ATMMessage getMessage() {
        return message;
    }

    public ATMStatus getStatus() {
        return status;
    }

    public Money getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.message);
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
        final ATMLog other = (ATMLog) obj;
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }
    
    
    
}
