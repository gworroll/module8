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
 *
 * @author annie
 */
public class ContactServiceTest {
    
    public ContactServiceTest() {
    }
        
    ContactService tContactService = new ContactService();
    String tContactID;
    @BeforeEach
    public void setUp() {
        tContactID = tContactService.addEntry("bob", "smith", "5555555555", 
                                              "5 mockingbird lane");
    }
    
    /* The contact service generates the contactID internally to enforce
     * uniqueness
     */
    
    @Test
    public void testAdd() 
    {
        /* Verifying insertion of the contact in the setUp method
         */
        assertEquals(tContactService.getEntry(tContactID).getFirstName(), "bob");
        assertEquals(tContactService.getEntry(tContactID).getLastName(), "smith");
        assertEquals(tContactService.getEntry(tContactID).getPhone(), "5555555555");
        assertEquals(tContactService.getEntry(tContactID).getAddress(), 
                     "5 mockingbird lane");
    }
    
    @Test
    public void testDelete()
    {
        tContactService.removeEntry(tContactID);
        //getEntry should return null if the entry is not there
        assertEquals(tContactService.getEntry(tContactID), null);
    }
    
    /* Testing field updates via contact service
     */
    @Test
    public void testUpdateFirstName()
    {
        tContactService.getEntry(tContactID).setFirstName("robert");
        assertEquals(tContactService.getEntry(tContactID).getFirstName(), "robert");
    }
    
    @Test
    public void testUpdateLastName()
    {
        tContactService.getEntry(tContactID).setLastName("jones");
        assertEquals(tContactService.getEntry(tContactID).getLastName(), "jones");
    }
    @Test
    public void testUpdatePhone()
    {
        tContactService.getEntry(tContactID).setPhone("5558675309");
        assertEquals(tContactService.getEntry(tContactID).getPhone(), "5558675309");
    }
    @Test
    public void testUpdateAddress()
    {
        tContactService.getEntry(tContactID).setAddress("212 Bleecker Street");
        assertEquals(tContactService.getEntry(tContactID).getAddress(), 
                     "212 Bleecker Street");
    }
}
