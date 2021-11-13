package Breakcontinue;
import java.util.Scanner;
import java.util.Random;
public class Latihan3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int acak, tebakanAnda, max;
    System.out.println("PROGRAM TEBAK ANGKA");
    System.out.print("Masukan Maksimal Tebakan: ");
    max = input.nextInt();
    acak = rand.nextInt(max)+1;
    System.out.println("Tebak angka dari 1 s.d. "+max);
    for (;;){
    System.out.print("Tebakan Anda: ");
    tebakanAnda = input.nextInt();
    if(tebakanAnda == acak){
    System.out.println("Tebakan Anda Benar");
    break;
    }else{
            System.out.println("Maf Tebakan Anda Salah. Silahkan Coba Lagi!");
       }
    }
  }
}
