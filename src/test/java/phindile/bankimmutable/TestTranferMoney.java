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
import phindile.bankimmutable.model.TranferMoney;

/**
 *
 * @author chrisy
 */
public class TestTranferMoney {
    
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
   public void CreateTest()throws Exception{
      TranferMoney money = new TranferMoney.Builder("123456").Tamount(900).Pin("1234").NameTO("Pizzy").NameFrome("Sizwe").build();
     Assert.assertEquals("123456", "123456");
     Assert.assertEquals("Sizwe", "Sizwe");
     Assert.assertEquals("Pizzy", "Pizzy");
    
      
   }
   @Test
    public void UpDateTest()throws Exception{
      TranferMoney money = new TranferMoney.Builder("7465746").Pin("2033").NameFrome("Akon").NameTO(" FF").Tamount(900).build();
     Assert.assertEquals("123456", "123456");
     Assert.assertEquals("Sizwe", "Sizwe");
    }
}
