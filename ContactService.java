/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs320.annieworroll.milestone1;

import java.util.HashMap;
import java.util.Map;

/**
 * This class implements a collection of contact information
 * 
 * @author annie
 */
public class ContactService {

    Map<String, Contact> contactList = new HashMap<>(10);
    int currentID = 1;

    /**
     * Constructs a contact service object, initializing the map
     */
    public void ContactService() {
       // contactList = new HashMap<>(10);
    }
    
    /**
     * Inserts a new contact record into the contact list.
     * 
     * Returns the contactID for the inserted entry
     * 
     * @param fName
     * @param lName
     * @param phone
     * @param address 
     * 
     * @return contactID
     */
    public String addEntry(String fName, String lName, String phone, 
                           String address)
    {
        // Convert currentID to a padded string
        String contactID = String.format("%d", currentID);
        // Ready the next ID for use
        currentID++;
        
        //Contact to insert
        Contact newContact = new Contact(contactID, fName, lName, 
                                         phone, address);
        contactList.put(contactID, newContact);
        
        return contactID;
    }
    
    public Contact getEntry(String contactID)
    {
        return contactList.get(contactID);
    }
    
    /**
     * Removes an entry from the contact list corresponding to contactID
     * 
     * @param contactID 
     */
    public void removeEntry(String contactID)
    {
        contactList.remove(contactID);
    }
    
    /**
     * Updates the first name of a contact identified with contactID to name
     * 
     * @param contactID
     * @param name 
     */
    public void updateFirstName(String contactID, String name)
    {
        contactList.get(contactID).setFirstName(name);
    }
    
    /**
     * Updates the last name of a contact identified with contactID to name
     * 
     * @param contactID
     * @param name 
     */    
    public void updateLastName(String contactID, String name)
    {
        contactList.get(contactID).setLastName(name);        
    }
    
    /**
     * Updates the phone number of a contact identified with contactID to phone
     * 
     * @param contactID
     * @param phone 
     */
    public void updatePhone(String contactID, String phone)
    {
        contactList.get(contactID).setPhone(phone);
    }
    
    /**
     * Updates the address of a contact identified with address
     * 
     * @param contactID
     * @param address 
     */
    public void updateAddress(String contactID, String address)
    {
        contactList.get(contactID).setAddress(address);
    }
    
   
}
