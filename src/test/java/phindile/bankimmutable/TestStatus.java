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
import phindile.bankimmutable.model.ATMStatus;

/**
 *
 * @author chrisy
 */
public class TestStatus {
    
  
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreatTest() throws Exception{
        ATMStatus state = new ATMStatus.Builder(7577).build();
        Assert.assertEquals(state.getPin(),7577);
    }
    @Test
    public void UpCreatTest() throws Exception{
        ATMStatus state = new ATMStatus.Builder(7575).build();
     
    }

}
