package Perulangan;
import java.util.Scanner;

public class Latihan2For {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah perulangan(N): ");
        n = input.nextInt();
        for (int i = 10; i <= n; i++){
        System.out.print(i + " ");
        }
        input.close();
   }
}
