package Perulangan;
import java.util.Scanner;
public class Latihan3While {
    public static void main(String[] args){
    int m, n;
    Scanner input = new Scanner(System.in);
    System.out.print("Input Batas Bawah(M): ");
    m = input.nextInt();
    System.out.print("Input Batas Atas(N): ");
    n = input.nextInt();
    while (m <= n){
    if ((m % 2 == 1) || (m % 4 == 0)){
    System.out.print(" ");}
    else
    System.out.print(m +" ");
    m++;
    } 
    input.close();
    }
}
