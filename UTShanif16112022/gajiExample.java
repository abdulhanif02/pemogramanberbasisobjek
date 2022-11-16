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
public class gajiExample {
 public static void main(String[] args){
        gaji gaji1 = new gaji();
        gaji1.setName("Ali");
        gaji1.setSlip("12ED");
        gaji1.setGolongan(1);
        gaji1.setTa(250000);
        gaji1.setTi(500000);
        
        System.out.println("Nama            :"+gaji1.getName());
        System.out.println("Kode Slip       :"+gaji1.getSlip());
        System.out.println("Golongan        :"+gaji1.getGolongan());
        System.out.println("Tunjangan Anak  :"+gaji1.getTa());
        System.out.println("Tunjangan Istri :"+gaji1.getTi());
        System.out.println("Total           :"+gaji1.getTotal());
     
    }
}
