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
import phindile.bankimmutable.model.SavingsAccount;

/**
 *
 * @author chrisy
 */
public class BankSavingsTest {
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test 
    public void TestSavings ()throws Exception{
        SavingsAccount save = new SavingsAccount.Builder("123456").Name("Pindile").Pin(90).Deposit(700).SurName("Mposwa").build();
        Assert.assertEquals(save.getName(),save.getName());
        Assert.assertEquals(90,90);
        Assert.assertEquals(70,70);
        Assert.assertEquals("Mposwa","Mposwa");
    }
    @Test
    public void testUpdate() throws Exception {
      SavingsAccount save = new SavingsAccount.Builder("123456").Name("Akon").Pin(90).Deposit(700).SurName("Mposwa").build();
        Assert.assertEquals(save.getName(),save.getName());
        Assert.assertEquals(90,90);
        Assert.assertEquals(760,760);
        Assert.assertEquals("Mposwa","Mposwa");
    }
}


