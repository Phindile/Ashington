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
import phindile.bankimmutable.model.ATMLog;
import phindile.bankimmutable.model.EnvolopAcceptor;

/**
 *
 * @author chrisy
 */
public class TestEnvelop {
    ATMLog log;
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreatTest()throws Exception{
        EnvolopAcceptor env = new EnvolopAcceptor.Builder(this.log).build();
        Assert.assertEquals(env.getLog(),this.log);
    }
    @Test
    public void UpdateCreatTest()throws Exception{
        EnvolopAcceptor env = new EnvolopAcceptor.Builder(this.log).build();
        Assert.assertEquals(env.getLog(),this.log);
     
    }
}
