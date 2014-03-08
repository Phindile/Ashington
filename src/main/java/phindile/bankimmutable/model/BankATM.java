/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankimmutable.model;

import java.net.InetAddress;

/**
 *
 * @author chrisy
 */
public final class BankATM {
    
    private int atmID;
    private String Bankname;
    private String place;
    private InetAddress bankAddress;
    
    private BankATM()
    {
        
    }
    
    private BankATM(Builder build)
    {
        Bankname = build.Bankname;
    }
    public static class Builder{
    private int atmID;
    private String Bankname;
    private String place;
    private InetAddress bankAddress;
    
    public Builder(String Bankname)
    {
        this.Bankname = Bankname;
    }

        public Builder AtmID(int atmID) {
            atmID = atmID;
            return this;
        }

        public Builder Place(String place) {
            place = place;
            return this;
        }

        public Builder BankAddress(InetAddress bankAddress) {
            bankAddress = bankAddress;
            return this;
            
        }
        
        public BankATM build()
        {
            return new BankATM(this);
        }
    }

    public int getAtmID() {
        return atmID;
    }

    public String getBankname() {
        return Bankname;
    }

    public String getPlace() {
        return place;
    }

    public InetAddress getBankAddress() {
        return bankAddress;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.atmID;
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
        final BankATM other = (BankATM) obj;
        if (this.atmID != other.atmID) {
            return false;
        }
        return true;
    }
    
    
    
}
