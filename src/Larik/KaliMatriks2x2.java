package Larik;
import java.util.Scanner;
public class KaliMatriks2x2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int A[][] = new int[2][2];
    int B[][] = new int[2][2];
    int C[][] = new int[2][2];
    System.out.println("SELAMAT DATANG DI PROGRAM PERKALIAN MATRIKS");
    System.out.println("===========================================");
    System.out.println("\nMasukkan Nilai Matriks A: ");
    for (int i=0; i<A.length; i++){
        for (int j=0; j<A[0].length; j++){
            System.out.print("[" +i+ "][" +j+ "]: ");
                A[i][j] = input.nextInt();
        }
    }
    System.out.println("Masukkan Nilai Matriks B: ");
    for (int j=0; j<B.length; j++){
        for (int i=0; i<B[0].length; i++){
            System.out.print("[" +j+ "][" +i+ "]: ");
                B[j][i] = input.nextInt();
        }
    }
    System.out.println("\nMatriks A: ");
    for (int k=0; k< A.length; k++){
        System.out.print("|");
            for (int j=0; j<A[0].length; j++){
                System.out.print(" " +A[k][j]+ " ");
        }
                    System.out.println("|");
    }
    System.out.println("Matriks B: ");
    for (int l=0; l<A.length; l++){
        System.out.print("|");
            for (int j=0; j<A[0].length; j++){
                System.out.print(" " +B[l][j]+ " ");
        }
                    System.out.println("|");
    }    
    //Perkalian Matriks A x Matriks B  
    for (int m=0; m<C.length; m++){
            for (int j=0; j<C[0].length; j++){
                int hasil=0;
                    for (int n=0; n<C.length; n++){
                        hasil = hasil + (A[m][n] * B[n][j]);
            }
                    C[m][j] = hasil;
        }
    }
    System.out.println("Hasil Matriks A x Matriks B = ");
    for (int i=0; i<C.length; i++){
        System.out.print("|");
            for (int j = 0; j<C[0].length; j++){
                System.out.print(" " +C[i][j]+ " ");
        }
                    System.out.println("|");
    }
  }
}
