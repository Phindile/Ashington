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
public final class Card {
    private int cardnumber;
    
    private Card()
    {
        
    }
    private Card(Builder build)
    {
        cardnumber = build.cardnumber;
    }
    public static class Builder{
        private int cardnumber;
      
     public Builder(int cardnumber)
     {
         this.cardnumber = cardnumber;
     }
     public Card build(){
         return new Card(this);
     }
    }

    public int getCardnumber() {
        return cardnumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.cardnumber;
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
        final Card other = (Card) obj;
        if (this.cardnumber != other.cardnumber) {
            return false;
        }
        return true;
    }
    
    
}
