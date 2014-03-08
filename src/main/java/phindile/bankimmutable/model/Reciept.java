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
public final class Reciept {
    private long AccountNumber;
    private String Surname;
    private int availableBalance;
    private int currentBalnce;
    
    public Reciept(){
        
    }
    private Reciept(Builder build){
        AccountNumber = build.AccountNumber;
    }
    public static class Builder{
    private long AccountNumber;
    private String Surname;
    private int availableBalance;
    private int currentBalnce;
    
    public Builder(long AccountNumber){
        this.AccountNumber = AccountNumber;
        
    }

        public Builder Surname(String Surname) {
            this.Surname = Surname;
            return this;
        }

        public Builder AvailableBalance(int availableBalance) {
            this.availableBalance = availableBalance;
            return this;
        }

        public Builder CurrentBalnce(int currentBalnce) {
            this.currentBalnce = currentBalnce;
            return this;
        }
        
      public Reciept build()
      {
          return new Reciept(this);
      }
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public int getCurrentBalnce() {
        return currentBalnce;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (this.AccountNumber ^ (this.AccountNumber >>> 32));
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
        final Reciept other = (Reciept) obj;
        if (this.AccountNumber != other.AccountNumber) {
            return false;
        }
        return true;
    }

  

    
    
    
}
