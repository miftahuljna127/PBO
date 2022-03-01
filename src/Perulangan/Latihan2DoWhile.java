package Perulangan;
import java.util.Scanner;

public class Latihan2DoWhile {
    public static void main(String[] args){
        int n, i;
        i = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Jumlah Perulangan(N): ");
        n = input.nextInt();
        do {
        System.out.print(i + " ");
        i++;
        }
        while (i <= n);
        input.close();
    }
}
