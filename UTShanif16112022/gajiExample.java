/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSHanif16112022;

/**
 *
 * @author Windows10
 */
public class GajiExample {
    public static void main(String[] args){
        GajiRecord pegawai1=new GajiRecord();
        
        pegawai1.setKode("095");
        pegawai1.setTgl("14 Des 2022");
        pegawai1.setNama("Dimas");
        pegawai1.setGol(1);
        pegawai1.setTunjanganAnak(250000);
        pegawai1.setTunjanganIstri(500000);
        
        System.out.println("Kode Slip : "+pegawai1.getKode());
        System.out.println("Tanggal : "+pegawai1.getTgl());
        System.out.println("Nama : "+pegawai1.getNama());
        System.out.println("Golongan : "+pegawai1.getGol());
        System.out.println("Gaji Pokok : "+pegawai1.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai1.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai1.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai1.getTotal());
        
        GajiRecord pegawai2=new GajiRecord();
        
        pegawai2.setKode("019");
        pegawai2.setTgl("15 Jan 2022");
        pegawai2.setNama("Zaki");
        pegawai2.setGol(2);
        pegawai2.setTunjanganAnak(500000);
        pegawai2.setTunjanganIstri(750000);
        
        System.out.print("\n");
        System.out.println("Kode Slip : "+pegawai2.getKode());
        System.out.println("Tanggal : "+pegawai2.getTgl());
        System.out.println("Nama : "+pegawai2.getNama());
        System.out.println("Golongan : "+pegawai2.getGol());
        System.out.println("Gaji Pokok : "+pegawai2.getGaji());
        System.out.println("Tunjangan Anak : "+pegawai2.getTunjanganAnak());
        System.out.println("Tunjangan Istri : "+pegawai2.getTunjanganIstri());
        System.out.println("Total Gaji : "+pegawai2.getTotal());
        
    }
}
