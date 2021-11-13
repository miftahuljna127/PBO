package Perulangan;
import java.util.Scanner;
public class Latihan4DoWhile {
    public static void main(String[] args){
    int m, n;
    Scanner input = new Scanner(System.in);
    System.out.print("Input Batas Bawah(M): ");
    m = input.nextInt();
    System.out.print("Input Batas Atas(N): ");
    n = input.nextInt();
    if (n > m)
    do {
        if ((m % 2 == 0) || (m % 5 == 0)){
    System.out.print(" ");}
        else
    System.out.print(m + " ");
    m++;
    }
    while(m <= n);
    input.close();
    }
}
