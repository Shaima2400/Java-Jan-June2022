/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trianglearea;

/**
 *
 * @author User
 */
public class Department {
    private String name;
    private String description;
    
    public Department(){
        this.name="CSE";
    }
    
    public Department(String n, String d){
        this.name=n;
        this.description=d;
    }
    
    //constructor overloading
    private Department(String d){
        
    }
    
    
    public int countAttendance(String[] emp){
        return emp.length;
    }
    
    
    public void countAttendance(int attended){

    }
    
    public int countAttendance(){
        return 0;
        
    }
    
    public static void main(String[] args){
        Department d = new Department();
        d.countAttendance(10);
    }
    
}
