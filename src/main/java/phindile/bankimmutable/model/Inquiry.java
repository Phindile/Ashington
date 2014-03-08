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
public final class Inquiry {
    private int from;
    private BankATM atm;
    private ATMSession sess;
    private int pin;
    private Card card;
    
    private Inquiry()
    {
        
    }
    private Inquiry(Builder build)
    {
        pin =build.pin;
    }
    public static class Builder{
    private int from;
    private BankATM atm;
    private ATMSession sess;
    private Card card;
    private int pin;
    
    public Builder(int pin)
    {
        this.pin =pin;
    }

        public Builder From(int from) {
            this.from = from;
            return this;
        }

        public Builder Card(Card card) {
            this.card = card;
            return this;
        }
        

        public Builder Atm(BankATM atm) {
            this.atm = atm;
            return this;
        }

        public Builder Sess(ATMSession sess) {
            this.sess = sess;
            return this;
        }
        public Inquiry build(){
            return new Inquiry(this);
        }
       } 

    public int getFrom() {
        return from;
    }

    public BankATM getAtm() {
        return atm;
    }

    public ATMSession getSess() {
        return sess;
    }

    public int getPin() {
        return pin;
    }

    public phindile.bankimmutable.model.Card getCard() {
        return card;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.pin;
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
        final Inquiry other = (Inquiry) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    

   
   

    
}
