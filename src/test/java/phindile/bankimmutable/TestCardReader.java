/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.bankimmutable;

import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.bankimmutable.model.BankATM;
import phindile.bankimmutable.model.Card;
import phindile.bankimmutable.model.CardReader;

/**
 *
 * @author chrisy
 */
public class TestCardReader {
    BankATM atm;
    
    public TestCardReader() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

   @Test
   public void CreatCardReaderTest()throws Exception
   {
       
      CardReader c_reader =new CardReader.Builder(this.atm).build();
      Assert.assertEquals(this.atm, atm);
   }
   @Test
    public void UpdateCreatCardReaderTest()throws Exception
   {
       
      CardReader c_reader =new CardReader.Builder(atm).build();
       Assert.assertEquals(this.atm, atm);
  
   }
   
}
