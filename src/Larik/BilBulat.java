package Larik;
import java.util.Scanner;
public class BilBulat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int panjangLarik;
        int nilTampung=0; 
        
        System.out.print("Masukkan banyaknya nilai yang akan di-Inputkan:  ");
        panjangLarik = input.nextInt();
        int[] nilai = new int[panjangLarik];
        
        //Penginputan Nilai
        for (int i=0; i<nilai.length; i++){
            System.out.print("Masukkan Nilai "+i+": ");
            nilai[i] = input.nextInt();
        }
        System.out.println("\nNilai yang telah anda masukkan: ");
        for (int j=0; j<nilai.length; j++){
            System.out.print(nilai[j]+ " ");
        }
        
        //Urutan Nilai dari terkecil ke terbesar
        for (int k=0; k<nilai.length; k++){
            for (int j=k+1; j<nilai.length; j++){
                if (nilai[k] > nilai[j]){
                
                nilTampung = nilai[k];
                nilai[k] = nilai[j];
                nilai[j] = nilTampung;
                }
            }
        }
        System.out.println("\nUrutan nilai dari Terkecil Ke Terbesar");
        for (int l=0; l<nilai.length; l++){
        System.out.print(nilai[l]+ " ");
        }
        
        //Urutan Nilai Dari terbesar ke terkecil
        for (int k=0; k<nilai.length; k++){
            for (int j=k+1; j<nilai.length; j++){
                if (nilai[k] < nilai[j]){
                
                nilTampung = nilai[k];//bisa juga temp(temporari) nilai yang ditampung sementara
                nilai[k] = nilai[j];
                nilai[j] = nilTampung;
                }
            }
        }
        System.out.println("\nUrutan nilai dari Terbesar ke Terkecil");
        for (int l=0; l<nilai.length; l++){
        System.out.print(nilai[l]+ " ");
        }
    }
}
//jika panjangnya 8 maka hanya akan dilakukan 7 fase kenapa? karena pada pada 
//awal awal bagian terakhir telah terurut.