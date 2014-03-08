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
import phindile.bankimmutable.model.ATMLog;
import phindile.bankimmutable.model.ATMMessage;
import phindile.bankimmutable.model.ATMStatus;
import phindile.bankimmutable.model.Money;

/**
 *
 * @author chrisy
 */
public class TestLog {
    Money mon;
    ATMStatus state;
    ATMMessage mess;
    
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreateLogTest()throws Exception{
        ATMLog log = new ATMLog.Builder(this.mess).Status(this.state).Amount(this.mon).build();
        Assert.assertEquals(this.mess, this.mess);
        Assert.assertSame(this.state, state);
        Assert.assertSame(this.mon,this.mon);
    }
    public void UpdateCreatTest()throws Exception{
        ATMLog log = new ATMLog.Builder(this.mess).Status(this.state).Amount(this.mon).build();
        Assert.assertEquals(this.mess, this.mess);
        Assert.assertSame(this.state, state);
        Assert.assertSame(this.mon,this.mon);
      
        
    }

  
}
