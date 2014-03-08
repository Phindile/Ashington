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
import phindile.bankimmutable.model.ATMMessage;
import phindile.bankimmutable.model.Card;

/**
 *
 * @author chrisy
 */
public class TestMessage {
    Card card;
    
    public TestMessage() {
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
    public void CreateTestMessage()throws Exception{
        ATMMessage mes = new ATMMessage.Builder(646).Amount(800).FromAccount(34556).ToAccount(86747).SerialNumber(7777).Pin(5555).Card(this.card).build();
        Assert.assertEquals(mes.getMessageCode(), 646);
        Assert.assertEquals(mes.getAmount(),mes.getAmount());
        Assert.assertEquals(mes.getFromAccount(), mes.getFromAccount());
        Assert.assertEquals(mes.getToAccount(),mes.getToAccount());
        Assert.assertEquals(mes.getSerialNumber(),mes.getSerialNumber());
        Assert.assertEquals(this.card,card);
    }
    @Test
    public void UpdateCreatTestMessage()throws Exception{
         ATMMessage mes = new ATMMessage.Builder(46).Amount(80).FromAccount(556).ToAccount(747).SerialNumber(77).Pin(5555).Card(card).build();
       
    }

}
