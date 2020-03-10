public class Rekening
{
    int noRek; //nomor rekening
    String nama; //pemilik
    int saldo; //saldo rekening

    public Rekening(final int noRek, final String nama, final int saldo) { // class rekening
        this.noRek = noRek;
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() { //untuk mencetak nama
        return this.nama;
    }

    public boolean simpanUang(final int n) { // untuk melakukan perintah simpan uang
        this.saldo += n;
        return true;
    }

    public boolean ambilUang(final int n) { // untuk melakukan perintah ambil uang
        if (n > this.saldo) { // jika saldo tidak cukup False
            return false;
        }

        this.saldo -= n;
        return true;
    }

    public String toString() {
        return "No Rekening : " + this.noRek + " memiliki saldo " + this.saldo;
    } //perintah untuk melakukan print
}
