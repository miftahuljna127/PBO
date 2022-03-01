package Percabangan;
import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args){
        byte golongan;
        double gajiPokok, totalGaji, tunJabatan;
        Scanner input = new Scanner(System.in);

        System.out.print("Input golongan anda: ");
        golongan = input.nextByte();
        gajiPokok = 0;
        totalGaji = 0;
        tunJabatan= 0;

        if (golongan == 1){
            gajiPokok = 1000000;
            tunJabatan = gajiPokok * 0.05;
            totalGaji = gajiPokok + tunJabatan;
        }else if (golongan == 2){ 
            gajiPokok = 1500000;
            tunJabatan = gajiPokok * 0.1;
            totalGaji = gajiPokok + tunJabatan;
        }else if (golongan == 3){
            gajiPokok = 2000000;
            tunJabatan = gajiPokok * 0.1;
            totalGaji = gajiPokok + tunJabatan;
        }else if (golongan == 4){
            gajiPokok = 2500000;
            tunJabatan = gajiPokok * 0.15;
            totalGaji = gajiPokok + tunJabatan;
        } else if (golongan == 5){
            gajiPokok = 3000000;
            tunJabatan = gajiPokok * 0.2;
            totalGaji = gajiPokok + tunJabatan;
        }
        
        System.out.println("Gaji Pokok       :Rp. " + gajiPokok);
        System.out.println("Tunjangan Jabatan:Rp. " + tunJabatan);
        System.out.println("Gaji total       :Rp. " + totalGaji);
        input.close();
    }
    
}
