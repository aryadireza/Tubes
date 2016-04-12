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
public class Aplikasi {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private ArrayList<Dosen> daftarDosen = new ArrayList<>();
    private int jumlahDosen=0;
    private int jumlahMahasiswa=0;
    
    
    public void addDosen(String nama,String NoID){
        Dosen a = new Dosen(nama, NoID);
        daftarDosen.add(a);
        jumlahDosen++;
    }
    public void addMahasiswa(String nama,String NoID){
        Mahasiswa a = new Mahasiswa(nama, NoID);
        daftarMahasiswa.add(a);
        jumlahMahasiswa++;   
    }
    public Mahasiswa getMahasiswa(String NoID){
        int j=0;
        while (daftarMahasiswa.get(j).getNoID()!=NoID){
            j++;
        }
        return daftarMahasiswa.get(j);
    }
    public void deleteMahasiswa(String NoID){
      int j=0;
        while (daftarMahasiswa.get(j).getNoID()!=NoID){
            j++;
        }
        daftarMahasiswa.remove(j-1);
    }
        
    public Dosen getDosen(String NoID){
        int k=0;
        while (daftarDosen.get(k).getNoID()!=NoID){
            k++;
        }
        return daftarDosen.get(k);
    }
    public void deleteDosen(String NoID){
      int l;
        while (daftarDosen.get(l).getNoID()!=NoID){
            l++;
        }
        daftarDosen.remove(l-1);
    }
    public int LihatJumlahDosen(){
        return jumlahDosen;
    }
    public int LihatJumlahDosen(){
        return jumlahDosen;
    }
}
