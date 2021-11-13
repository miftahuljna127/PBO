package Larik;
import java.util.Scanner;
public class JumlahMatriks2x3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int A[][] = new int[2][3];
    int B[][] = new int[2][3];
    int C[][] = new int[2][3];
    System.out.println("SELAMAT DATANG DI PROGRAM PENJUMLAHAN MATRIKS");
    System.out.println("=============================================");
    System.out.println("\nMasukkan Nilai Matriks A : ");
    for(int i=0; i<2; i++){//for (int i=0; i<A.length; i++)
        for(int j=0; j<3; j++){//for (int j=0; j<A[0].length; j++)
            System.out.print("[" +i+ "][" +j+ "]: ");
        A[i][j] = input.nextInt();
        }
    }
    System.out.println("Masukkan Nilai Matriks B : ");
    for (int i=0;i<2;i++){
        for (int j=0; j<3;j++){
        System.out.print("[" +i+ "][" +j+ "]: ");
        B[i][j] = input.nextInt();
        }
    }
    System.out.println("\nMatriks A");
    for (int i=0; i<2; i++){
        System.out.print("|");
        for (int j=0; j<3; j++){
            System.out.print(" " +A[i][j]+ " ");
        }
        System.out.println("|");
    }
    System.out.println("Matriks B");
    for (int i=0; i<2; i++){
        System.out.print("|");
        for (int j=0; j<3; j++){
            System.out.print(" " +B[i][j]+ " ");
        }
        System.out.println("|");
    }
    for (int i=0; i<2; i++){
        for (int j=0; j<3; j++){
            C[i][j]= A[i][j] + B[i][j];
        }
      }
    System.out.println("Matriks A + Matriks B = ");
    for (int i=0; i<2; i++){
        System.out.print("|");
        for (int j=0; j<3; j++){
    System.out.print(" " +C[i][j]+ " ");
        }
        System.out.println("|");
    }
    input.close();
    }
}