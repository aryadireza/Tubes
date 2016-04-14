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
public class KelompokTA {
    private String topik;
	private ArrayList<Mahasiswa> anggota = new ArrayList<>();
	private int jumlahAnggota=0;

    KelompokTA(String topik) {
        this.topik=topik;
    }
	
	public void addAnggota(Mahasiswa m){
	anggota.add(m);
        }
	
        public void removeAnggota(int i){
		anggota.remove(i);
	 
        }
        public int getJumlahAnggota(){
            return jumlahAnggota;
        }
        public ArrayList<Mahasiswa> getAnggota(){
            return anggota;
        }
}
