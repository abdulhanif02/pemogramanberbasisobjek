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
public class student extends person {
    
    public student(){
        super( "Ali", "Padang" );
        super.name = "Ani";
        super.address = "some address";
        System.out.println("Inside Student:Constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    } 
    
    public static void main(String[] args){
        student ana = new student();
        System.out.println(ana.name);
    }
    
}
