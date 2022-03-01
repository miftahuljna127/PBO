package Breakcontinue;
import java.util.Scanner;
import java.util.Random;//untuk mengeluarkan nilai acak

public class Latihan1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int angka = rand.nextInt(10)+1;//generate nilai acak 1s/d 10
        int tebakanAnda;
        System.out.println("PROGRAM TEBAK ANGKA 1 S.D. 10");
        for (;;) //untuk perulangan tak terhingga
        {
            System.out.print("Tebakan Anda: ");
            tebakanAnda = input.nextInt();
            if (tebakanAnda == angka){ //wajib menggunakan { jika bernilai true inputannya
                System.out.println("Tebakan Anda Benar");
            break; //akan dideklarasikan mau ifnya benar karena break termasuk pada for
            }
        }
    }
}
