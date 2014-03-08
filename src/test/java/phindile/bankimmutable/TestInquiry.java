/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankimmutable;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.bankimmutable.model.ATMSession;
import phindile.bankimmutable.model.BankATM;
import phindile.bankimmutable.model.Card;
import phindile.bankimmutable.model.Inquiry;

/**
 *
 * @author chrisy
 */
public class TestInquiry {
    ATMSession ses;
    BankATM atm;
    Card card;
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreatTest()throws Exception{
        Inquiry in = new Inquiry.Builder(6546).Atm(this.atm).Card(this.card).Sess(this.ses).Card(this.card).build();
        Assert.assertEquals(in.getPin(),6546);
        Assert.assertEquals(this.atm,this.atm);
        Assert.assertEquals(this.ses,this.ses);
        Assert.assertEquals(this.card,this.card);
    }
    @Test
    public void UpdateCreateTes()throws Exception{
         Inquiry in = new Inquiry.Builder(654).Atm(this.atm).Card(this.card).Sess(this.ses).Card(this.card).build();
         Assert.assertEquals(in.getPin(),654);
        Assert.assertEquals(this.atm,this.atm);
        Assert.assertEquals(this.ses,this.ses);
        Assert.assertEquals(this.card,this.card);
    }

    
}
