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
import phindile.bankimmutable.model.Balance;
import phindile.bankimmutable.model.BankCard;
import phindile.bankimmutable.model.Money;

/**
 *
 * @author chrisy
 */
public class BalanceTest {
      Money mooler ;
   
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Test
    public void BalanceTest()throws Exception{
      
        Balance  bal = new Balance.Builder(this.mooler).Availabe(this.mooler).build();
        Assert.assertEquals(this.mooler, this.mooler);
        Assert.assertEquals(this.mooler,this.mooler);
        
    }
     @Test
    public void testUpdate() throws Exception {
        Balance  bal = new Balance.Builder(this.mooler).Availabe(this.mooler).build();
    }
}
