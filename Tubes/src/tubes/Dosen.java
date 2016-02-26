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
public class Dosen extends Orang {
    private KelompokTA[] topikTA = new KelompokTA[];
    private int nKelompokTA;
    
    public void createKelompokTA(String topik){
        topikTA[nKelompokTA] = new KelompokTA(topik);
        nKelompokTA++;
    }
}
