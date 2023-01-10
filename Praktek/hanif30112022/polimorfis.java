/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanif30112022;

/**
 *
 * @author Windows 10
 */
public class polimorfis {
    public static void main(String[] args){
       person ref;
        student Student = new student(); 
        employee Employee = new employee();
        
        ref = Student;
        String name = ref.getName();
        System.out.println(name);
        //
        ref = Employee;
        name = ref.getName();
        System.out.println(name);
      student studentObject = new student();
      employee employeeObject = new employee();
      
      printInformation (studentObject);
      printInformation (employeeObject);
    }
    public static void printInformation( person person ){
       if(person instanceof student){
           System.out.println("Nama student " + person.getName());
       }
       else  if(person instanceof employee){
           System.out.println("Nama student " + person.getName());
       }
    }
}
