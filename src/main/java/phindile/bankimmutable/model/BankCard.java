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
public class BankCard {
    
   
    private String AccountNumber;
     private int CardNumber;
    
    private BankCard(){
        
      }
    private BankCard(Builder build){
        CardNumber = build.CardNumber;
        
    }
    public static class Builder{
      private int CardNumber;
      private String AccountNumber;
      
     public Builder(int CardNumber){
          
        this.CardNumber = CardNumber;
      }
     public Builder AccountNumber(String AccountNumber)
     {
         AccountNumber = AccountNumber;
         return this;
     }
     public BankCard build(){
         return new BankCard(this);
     }
        
    }
     public int getCardNumber() {
            return CardNumber;
        }
     public String getAccountNumber()
     {
         return AccountNumber;
     }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.CardNumber;
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
        final BankCard other = (BankCard) obj;
        if (this.CardNumber != other.CardNumber) {
            return false;
        }
        return true;
    }

    
    
}
