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
public class ContohStatic {
    public static  int tambah(int x, int y){
        return (x+y);
    }
    
    public static void main(String[] args){
        ContohStatic = new ContohStatic();
        int hasil = ContohStatic.tambah(5, 8);
    }
}
