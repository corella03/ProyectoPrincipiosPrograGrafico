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
 ** @date 2017-05-24 Miercoles
 **/
public class Campus extends LocationData {
    String code;
    public Campus(String name, String location, String code) 
    {
        super(name, location);
        this.code = code;
    } 
}