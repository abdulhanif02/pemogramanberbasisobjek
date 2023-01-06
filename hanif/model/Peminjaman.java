/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanif.model;

/**
 *
 * @author Windows 10
 */

/**
 * Kode Peminjaman = Kode Buku 
 */
public class Peminjaman {
    private String Nobp;
    private String Kode;
    private String Pinjam;
    private String Kembali;

    public Peminjaman() {
    }

    public Peminjaman(String Nobp, String Kode, String Pinjam, String Kembali) {
        this.Nobp = Nobp;
        this.Kode = Kode;
        this.Pinjam = Pinjam;
        this.Kembali = Kembali;
    }

    public String getNobp() {
        return Nobp;
    }

    public void setNobp(String Nobp) {
        this.Nobp = Nobp;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public String getPinjam() {
        return Pinjam;
    }

    public void setPinjam(String Pinjam) {
        this.Pinjam = Pinjam;
    }

    public String getKembali() {
        return Kembali;
    }

    public void setKembali(String Kembali) {
        this.Kembali = Kembali;
    }
    
}
