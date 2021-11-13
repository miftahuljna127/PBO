package Perulangan;
import java.util.Scanner;
public class Latihan6For {
    public static void main(String[] args){
        int n;
        long fak;
        Scanner input = new Scanner(System.in);
        System.out.print("Input faktorial(n): ");
        n = input.nextInt();
        fak = 1;
        for (int i = 1; i <= n; i++){
            fak= i*fak;
        }
        System.out.println("Faktorial dari ("+n+"): " + fak);
    }
}
