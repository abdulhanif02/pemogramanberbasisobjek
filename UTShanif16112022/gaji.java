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
public class gaji {
    private String name;
    private String slip;
    private String golongan;
    private double pokok;
    private double ta;
    private double ti;
    private double total;
    private static int gajii;
    
    public gaji(String temp) {
        gajii++;
        this.name = temp;
    }

    public gaji(String name, String slip, String golongan) {
        gajii++;
        this.name = name;
        this.slip = slip;
        this.golongan = golongan;
    }

    public gaji(double tanak, double tistri) {
         tanak = ta;
         tistri = ti;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSlip() {
        return slip;
    }
    public void setSlip(String slip) {
        this.slip = slip;
    }
    
    public String getGolongan() {
        return golongan;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    
    public double getTa() {
        return ta;
    }
    public void setTa(double ta) {
        this.ta = ta;
    }
    
    public double getTi() {
        return ti;
    }
    public void setTi(double ti) {
        this.ti= ti;
    }
    public double getTotal() {
        if ("1".equals(golongan)){
            pokok=1000000;
            total = (pokok + ta + ti);
            return total;
        }
        else if ("2".equals(golongan)){
            pokok=2000000;
            total = (pokok + ta + ti);
            return total;
        }
        return total;
    }
    public static int getGajii() {
        return gajii;
    }
}
