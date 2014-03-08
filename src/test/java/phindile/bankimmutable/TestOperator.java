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
import phindile.bankimmutable.model.ATMOperator;
import phindile.bankimmutable.model.BankATM;
import phindile.bankimmutable.model.Money;

/**
 *
 * @author chrisy
 */
public class TestOperator {
    BankATM atm;
    Money mon;
  

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
   @Test
   public void CreateTestOperator()throws Exception{
     ATMOperator op = new ATMOperator.Builder(this.atm).Money(this.mon).Pin(5857).build();
     Assert.assertEquals(this.atm,op.getAtm());
     Assert.assertEquals(op.getPin(),op.getPin());
     Assert.assertSame(this.mon,op.getMoney());
       
   }
    @Test
   public void UpdateCreateTestOperator()throws Exception{
     ATMOperator op = new ATMOperator.Builder(this.atm).Money(this.mon).Pin(557).build();
    
       
   }
}
