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
public class ATMOperator {
    
    private int pin ;
    private BankATM atm;
    private Money money;
    private ATMOperator()
    {
        
    }
    private ATMOperator(Builder build)
    {
        atm =build.atm;
    }
    public static class Builder{
    private BankATM atm;
    private Money money;
    private int pin ;
    
    public Builder(BankATM atm)
    {
        this.atm = atm;
    }

        public Builder Money(Money money) {
            this.money = money;
            return this;
        }

        public Builder Pin(int pin) {
            this.pin = pin;
            return this;
        }
    
    public ATMOperator build()
    {
        return new ATMOperator(this);
    }
   }

    public BankATM getAtm() {
        return atm;
    }

    public Money getMoney() {
        return money;
    }

    public int getPin() {
        return pin;
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
        final ATMOperator other = (ATMOperator) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    
    
    
}
