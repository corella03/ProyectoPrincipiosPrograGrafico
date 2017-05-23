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
public class Student extends Person{ 
    public Student(String name, String lastName, String identificationCard, String address, 
            String telephoneNumber, String email) 
    {
        super(name, lastName, identificationCard, address, telephoneNumber, email);
    }
    @Override
    public String toString() {
        return "Nombre: " + super.name + "\nApellido: " + super.lastName + "\nCédula: " + super.identificationCard
               + "\nDirreción: " + super.address + "\nTeléfono: " + super.telephoneNumber + "\nE-mail: " + super.email;
    } 
}