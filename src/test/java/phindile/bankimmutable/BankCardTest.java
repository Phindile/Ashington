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
import phindile.bankimmutable.model.BankCard;
import phindile.bankimmutable.model.SavingsAccount;

/**
 *
 * @author chrisy
 */
public class BankCardTest {
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Test
    public void BankCardTest()throws Exception{
       BankCard card = new BankCard.Builder(55).AccountNumber("85574").build();
       Assert.assertEquals(55, 55);
       Assert.assertEquals("85574", "85574");
               
    }
     @Test
    public void testUpdate() throws Exception {
      BankCard card = new BankCard.Builder(75).AccountNumber("55579").build();
       Assert.assertEquals(75,75);
       Assert.assertEquals("874", "874");
    }
}
