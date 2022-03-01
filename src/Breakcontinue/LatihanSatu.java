package Breakcontinue;
import java.util.Scanner;
import java.util.Random; //untuk mengeluarkan nilai acak

public class LatihanSatu {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int angka = rand.nextInt(10)+1; //generate nilai acak 1 s/d 10
    System.out.println("Nilai Random:  " + angka);
    int tebakanAnda;
    System.out.println("PROGRAM TEBAK ANGKA (1 S.D. 10)");
    for (;;)// untuk perulangan tak terhingga
    {
        System.out.print("Tebakan anda: ");
        tebakanAnda = input.nextInt();
        if (tebakanAnda == angka) {//wajib menggunakan { jika bernilai true inputannya
        System.out.println("Tebakan anda benar");
        break; //akan dikerjakan mau if nya benar karena break termasuk pada for 
        }
        }
    }
}
