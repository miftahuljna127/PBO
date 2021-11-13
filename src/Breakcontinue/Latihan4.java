package Breakcontinue;
import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args){
    int nilai, pangkat, i, hasil;
    hasil = 1;
    i = 1;
    Scanner input = new Scanner(System.in);
    System.out.println("Program Perpangkatan");
    System.out.print("Input bilangan yang akan dipangkatkan: ");
    nilai = input.nextInt();
    System.out.print("Input pangkat: ");
    pangkat = input.nextInt();
    while (true) {
    if (i <= pangkat){
        hasil = hasil * nilai;
        i++;        
        }
    else 
        break; }
    System.out.println("Hasil dari "+nilai+" pangkat "+pangkat+" adalah "+hasil);
    }
}
