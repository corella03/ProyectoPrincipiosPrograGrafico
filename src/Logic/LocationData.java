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
public class LocationData {
    String name;
    String location;
    public LocationData(String name, String location) 
    {
        this.name = name;
        this.location = location;
    }
    public String getName()
    {
        return name;
    }
    public String getLocation() 
    {
        return location;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }
}