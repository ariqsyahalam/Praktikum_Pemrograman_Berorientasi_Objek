public class MainTitik{
    public static void main(String[] args){
        Titik t1 = new Titik();
        Titik t2 = new Titik(20,3);

        System.out.println(t1);
        System.out.println(t2);

        t1.naik(); // menaikkan titik 1
        t2.kanan(); //menggese titik 1 ke kanan
        t1.njumbul(10); //titik satu di naikkan sebanyak 10

        System.out.println(t1);
        System.out.println(t2);
    }
}