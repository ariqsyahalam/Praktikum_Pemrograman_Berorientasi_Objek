public class Main {
    public static void main(String [] args){
        Manusia obj1 = new Manusia();
        Manusia obj2 = new Manusia("Doni", 35, true);

        System.out.println("objek 2 namanya" + obj2.getName());
        obj1.setName("Didi Kempot");
        System.out.println("Kalau saya objek 2" + "namanya" + obj1.getName()
        );
    }
}