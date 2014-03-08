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
public final class ATMSession {
    private  int pin;
    private int state;
    private int READING_CARD =1;
    private int Choosing_Trans=2;
    private int Performing_Trans_State=3;
    private int Ejecting=4;
    private int Final=6;
    
    private ATMSession()
    {
        
    }
    
    private ATMSession(Builder build)
    {
        pin = build.pin;
    }
    public static class Builder{
    private int pin;
    private int state;
    private int READING_CARD =1;
    private int Choosing_Trans=2;
    private int Performing_Trans_State=2;
    private int Ejecting=2;
    private int Final=6;
    
    public Builder(int pin)
    {
        this.pin = pin;
    }

        public  Builder State(int state) {
            this.state = state;
            return this;
        }

        public Builder READING_CARD(int READING_CARD) {
            this.READING_CARD = READING_CARD;
            return this;
        }

        public Builder Choosing_Trans(int Choosing_Trans) {
            this.Choosing_Trans = Choosing_Trans;
            return this;
        }

        public Builder Performing_Trans_State(int Performing_Trans_State) {
            this.Performing_Trans_State = Performing_Trans_State;
            return this;
        }

        public Builder Ejecting(int Ejecting) {
            this.Ejecting = Ejecting;
            return this;
        }

        public Builder Final(int Final) {
            this.Final = Final;
            return this;
        }
        public ATMSession build(){
            return new ATMSession(this);
        }
    }

    public int getPin() {
        return pin;
    }

    public int getState() {
        return state;
    }

    public int getREADING_CARD() {
        return READING_CARD;
    }

    public int getChoosing_Trans() {
        return Choosing_Trans;
    }

    public int getPerforming_Trans_State() {
        return Performing_Trans_State;
    }

    public int getEjecting() {
        return Ejecting;
    }

    public int getFinal() {
        return Final;
    }
   public void performSession()
   {
      //////////////////// 
   }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.pin;
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
        final ATMSession other = (ATMSession) obj;
        if (this.pin != other.pin) {
            return false;
        }
        return true;
    }
    
    
    
}
