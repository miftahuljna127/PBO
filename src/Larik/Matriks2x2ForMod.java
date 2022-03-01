package Larik;
import java.util.Scanner;

public class Matriks2x2ForMod {
    public static void main(String[] args){
        int[][] matriks2x2 = new int[2][2]; // dirubah pada bagian new int [0][0]
        Scanner input = new Scanner(System.in);
        byte baris, kolom; //menambah tanpa merubah
        System.out.print("Input panjang baris: ");
        baris = input.nextByte();
        System.out.print("Input panjang kolom: ");
        kolom = input.nextByte();/// menambah tanpa merubah

        //mengisi elemen matriks
        for (int i = 0; i < matriks2x2.length; i++){
            for (int j = 0; j < matriks2x2[0].length; j++){
                System.out.print("Matriks[" + i + "]["+ j+ "]: ");
                matriks2x2[i][j] = input.nextInt();
            }
        }
        
        //menampilkan atau mencetak elemen matriks ke layar console
        System.out.println("MATRIKS 2x2");
        for (int i = 0; i < matriks2x2.length; i++){
            System.out.print("|");
            for (int j = 0; j < matriks2x2[0].length; j++){
                System.out.print(" " + matriks2x2[i][j] + " ");
            }
            System.out.println("|");
        }
        input.close();
    }
}
