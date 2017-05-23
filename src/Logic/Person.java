/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Package
package Logic;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @date 2017-05-23 Martes
 **/
public class Person {
    String name;
    String lastName;
    String identificationCard;
    String address;
    String telephoneNumber;
    String email;
    public Person(String name, String lastName, String identificationCard, String address, 
            String telephoneNumber, String email) 
    {
        this.name = name;
        this.lastName = lastName;
        this.identificationCard = identificationCard;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
    }
    public String getName() 
    {
        return name;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public String getIdentificationCard() 
    {
        return identificationCard;
    }
    public String getAddress() 
    {
        return address;
    }
    public String getTelephoneNumber() 
    {
        return telephoneNumber;
    }
    public String getEmail() 
    {
        return email;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public void setIdentificationCard(String identificationCard) 
    {
        this.identificationCard = identificationCard;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public void setTelephoneNumber(String telephoneNumber) 
    {
        this.telephoneNumber = telephoneNumber;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }   
}