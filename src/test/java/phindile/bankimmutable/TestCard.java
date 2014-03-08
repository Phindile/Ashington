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
import phindile.bankimmutable.model.Card;

/**
 *
 * @author chrisy
 */
public class TestCard {
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void CreateCardTest()throws Exception{
        Card  card = new Card.Builder(5694).build();
        Assert.assertEquals(card.getCardnumber(), 5694);
    }
    @Test
    public void UpadteCreateCardTest()throws Exception{
        Card  card = new Card.Builder(788).build();
        Assert.assertEquals(card.getCardnumber(), 788);
    }

}
