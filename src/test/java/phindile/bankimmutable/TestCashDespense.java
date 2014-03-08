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
import phindile.bankimmutable.model.ATMLog;
import phindile.bankimmutable.model.CashDespenser;
import phindile.bankimmutable.model.Money;

/**
 *
 * @author chrisy
 */
public class TestCashDespense {
    Money money;
    ATMLog log;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

   @Test
   public void CreatDespenserTest()throws Exception
   {
       CashDespenser cash = new CashDespenser.Builder(56654).CashonHand(this.money).Log(this.log).build();
       Assert.assertEquals(cash.getPin(), 56654);
       Assert.assertSame(cash.getCashonHand(),this.money);
       Assert.assertEquals(this.log,this.log);
   }
    @Test
   public void UpdateCreatDespenserTest()throws Exception
   {
       CashDespenser cash = new CashDespenser.Builder(76758).CashonHand(this.money).Log(this.log).build();
         Assert.assertEquals(cash.getPin(), 76758);
       Assert.assertSame(cash.getCashonHand(),this.money);
       Assert.assertEquals(this.log,this.log);
   }
   

    
}
