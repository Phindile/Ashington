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
import phindile.bankimmutable.model.Withdrawal;

/**
 *
 * @author chrisy
 */
public class WithdrwalTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @Test
    public void CreateTest() throws Exception{
        Withdrawal draw = new Withdrawal.Builder(654654).Amount(7000).build();
        Assert.assertEquals(draw.getPin(),654654);
        Assert.assertEquals(7000, 7000);
    }
    @Test
    public void UpdateWithdrawal()throws Exception{
    Withdrawal draw = new Withdrawal.Builder(654).Amount(900).build();
        
    }


}
