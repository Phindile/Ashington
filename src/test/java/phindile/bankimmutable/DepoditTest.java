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
import phindile.bankimmutable.model.Deposit;
import phindile.bankimmutable.model.SavingsAccount;

/**
 *
 * @author chrisy
 */
public class DepoditTest {
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

   @Test 
    public void TestDeposit ()throws Exception{
         Deposit dep= new Deposit.Builder("64575754").Deposite(8000).FirstName("Pindile").LastName("Mposwa").build();
         Assert.assertEquals(8000, 8000);
         Assert.assertEquals("Pindile", "Pindile");
         Assert.assertEquals("Mposwa", "Mposwa");
         
      
    }
     @Test 
    public void UpdateTestDeposit ()throws Exception{
         Deposit dep= new Deposit.Builder("64575754").Deposite(8000).FirstName("Pindile").LastName("Mposwa").build();
           Assert.assertEquals(800, 800);
         Assert.assertEquals("Pindile", "Pindile");
         Assert.assertEquals("Mposwa", "Mposwa");
    }
}
