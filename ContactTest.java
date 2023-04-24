/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.cs320.annieworroll.milestone1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Contact class
 * @author annie
 */
public class ContactTest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    /* Test object */
    Contact tContact; 
    
    @BeforeEach
    void initializeTestContact()
    {
        tContact = new Contact("1", "Bob", "Smith", "5555555555",
                                      "5 Mockingbird Lane");
    }
    
    @Test
    public void testContact()
    {
        // This test verifies basic functionality 
        assertTrue(tContact.getContactId().equals("1"));
        assertTrue(tContact.getFirstName().equals("Bob"));
        assertTrue(tContact.getLastName().equals("Smith"));
        assertTrue(tContact.getPhone().equals("5555555555"));
        assertTrue(tContact.getAddress().equals("5 Mockingbird Lane"));        
    }        
    
    /* There is no way to test the contactID outside the constructor as it is
     * declared final and initialized there. There is no facility to update it
     * on an existing object so there is no need to test if updating is possible.
     */
    @Test
    public void testContactIDNoNull()
    {
        assertThrows(NullPointerException.class, 
                     () -> new Contact(null, "a", "b", "c", "d"));
    }
    
    @Test
    public void testContactIDMaxLength()
    {
        //11 character contactID should be rejected
        assertThrows(IllegalArgumentException.class, 
                     () -> new Contact("abcdefghijk", "a", "b", "c", "d"));
    }    
        
    /* First name tests */ 
    @Test 
    public void testContactFnameNoNull()
    {
        assertThrows(NullPointerException.class, 
                     () -> tContact.setFirstName(null));
    }
    
    @Test
    public void testContactFnameMaxLength()
    {
        assertThrows(IllegalArgumentException.class,
                     () -> tContact.setFirstName("abcdefghijk"));
    }
    
    /* First name tests */ 
    @Test 
    public void testContactLnameNoNull()
    {
        assertThrows(NullPointerException.class, 
                     () -> tContact.setLastName(null));
    }
    
    @Test
    public void testContactLnameMaxLength()
    {
        assertThrows(IllegalArgumentException.class,
                     () -> tContact.setLastName("abcdefghijk"));
    }
    
    @Test 
    public void testPhoneNoNull()
    {
        assertThrows(NullPointerException.class,
                     () -> tContact.setPhone(null));
    }
    
    /* Phone number length needs to be exactly 10, so we need to test longer as
     * well as shorter lengths. Initial test of basic functionality confirms 
     * that exactly 10 works
     */
    @Test
    public void testPhoneShortLength()
    {
        assertThrows(IllegalArgumentException.class,
                     () -> tContact.setPhone("012345678"));
    }
    
    @Test
    public void textPhoneExcessLength()
    {
        assertThrows(IllegalArgumentException.class,
                     () -> tContact.setPhone("01234567890"));
    }
    
    @Test
    public void testAddressNoNull()
    {
        assertThrows(NullPointerException.class,
                     () -> tContact.setAddress(null));
    }
    
    @Test
    public void testAddressMaxLength()
    {
        assertThrows(IllegalArgumentException.class,
                     () -> tContact.setAddress("0123456789012345678901234567890"));
    
    }
}

