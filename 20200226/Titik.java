public class Titik
{
    double koordinatX;
    double koordinatY;

    public Titik() {
        this.koordinatX = 0.0;
        this.koordinatY = 0.0;
    }

    public Titik(final double koordinatX, final double koordinatY) {
        this.koordinatX = koordinatX;
        this.koordinatY = koordinatY;
    }

    void naik() { // untuk menambahkan kordonat Y atau menaikan
        ++this.koordinatY;
    }

    void turun() {
        --this.koordinatY; // untuk menurunkan kordinat Y atau menurunkan
    }

    void kanan() {
        ++this.koordinatX; // menambah koordinat X atau menggeser ke kanan
    }

    void kiri() {
        --this.koordinatX; // mengurang koordinat X atau menggeser ke kiri
    }

    void njumbul(final double n) { //menambah koordinat Y sebanyak n kali
        this.koordinatY += n;
    }

    @Override
    public String toString() {
        return "titik dengan X = " + this.koordinatX + " dan Y= " + this.koordinatY;
    }
}