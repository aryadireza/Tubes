/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.util.*;
/**
 *
 * @author Reza Aryadi
 */
public class Dosen extends Orang {
    private ArrayList<KelompokTA> topikTA = new ArrayList<>();
    private int nKelompokTA=0;

    Dosen(String nama, String NoID) {
       super.setNama(nama);
       super.setNoID(NoID);
    }
    
    public void createKelompokTA(String topik){
        KelompokTA a = new KelompokTA(topik);
        topikTA.add(a);
        nKelompokTA++;
    }
            public String getNoID() {
        return super.getNoID();
    }

    public void setNoID(String NoID) {
        super.setNoID(NoID);
    }
    
    public void setNama(String nama){
        super.setNama(nama);
    }
    public String getNama(){
        return super.getNama();
    }
    public void setStatus(String status){
        super.setStatus(status);
    }
    public String getStatus(){
        return super.getStatus();
    }
}
