/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Reza Aryadi
 */
public class KelompokTA {
    private String topik;
	private Mahasiswa[] anggota = new Mahasiswa[10];
	private int jumlahAnggota;
	
	public void addAnggota(Mahasiswa m){
		if (this.jumlahAnggota < 10){
			this.anggota[jumlahAnggota] = m;
			jumlahAnggota++;}
		else System.out.println("Jumlah Anggota sudah melebihi batas maksimum!");
	}
	public void removeAnggota(int i){
		anggota[i]=null;
	 
        }
}
