package Perulangan;
import java.util.Scanner;
public class Latihan1ForUlang {
   public static void main(String[] args){
   int n;
   Scanner input = new Scanner(System.in);
   System.out.print("Input jumlah perulangan(n): ");
   n = input.nextInt();
   for (int i = 1; i<= n; i++){
       System.out.print(i + " ");
   }
   input.close();
   }
}
