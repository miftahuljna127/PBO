package Perulangan;
import java.util.Scanner;

public class Latihan3For {
    public static void main(String[] args){
        int m, n;
        Scanner input = new Scanner(System.in);

        System.out.print("Input Batas Bawah(M): ");
        m = input.nextInt();
        System.out.print("Input Batas Atas(N): ");
        n = input.nextInt();
        
        for (int i = m; i <= n; i++){
            if ((i % 2 == 1) || (i % 4 == 0)){
            System.out.print(" ");}
        else
            System.out.print(i+ " ");
        }
        input.close();
    }
}
