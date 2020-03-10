public class Motor {

    String noPlat;
    int gigi;
    int kecepatan;

    public Motor(final String noPlat,final int gigi,final int kecepatan){
        this.noPlat = noPlat;
        this.gigi = gigi;
        this.kecepatan = kecepatan;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public boolean getGas(final int n) { // untuk menaikkan kecepatan
        this.kecepatan += n; // kecepatan ditambahkan dengan n kecepatan
        return true;

    }

    @Override
    public String toString() {
        return "Motor{" +
                "noPlat='" + noPlat + '\'' +
                ", gigi=" + gigi +
                ", kecepatan=" + kecepatan +
                '}';
    }

    public boolean getRem(final int n) { //menurunkan kecepatan
        if ((this.kecepatan - n) < 1) { // jika kecepatan <=0 maka tidak bisa
            this.kecepatan = 0; // kecepatan nya menjadi 0
            return false; // false karena tidak bisa
        }
        else {
            this.kecepatan -= n;  // kecepatan berkurang sebanyak n
            return true; // bisa dilakukan
        }

    }

    public int getNaikanGigi() { //menaikkan satu gigi
        if (this.kecepatan == 0 && this.gigi == 4 ){ // apabila kecepatan 0 dan gigi 4
            gigi = 0; // maka gigi menjadi 0
            return gigi;
        }
        else if (this.kecepatan > 0 && this.gigi == 4){ // apabila kecepatan lebih dari 0 dan gigi lebih dari 4
            this.gigi = 4; // gigi tetap 4
            return this.gigi;
        }
        this.gigi += 1; // gigi bertambah 1
        return this.gigi;

    }

    public int getTurunkanGigi() { // menurunkan satu gigi
        if (this.gigi == 0){ //jika gigi 0
            this.gigi = 4; // dan diturunkan maka gigi menjadi 4
            return this.gigi;
        }
        this.gigi -= 1; //gigi dikurangi 1
        return this.gigi;

    }


}
