/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanif.controller;
import hanif.view.formPeminjaman;
import hanif.dao.PeminjamanDao;
import hanif.dao.BukuDao;
import hanif.dao.AnggotaDao;
import hanif.dao.PeminjamanDaoImpl;
import hanif.dao.BukuDaoImpl;
import hanif.dao.AnggotaDaoImpl;
import hanif.model.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Windows 10
 */
public class PeminjamanController {
    private formPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    private BukuDao bukuDao;
    private AnggotaDao anggotaDao;
    
    
    public PeminjamanController(formPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        bukuDao = new BukuDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        
        
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtPinjam().setText("");
        formPeminjaman.getTxtKembali().setText("");
    }
    
    public void setCboNobp(){
        formPeminjaman.getCboNobp().removeAllItems();
        List<Anggota> list = anggotaDao.getAllAnggota();
        for(Anggota anggota: list){
            formPeminjaman.getCboNobp().
                    addItem(anggota.getNobp()+"-"+anggota.getNama());
        }
    }
    
    public void setCboKode(){
        formPeminjaman.getCboKode().removeAllItems();
        List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku: list){
           formPeminjaman.getCboKode().
                   addItem(buku.getKode());
        }
    }
    
    
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
            for(Anggota anggota:listAnggota){
                if(peminjaman.getNobp()==anggota.getNobp()){
                    formPeminjaman.getCboNobp().
                            setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCboKode().setSelectedItem(peminjaman.getKode());
            formPeminjaman.getTxtPinjam().setText(peminjaman.getPinjam());
            formPeminjaman.getTxtKembali().setText(peminjaman.getKembali());
            
        }
    }
    
    public void updatePeminjaman(){
        int index= formPeminjaman.getTblPeminjaman().getSelectedRow();
       peminjaman.setNobp(formPeminjaman.getCboNobp().
                getSelectedItem().toString().split("-")[0]);
        peminjaman.setKode(formPeminjaman.getCboKode().
                getSelectedItem().toString().split("-")[0]);
        peminjaman.setPinjam(formPeminjaman.getTxtPinjam().getText());
        peminjaman.setKembali(formPeminjaman.getTxtKembali().getText());
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update OK");
    }
    
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getCboNobp().
                getSelectedItem().toString().split("-")[0]);
        peminjaman.setKode(formPeminjaman.getCboKode().
                getSelectedItem().toString().split("-")[0]);
        peminjaman.setPinjam(formPeminjaman.getTxtPinjam().getText());
        peminjaman.setKembali(formPeminjaman.getTxtKembali().getText());
        peminjamanDao.save(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman,"Entri Data OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : listPeminjaman){
            Object[] data = {
                peminjaman.getNobp(),
                peminjaman.getKode(),
                peminjaman.getPinjam(),
                peminjaman.getKembali(),
                
            };
            tabelModel.addRow(data);
        }
    }
}
