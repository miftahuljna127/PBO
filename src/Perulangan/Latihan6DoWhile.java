package Perulangan;
import java.util.Scanner;

public class Latihan6DoWhile {
    public static void main(String[] args){
        int i=1, n;
        long fak = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Input faktorial(n): ");
        n = input.nextInt();
        if(n>0)
            do{
            fak=i*fak;
            System.out.println("faktorial dari "+n+" adalah " +fak);
            i++;
            }while(i<=n);
        else
                System.out.println("Input anda salah!!");
        input.close();
    }
}
