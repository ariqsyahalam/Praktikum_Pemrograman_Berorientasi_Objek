/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dooriq
 */
public class Matic {
    
    private String noPlat;
    private int kecepatan;
    private String gigi;
    
    public Matic(String noPlat){
        this.noPlat = noPlat;
        this.gigi = "N";
        this.kecepatan= 0;
    }
    
    public String getNoPlat() {
        return this.noPlat;
    }
    
    public void setNoPlat(String noPlat){
        this.noPlat=noPlat;
    }
    
    public int getKecepatan() {
        return this.kecepatan;
    }
    
    public String getGigi() {
        return this.gigi;
    }
    
            @Override
    public String toString() {
        return "Mobil{" +
                "noPlat='" + noPlat + '\'' +
                ", gigi=" + gigi +
                ", kecepatan=" + kecepatan +
                '}';
    }
    
    public int gas() { // untuk menaikkan kecepatan
        if ("R".equals(this.gigi)){
            this.kecepatan -= 5;
            return kecepatan;
        }
        
        else if ("D".equals(gigi)){
          this.kecepatan += 5; // kecepatan ditambahkan dengan n kecepatan  
        }
        return kecepatan;
                
    }
    
    public int rem() {
        if (this.kecepatan != 0){
            if ("R".equals(this.gigi) && this.kecepatan <= -5){
                this.kecepatan += 5;
                return kecepatan;
            }

            else{
              this.kecepatan -= 5;  
            }
            return kecepatan;
        }   
        return kecepatan;
    }
    
    public boolean oper(String gigi){
        if ("D".equals(gigi)|| "N".equals(gigi)){
            if ( "N".equals(this.gigi) && this.kecepatan >= 0){
                this.gigi = gigi;
                return true;
            }
            else if (!"N".equals(this.gigi) && "N".equals(gigi)){
                this.gigi = gigi;
                return true;
            }
            else{
                return false;
            }
           
            
        }
        else if ( "R".equals(gigi) && "N".equals(this.gigi) && 
                this.kecepatan == 0 ){
            this.gigi = "R";
            return true;                
            
        }
        else{
            return false;
        }        
    }  
    
        
}
