/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankimmutable;

import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.bankimmutable.model.BankATM;

/**
 *
 * @author chrisy
 */
public class TestBankATM {
    
    public TestBankATM() {
    }

   
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
  @Test
  public void CreatBabkTest()throws Exception{
      BankATM  atm = new BankATM.Builder("Pizzy's Bank ").AtmID(657).Place("OBS").BankAddress(null).build();
      Assert.assertEquals(atm.getBankname(), "Pizzy's Bank ");
      Assert.assertEquals(atm.getAtmID(),atm.getAtmID());
      Assert.assertEquals(atm.getAtmID(),atm.getAtmID());
      Assert.assertEquals(atm.getPlace(), atm.getPlace());
      
  }
   @Test
  public void updateCreatBabkTest()throws Exception{
      BankATM  atm = new BankATM.Builder("Pizzy Bank ").AtmID(657).Place("HoodStock").BankAddress(null).build();
      Assert.assertEquals(atm.getBankname(), "Pizzy Bank ");
      Assert.assertEquals(atm.getAtmID(),atm.getAtmID());
      Assert.assertEquals(atm.getAtmID(),atm.getAtmID());
      Assert.assertEquals(atm.getPlace(), atm.getPlace());
      
  }
    
}
