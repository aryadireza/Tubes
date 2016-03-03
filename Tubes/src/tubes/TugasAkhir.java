/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Fitrah Bima Nusantara
 */
public class TugasAkhir {
    private Dosen[] pembimbing = new Dosen[2];
	private String judul;
	
	public TugasAkhir(String judul){
		this.judul=judul;
	}
        public void setPembimbing(Dosen d, int i){
		pembimbing[i]=d;
	}
	public void setJudul(String judul){
		this.judul=judul;
	}
	public String getJudul(){
		return judul;
	}
}
