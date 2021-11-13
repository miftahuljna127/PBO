package Perulangan;
import java.util.Scanner;
public class Latihan1While {
   public static void main(String[] args){
   int n, i ;
   i = 1;
   Scanner input = new Scanner(System.in);
   System.out.print("Input Jumlah Perulangan: ");
   n = input.nextInt();
   while (i <= n){
    System.out.print(i + " ");
   i++;}
   input.close();
   }
}