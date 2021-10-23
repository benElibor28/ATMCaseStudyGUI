/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruben
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validatePIN method, of class Account.
     */
    @Test
    public void testValidatePIN() {
        System.out.println("validatePIN");
        Account instance = new Account(1, 2221, 0.0, 0.0);
        int userPIN = 2221;
        boolean expResult = true;
        boolean result = instance.validatePIN(userPIN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult=!result)
        {
            
            fail("The test case is a prototype.");
        } 
    }

    /**
     * Test of getAvailableBalance method, of class Account.
     */
    @Test
    public void testGetAvailableBalance() {
        System.out.println("getAvailableBalance");
        Account instance = new Account(1, 2221, 100.0, 200.0);
        double expResult = 100.0;
        double result = instance.getAvailableBalance();
        assertEquals(expResult, result,100.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
        {
             fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getTotalBalance method, of class Account.
     */
    @Test
    public void testGetTotalBalance() {
        System.out.println("getTotalBalance");
        Account instance =new Account(1, 2221, 100.0, 200.0);
        double expResult = 200.0;
        double result = instance.getTotalBalance();
        assertEquals(expResult, result, 200.0);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result)
        {
             fail("The test case is a prototype.");
        }
    }

    /**
     * Test of credit method, of class Account.
     */
    @Test
    public void testCredit() {
        System.out.println("credit");
        double amount = 1.0;
        Account instance = new Account(1, 2221, 100.0, 200.0);
        instance.credit(amount);
        
        double ActualBalance = instance.getTotalBalance();
        double ExpectBalance = 201.0;
        
        assertEquals(ExpectBalance, ActualBalance,201.0);
        
        // TODO review the generated test code and remove the default call to fail.
        
        if(ActualBalance!=ExpectBalance)
        {
             fail("The test case is a prototype.");
        }
        
        
    }

    /**
     * Test of debit method, of class Account.
     */
    @Test
    public void testDebit() {
        System.out.println("debit");
        double amount = 1.0;
        Account instance = new Account(1, 2221, 100.0, 200.0);
        instance.debit(amount);
        
        double ActualTotalBalance = instance.getTotalBalance();
        double ExpectTotalBalance = 199.0;
        
        double ActualTotalAvaBalance = instance.getAvailableBalance();
        double ExpectTotalAvaBalance = 99.0;
        
        assertEquals(ActualTotalBalance, ExpectTotalBalance,99.0);
        assertEquals(ActualTotalAvaBalance, ExpectTotalAvaBalance,99.0);
        
        // TODO review the generated test code and remove the default call to fail.
        
        if(ActualTotalBalance!=ExpectTotalBalance&&ActualTotalAvaBalance!=ExpectTotalAvaBalance)
        {
             fail("The test case is a prototype.");
        }
        
        
    }

    /**
     * Test of getAccountNumber method, of class Account.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        Account instance = new Account(1, 2221, 100.0, 200.0);
        int expResult = 1;
        int result = instance.getAccountNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        if(expResult!=result)
        {
             fail("The test case is a prototype.");
        }
    }
    
}
