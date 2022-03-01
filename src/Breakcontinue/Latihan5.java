package Breakcontinue;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args){
    int nilai, pangkat, i, hasil;
    char tanya = 'Y';

    Scanner input = new Scanner(System.in);
    System.out.println("Program Perpangkatan");
    Task:
    while (tanya == 'Y'){{
    System.out.print("Input bilangan yang akan dipangkatkan: ");
    nilai = input.nextInt();
    System.out.print("Input pangkat: ");
    pangkat = input.nextInt();
    hasil = 1;
    i = 1;
    }
    { while (true){
        if (i <= pangkat){
            hasil = hasil * nilai;
            i++;
        }else {
            System.out.println("Hasil dari "+nilai+" pangkat "+pangkat+" adalah "+hasil);
            System.out.print("Ingin Coba Lagi(Y/T)?");
            tanya = input.next().toUpperCase().charAt(0);
            continue Task;
        }
      }
    }
    }
  }
}
