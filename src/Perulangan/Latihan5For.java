package Perulangan;
import java.util.Scanner;

public class Latihan5For {
    public static void main(String[] args){
        int m, n, x;
        float jumlah, ratarata;
        Scanner input = new Scanner(System.in);

        System.out.print("Input batas bawah(M): ");
        m = input.nextInt();
        System.out.print("Input batas atas(N): ");
        n = input.nextInt();
        x = 0;
        jumlah = 0;
        ratarata = 0;

        for (int i = m; i <= n; i++){
            if ((i > 0) && (i % 3 != 0)){
            System.out.print(i + " ");
            x = x + i;
            jumlah++;
            }
        }
        
        ratarata = x/jumlah;
        System.out.println();
        System.out.println("Jumlah Data: " + jumlah);
        System.out.println("Jumlah Nilai: " + x);
        System.out.println("Jumlah rata-rata: " + ratarata);
        input.close();
    }
}
