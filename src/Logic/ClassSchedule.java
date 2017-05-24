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
public class ClassSchedule {
    String type;
    String startOfSchedule;
    String endOfSchedule;
    public ClassSchedule(String type, String startOfSchedule, String endOfSchedule) 
    {
        this.type = type;
        this.startOfSchedule = startOfSchedule;
        this.endOfSchedule = endOfSchedule;
    }
    public String getType()
    {
        return type;
    }
    public String getStartOfSchedule() 
    {
        return startOfSchedule;
    }
    public String getEndOfSchedule() 
    {
        return endOfSchedule;
    }
    public void setType(String type) 
    {
        this.type = type;
    }
    public void setStartOfSchedule(String startOfSchedule) 
    {
        this.startOfSchedule = startOfSchedule;
    }
    public void setEndOfSchedule(String endOfSchedule) 
    {
        this.endOfSchedule = endOfSchedule;
    }
}