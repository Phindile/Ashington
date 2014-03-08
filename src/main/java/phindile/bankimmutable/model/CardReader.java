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
public  final class CardReader {
    private BankATM atm;
    
    private CardReader()
    {
        
    }
    private CardReader(Builder build)
    {
        atm = build.atm;
    }
    public static class Builder{
        private BankATM atm;
        
        public Builder(BankATM atm)
        {
            this.atm = atm;
        }
        public CardReader build(){
            return new CardReader(this);
        }
    } 

    public BankATM getAtm() {
        return atm;
    }

//   ///Function
//    public abstract Card ReadCard();
//    public  abstract void EjectCard();
//    public abstract void ReatainCard();
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.atm);
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
        final CardReader other = (CardReader) obj;
        if (!Objects.equals(this.atm, other.atm)) {
            return false;
        }
        return true;
    }
    
    
}
