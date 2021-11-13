package Percabangan;
import java.util.Scanner;
public class KomentarNilaiHuruf {
    public static void main(String[] args) {
        char value;
        String komentar;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Huruf (A s.d E): ");
        value = input.next().toUpperCase().charAt(0);
        switch (value){
            case 'A': komentar = "Istimewa";
                break;
            case 'B': komentar = "Baik";
                break;
            case 'C' : komentar = "Cukup";
                break;
            case 'D': komentar = "Kurang";
                break;
            case 'E': komentar = "Tidak Lulus";
                break;
            default: komentar = "Mohon periksa kembali";
                break;
        }
        System.out.println("Komentar: " + komentar);
        input.close();
    }
}
