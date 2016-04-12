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
class Mahasiswa extends Orang {
    private TugasAkhir tugasAkhir;

    Mahasiswa(String nama, String NoID) {
        super.setNama(nama);
        super.setNoID(NoID);
    }
	
	public void createTA(String judul){
        tugasAkhir = new TugasAkhir(judul);
    }
	public void revisiTA(String judul){
		tugasAkhir.setJudul(judul);
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
