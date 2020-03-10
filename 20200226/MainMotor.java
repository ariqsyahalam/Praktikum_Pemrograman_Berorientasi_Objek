public class MainMotor{
    public static void main(String[] args){
        Motor r1 = new Motor("B 213 BAS", 0, 0);
        System.out.println(r1);
        System.out.println(r1.getGas(20)); // gas sebanyak 20
        System.out.println(r1);
        System.out.println(r1.getTurunkanGigi()); // turunkan gigi
        System.out.println(r1);
        System.out.println(r1.getRem(21)); // turunkan kecepatan sebanyak 21
        System.out.println(r1);
        System.out.println(r1.getGas(100)); // mengambil uang dan berhasil
        System.out.println(r1);
        System.out.println(r1.getTurunkanGigi()); // mengambil uang dan berhasil
        System.out.println(r1);
        System.out.println(r1.getNaikanGigi()); // mengambil uang dan berhasil
        System.out.println(r1.getNaikanGigi()); // mengambil uang dan berhasil
        System.out.println(r1);
        System.out.println(r1.getRem(120)); // mengambil uang dan berhasil
        System.out.println(r1.getNaikanGigi()); // mengambil uang dan berhasil
        System.out.println(r1);

    }
}