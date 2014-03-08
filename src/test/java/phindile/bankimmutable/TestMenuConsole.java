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
import phindile.bankimmutable.model.UserMenuConsole;

/**
 *
 * @author chrisy
 */
public class TestMenuConsole {
    
    public TestMenuConsole() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreateMenuTest()throws Exception{
        UserMenuConsole user =new UserMenuConsole.Builder("Thank For Banking With Us").Readpin("75553").Amount(700).build();
        Assert.assertEquals(user.getMessage(),user.getMessage());
        Assert.assertEquals(user.getReadpin(), user.getReadpin());
        Assert.assertEquals(user.getAmount(), user.getAmount(),700);
        
    }
    @Test
    public void UpdateMenu()throws Exception{
        UserMenuConsole user =new UserMenuConsole.Builder("It is a Pleasure to Bank with you").Readpin("75553").Amount(700).build();
        
        
    }
   
}
