/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanif.dao;
import hanif.model.Buku;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList<>();

    public BukuDaoImpl() {
        data.add(new Buku("B001","Pascal","","Andi"));
        data.add(new Buku("B002","Algoritma","Andi","Andi"));
        data.add(new Buku("B003","Java","Andi","Andi"));
    }
    
    @Override
    public Buku save(Buku buku){
        data.add(buku);
        return buku;
    }
    public Buku update(int index,Buku buku){
         data.set(index,buku);
         return buku;
     }
     
     public Buku delete(int index){
         return data.remove(index);
         
     }
     
     public Buku getBuku(int index){
         return data.get(index);
     }
     
     public List<Buku>getAllBuku(){
         return data;
     }
}
