package Perulangan;
import java.util.Scanner;
public class Latihan3DoWhile {
    public static void main(String[] args){
    int m, n;
    Scanner input = new Scanner(System.in);
    System.out.print("Input Batas Bawah(M): ");
    m = input.nextInt();
    System.out.print("Input Batas Atas(N): ");
    n = input.nextInt();
    if (n > m)
    do{
        if ((m%4==0)||(m%2==1)){
    System.out.print(" ");}
        else
    System.out.print(m+ " ");
    m++;
    }while(m <= n);
    input.close();
    }
}
