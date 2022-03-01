package Larik;
import java.util.Scanner;

public class DaftarNamaForMod {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        String[] nama = new String[7]; //penting pada bagian 
        //new string[7] atau [...] bisa diubah untuk menambah larik
        for (int i = 0; i < nama.length; i++){
            System.out.print("Input Nama Ke-" + (i+1) + ": ");
            nama[i] = input.next();
        }
        System.out.println("Daftar Nama Mahasiswa: ");
            for (int i = 0; i < nama.length; i++) { 
            System.out.println("Nama Ke-" + (i+1) + ": " + nama[i]);
        }
        input.close();
    }
}
//cara menambah tanpa merubah program
//bagian bawah public static void main
//Scanner input = new Scanner(System.in);
//byte jumlahNama;
//System.out.print("Input JUmlah Nama: ");
//JumlahNama = input.nextByte();
//String{} nama = new string[jumlahNama];
