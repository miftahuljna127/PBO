package Percabangan;
import java.util.Scanner;
public class PajakKaryawan {
    public static void main(String[] args){
    double penghasilan, pajak;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Penghasilan Anda: Rp. ");
    penghasilan = input.nextDouble();
    if (penghasilan >= 1000000){
        pajak = (penghasilan - 100000)*0.1;
        penghasilan = penghasilan - pajak;
        System.out.println("Pajak Anda Sebesar: Rp. " + pajak);
        System.out.println("Gaji Bersih Anda: Rp. " + penghasilan);
    }else {
        pajak = 0;
        penghasilan = penghasilan - pajak;
    System.out.println("Gaji Bersih Anda: Rp. " + penghasilan);
    System.out.println("Anda Tidak Wajib Membayar Pajak");
    }
    input.close();
    }
}
