/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mhh91
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Fibonacci.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fibonacci.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Fibonacci.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        int number = 0;
        int expResult = 0;
        int result = Fibonacci.getNumber(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
