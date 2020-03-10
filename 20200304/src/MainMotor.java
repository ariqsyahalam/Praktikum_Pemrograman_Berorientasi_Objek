/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dooriq
 */
public class MainMotor{
    public static void main(String[] args){
        Motor r1 = new Motor("B 213 BAS");
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
