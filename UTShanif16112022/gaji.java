/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTShanif16112022;

/**
 *
 * @author Windows 10
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class gaji {
    public static void main(String [] args){
        int ta = 0,ti = 0,total;
        int golongan = 0;
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader(System.in));
        String nama="";
        String slip="";
        System.out.print("Masukan Kode Slip :");
        try{
            slip =dataIn.readLine();
            }catch (IOException e) {
            System.out.println("Error!");
            }
        System.out.print("Masukan Nama :");
        try{
            nama =dataIn.readLine();
            }catch (IOException e) {
            System.out.println("Error!");
            }
        System.out.print("Masukan Golongan : ");
        try{
            golongan =Integer.parseInt(dataIn.readLine());
            }catch (IOException e) {
            System.out.println("Error!");
        }
        if(golongan == 1)
        {
            System.out.println("Anda Golongan 1");
            int pokok=1000000;
            System.out.print("Masukan Tunjangan Anak : ");
            try{
                ta =Integer.parseInt(dataIn.readLine());
                }catch (IOException e) {
                System.out.println("Error!");
            }
            System.out.print("Masukan Tunjangan Istri : ");
            try{
                ti =Integer.parseInt(dataIn.readLine());
                }catch (IOException e) {
                System.out.println("Error!");
            }
            total=pokok+ta+ti;
            System.out.println("Total Gaji : " +total);
        }
        else if(golongan == 2)
        {
            System.out.println("Anda Golongan 2");
            int pokok=2000000;
            System.out.print("Masukan Tunjangan Anak : ");
            try{
                ta =Integer.parseInt(dataIn.readLine());
                }catch (IOException e) {
                System.out.println("Error!");
            }
            System.out.print("Masukan Tunjangan Istri : ");
            try{
                ti =Integer.parseInt(dataIn.readLine());
                }catch (IOException e) {
                System.out.println("Error!");
            }
            total=pokok+ta+ti;
            System.out.println("Total Gaji : " +total);
        }
        else
        {
            System.out.println("Golongan anda tidak valid");
        }
    }
}
