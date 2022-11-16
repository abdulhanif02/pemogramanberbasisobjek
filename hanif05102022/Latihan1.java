/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanif05102022;

/**
 *
 * @author Windows 10
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Latihan1 {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader(System.in));
        
        String name ="";
        String alamat ="";
        String jurusan ="";
        
        System.out.print("Pelase Enter Your Name :");
        try{
            name =dataIn.readLine();
            }catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.print("Alamat :");
        try{
            alamat = dataIn.readLine();
            }catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.print("Jurusan :");
        try{
            jurusan = dataIn.readLine();
            }catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.print("Jurusan :");
       
      System.out.println("Hello," +name+ " di " +alamat+ " Selamat Datang di "+jurusan);
    }
    
}
