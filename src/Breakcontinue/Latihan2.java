package Breakcontinue;
import java.util.Scanner;
import java.util.Random;

public class Latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int acak = rand.nextInt(10)+1;
        int tebakanAnda;
        System.out.println("PROGRAM TEBAK ANGKA (1 S.D. 10) ");
        for (;;)
        {
        System.out.print("Tebakan Anda: ");
        tebakanAnda = input.nextInt();
        if (tebakanAnda == acak){
        System.out.print("Tebakan Anda Benar");
        break;
        } else {
        System.out.println("Maaf Tebakan Anda Salah. Silahkan Coba Lagi! ");
        }
        }
    }
}
