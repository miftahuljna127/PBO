package Larik;
import java.util.Scanner;

public class Matriks2x2For {
    public static void main(String[] args){
        int[][] matriks2x2 = new int[2][2];
        Scanner input = new Scanner(System.in);
        //mengisi elemen matriks
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print("Matriks[" + i + "]["+ j+ "]: ");
                matriks2x2[i][j] = input.nextInt();
            }
        }
        
        //menampilkan atau mencetak elemen matriks ke layar console
        System.out.println("MATRIKS 2x2");
        for (int i = 0; i <2; i++){
            System.out.print("|");
            for (int j = 0; j < 2; j++){
                System.out.print(" " + matriks2x2[i][j] + " ");
            }
            System.out.println("|");
        }
        input.close();
    }
}
