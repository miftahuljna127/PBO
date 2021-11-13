package Perulangan;
import java.util.Scanner;
public class Latihan2While {
    public static void main(String[] args){
    int n, i;
    i = 10;
    Scanner input = new Scanner(System.in);
    System.out.print("Input jumlah Perulangan(N): ");
    n = input.nextInt();
    while (i <= n){
    System.out.print(i + " ");
    i++;
    }
    input.close();
    }
}
