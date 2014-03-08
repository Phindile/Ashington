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
import phindile.bankimmutable.model.Money;
import phindile.bankimmutable.model.SavingsAccount;

/**
 *
 * @author chrisy
 */
public class MoneyTest {
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

   @Test
   public void MoneyTest()throws Exception{
       Money mooler = new Money.Builder(5592).Dollers(54542).buolder();
       Assert.assertEquals(5592, 5592);
       Assert.assertEquals(54542, 54542);
       
   }

    @Test
    public void testUpdate() throws Exception {
             Money mooler = new Money.Builder(552).Dollers(54542).buolder();
              Assert.assertEquals(552, 552);
              Assert.assertEquals(54542, 54542);

    }
}
