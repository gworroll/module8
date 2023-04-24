/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs320.annieworroll.milestone1;

/**
 *
 * @author annie
 */
public class Contact {
    final private String contactID; //Max length 10 characters. No update. No null
    private String firstName; //Max length 10 characters. No null.
    private String lastName;  //Max length 10 characters. No null.
    private String phone;     //Exact length 10 characters.No null.
    private String address;   //Max length 30 characters. No null.
    
    public Contact(String ID, String fName, String lName,
                   String phone, String address)
    {
      
        /* ContactID constraint checking needs to be here. It is declared final
         * so it needs to be initialized in the constructor rather than a 
         * separate setter
         */
        // Verify length constraint for conactID
        if(ID.length() > 10){
            throw new IllegalArgumentException("ID max length is 10 characters");
        }               
        
        contactID = ID;
        
        /* Constraint checks for other fields is done in their own setters
         */
        setFirstName(fName);
        setLastName(lName);
        setPhone(phone);
        setAddress(address);
    }
    
    /**
     * 
     * @param name 
     */
    public void setFirstName(String name)
    {
       
       if(name.length() > 10){
           throw new IllegalArgumentException("First name max length is 10");
       }
      
       firstName = name; 
    }
    
    public void setLastName(String name)
    {
        if(name.length() > 10){
           throw new IllegalArgumentException("Last name max length is 10");
        }
        /*if(name == null){
           throw new IllegalArgumentException("Last name cannot be null");
        } */   
        lastName = name;
    }
    
    public void setPhone(String number)
    {
        if(number.length() != 10){
           throw new IllegalArgumentException("Phone number lenght must be exactly 10");
        }
        if(number == null){
           throw new IllegalArgumentException("Phone number cannot be null");
        }
        phone = number;
    }
    
    public void setAddress(String address)
    {
        if(address.length() > 30){
           throw new IllegalArgumentException("Address max length is 30");
        }
        if(address == null){
           throw new IllegalArgumentException("Address cannot be null");
        }
        
        this.address = address;
    }
    
    public String getContactId()
    {
        return contactID;
    }
    public String getFirstName()
    {
       return firstName; 
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getAddress()
    {
        return address;
    }
}
