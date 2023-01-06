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
public class employee extends person {
    @Override
    public String getName(){
        super.name = "Dodi";
        System.out.println("Employee Name: "+name);
        return name;
    }
}
