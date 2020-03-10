public class Bank{
    public static void main(String[] args){
        Rekening r1 = new Rekening(122, "Rudi", 300000);
        System.out.println(r1.ambilUang(100000)); // mengambil uang dan berhasil
        System.out.println(r1); //saldo saat ini
        System.out.println(r1.simpanUang(50000)); // menyimpan uangn dan berhasil
        System.out.println(r1); //saldo saat ini
        System.out.println(r1.ambilUang(500000)); // mengambil uang, gagal karena saldo tidak cukup
        System.out.println(r1); //saldo saat ini
        System.out.println(r1.getNama()); //mencetak nama rudi
        System.out.println(r1); //saldo saat ini
    }
}