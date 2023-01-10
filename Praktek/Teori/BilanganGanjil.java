/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori;

/**
 *
 * @author Windows 10
 */
import java.io.*;
import java.util.Scanner;
public class BilanganGanjil {
   public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
       
       /*Soal
        * Hitung rata2 dan deviasi(sqrt(angka-rata)kuadrat/rata-1)
        * konversi ke biner dan ascii
        * bentuk diamond
        */
       
       
        //Bilangan Prima
      int jmlh, a=1, bil=2, b=2;
      boolean testprima=true;
     
      System.out.print("Masukkan jumlah bilangan prima yang ingin ditampilkan: "); jmlh=input.nextInt();
       
      while(a<=jmlh){
          testprima=true;
         
          for (b=2; b<=bil/2; b++){
              if(bil%b==0){
                  testprima=false; break;
              }
          }
          if(testprima){
              if(a%10==0){
                  System.out.println(bil);
              } else {
                  System.out.print(bil+" ");
              }
              a++;
          }
          bil++;
      }
  
    }
}
