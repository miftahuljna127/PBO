package Perulangan;
import java.util.Scanner;
public class Latihan6While {
    public static void main(String[] args){
        int i=1, n;
        long fak;
        Scanner input = new Scanner(System.in);
        System.out.print("Input faktorial(n): ");
        n = input.nextInt();
        fak = 1;
        while(i<=n){
            fak=i*fak;
        i++;
        }
        System.out.println("Faktorial dari ("+n+"): " + fak);
        input.close();
    }
}