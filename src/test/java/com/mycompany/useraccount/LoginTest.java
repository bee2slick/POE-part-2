/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.useraccount;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Blessing
 */
public class LoginTest {
    
  

    /**
     * Test of getName method, of class Login.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Login instance = new Login();
        String expResult = "blessing";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Login.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "blessing";
        Login instance = new Login();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getsurname method, of class Login.
     */
    @Test
    public void testGetsurname() {
        System.out.println("getsurname");
        Login instance = new Login();
        String expResult = "kyl_1";
        String result = instance.getsurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setsurname method, of class Login.
     */
    @Test
    public void testSetsurname() {
        System.out.println("setsurname");
        String lastname = "kyl_1";
        Login instance = new Login();
        instance.setsurname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String initialUsername = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(initialUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String initialPassword = "Ch&&sec@ke99";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(initialPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String initialUsername = "kyl_1";
        String initialPassword = "Ch&&sec@ke99";
        Login instance = new Login();
        String result = instance.registerUser(initialUsername, initialPassword);
        String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String finalUserName = "kyl_1";
        String finalpassWord = "Ch&&sec@ke99";
        String initialUsername = "kyl_1";
        String initialPassword = "Ch&&sec@ke99";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(finalUserName, finalpassWord, initialUsername, initialPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String finalUserName = "kyl_1";
        String finalpassWord = "Ch&&sec@ke99";
        String initialUsername = "kyl_1";
        String initialPassword = "Ch&&sec@ke99";
        Login instance = new Login();
        
        String result = instance.returnLoginStatus(finalUserName, finalpassWord, initialUsername, initialPassword);
        String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
