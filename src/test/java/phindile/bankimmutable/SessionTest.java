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
import phindile.bankimmutable.model.ATMSession;

/**
 *
 * @author chrisy
 */
public class SessionTest {
   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreatSession()throws Exception{
        ATMSession session = new ATMSession.Builder(657).Choosing_Trans(1).Ejecting(2).Performing_Trans_State(3).READING_CARD(5).Final(6).build();
        Assert.assertEquals(session.getPin(),session.getPin());
        Assert.assertEquals(session.getChoosing_Trans(),session.getChoosing_Trans() );
        Assert.assertEquals(session.getPerforming_Trans_State(),session.getPerforming_Trans_State());
        Assert.assertEquals(session.getREADING_CARD(),session.getREADING_CARD());
        Assert.assertEquals(session.getEjecting(),session.getEjecting());
        Assert.assertEquals(session.getFinal(), session.getFinal());
    }
    @Test
    public void Update()throws Exception{
         ATMSession session = new ATMSession.Builder(57).Choosing_Trans(1).Ejecting(2).Performing_Trans_State(3).READING_CARD(5).Final(6).build();
         Assert.assertEquals(session.getPin(),session.getPin());
        Assert.assertEquals(session.getChoosing_Trans(),session.getChoosing_Trans() );
        Assert.assertEquals(session.getPerforming_Trans_State(),session.getPerforming_Trans_State());
        Assert.assertEquals(session.getREADING_CARD(),session.getREADING_CARD());
        Assert.assertEquals(session.getEjecting(),session.getEjecting());
        Assert.assertEquals(session.getFinal(), session.getFinal());
        
    }

}
