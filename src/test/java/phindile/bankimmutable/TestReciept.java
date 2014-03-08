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
import phindile.bankimmutable.model.Reciept;

/**
 *
 * @author chrisy
 */
public class TestReciept {
    
   
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

   @Test
   public void CreatRecieptTest()throws Exception{
       Reciept res = new Reciept.Builder(34355633).Surname("Mposwa").AvailableBalance(60000).CurrentBalnce(55000).build();
       Assert.assertEquals(34355633, 34355633, "Th Account Number is Not Correct");
       Assert.assertEquals("Mposwa", "Mposwa");
       Assert.assertEquals(60000, 60000);
       Assert.assertEquals(55000, 55000);
       
   }
   @Test
   public void UpdateTest()throws Exception{
       Reciept res = new Reciept.Builder(355633).Surname("Mposwa").AvailableBalance(600).CurrentBalnce(55000).build();
       
   }
}
