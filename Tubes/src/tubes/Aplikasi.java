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
    Dosen a = new Dosen();
    Mahasiswa b = new Mahasiswa();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
                            
    
    
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
      int l = 0;
        while (daftarDosen.get(l).getNoID()!=NoID){
            l++;
        }
        daftarDosen.remove(l-1);
    }
    public int LihatJumlahDosen(){
        return jumlahDosen;
    }
    public void MenuLogin(){
        int x = 0;
        System.out.println("Pilih login sebagai");
        System.out.println("1. Dosen");
        System.out.println("2. Mahasiswa");
        switch(x){
            case 1:
                MainMenuDosen();
            case 2:
                Mahasiswa b = new Mahasiswa();
        }
    }
    public void MainMenuDosen(){
        int x = 0;
        System.out.println("Main Menu Dosen");
        System.out.println("1. Buat kelompok TA");
        System.out.println("2. Hapus anggota kelompok TA");
        System.out.println("3. Tambah anggota kelompok TA");
        System.out.println("4. Tambahkan diri menjadi dosen pembimbing");
        
        switch(x){
            case 1:
                Scanner input = new Scanner(System.in);
                String c = input.nextLine();
                a.createKelompokTA(c);
                break;
            case 2:
                System.out.println("Masukkan index kelompok TA");
                int d = inputInt.nextInt();
                System.out.println("Masukkan index anggota kelompok TA");
                int e = inputInt.nextInt();
                ArrayList<KelompokTA> f = new ArrayList<>();
                a.getTopikTA().get(d).removeAnggota(e);;
                break;
            case 3:
                System.out.println("Masukkan index kelompok TA");
                int dd = inputInt.nextInt();
                System.out.println("Masukkan nama mahasiswa");
                String ee = inputString.nextLine();
                System.out.println("Masukkan nim mahasiswa");
                String ff = inputString.nextLine();                
                Mahasiswa m = new Mahasiswa(ee, ff);
                a.getTopikTA().get(dd).addAnggota(m);
                break;
            case 4:
                System.out.println("Masukkan index kelompok TA");
                int ddd = inputInt.nextInt();
                System.out.println("Masukkan index mahasiswa");
                int eee = inputInt.nextInt();
                System.out.println("Masukkan index pembimbing yang diinginkan");
                int fff = inputInt.nextInt();
                a.getTopikTA().get(ddd).getAnggota().get(eee).setPembimbing(a, fff);
                break;
                
        }
    }
    public void MainMenuMahasiswa(){
        int x = 0;
        System.out.println("1. Buat Tugas Akhir");
        System.out.println("2. Revisi Judul Tugas Akhir");
        
        switch(x){
            case 1:
                System.out.println("Masukkan judul tugas Akhir");
                String u = inputString.nextLine();
                b.createTA(u);
                break;
            case 2:
                System.out.println("Masukkan judul tugas Akhir");
                String uu = inputString.nextLine();
                b.setJudul(uu);
                break;
        }
    }
}
