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
public class IdentificationInformation {
    String name;
    String code;
    public IdentificationInformation(String name, String code) 
    {
        this.name = name;
        this.code = code;
    }
    public String getName() 
    {
        return name;
    }
    public String getCode() 
    {
        return code;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
}