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
public class ATMMessage {
    private int MessageCode;
    private int SerialNumber;
    private int fromAccount;
    private int ToAccount;
    private int Amount;
    private int pin;
    private Card card;
    
    private ATMMessage()
    {
        
    }
    
    private ATMMessage(Builder build)
    {
        MessageCode= build.MessageCode;
    }
    public static class Builder{
    private int MessageCode;
    private int SerialNumber;
    private int fromAccount;
    private int ToAccount;
    private int Amount;
    private int pin;
    private Card card;
    
    public Builder(int MessageCode)
    {
        this.MessageCode = MessageCode;

    }

        public Builder SerialNumber(int SerialNumber) {
            this.SerialNumber = SerialNumber;
            return this;
        }

        public Builder FromAccount(int fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder ToAccount(int ToAccount) {
            this.ToAccount = ToAccount;
            return this;
        }

        public Builder Amount(int Amount) {
            this.Amount = Amount;
            return this;
        }

        public  Builder Pin(int pin) {
            this.pin = pin;
            return this;
        }

        public Builder Card(Card card) {
            this.card = card;
            return this;
        }
        public ATMMessage build()
        {
            return new ATMMessage(this);
        }
    }

    public int getMessageCode() {
        return MessageCode;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public int getFromAccount() {
        return fromAccount;
    }

    public int getToAccount() {
        return ToAccount;
    }

    public int getAmount() {
        return Amount;
    }

    public int getPin() {
        return pin;
    }

    public phindile.bankimmutable.model.Card getCard() {
        return card;
    }
    

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 67 * hash + this.pin;
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
            if (this.pin != other.pin) {
                return false;
            }
            return true;
        }
       
        
    }
    
    

