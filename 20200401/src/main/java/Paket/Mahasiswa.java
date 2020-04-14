/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paket;

/**
 *
 * @author dooriq
 */
public class Mahasiswa extends Manusia{
    private String nama;
    
    public Mahasiswa(String nama){
        super(nama);
    }
    
    @Override
    public void setNama(String nama){
        super.setNama(nama+nama);
    }

    @Override
    public String toString() {
        return "Manusia{" + "nama=" + getNama() + '}';
    }
    
    
}
