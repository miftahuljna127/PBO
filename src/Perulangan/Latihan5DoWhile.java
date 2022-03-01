package Perulangan;
import java.util.Scanner;

public class Latihan5DoWhile {
    public static void main(String[] args){
        int m, n, x;
        double jumlah, ratarata;
        Scanner input = new Scanner(System.in);

        System.out.print("Input Batas Bawah(M): ");
        m = input.nextInt();
        System.out.print("Input Batas Atas(N): ");
        n = input.nextInt();
        jumlah = 0;
        ratarata =0;
        x = 0;

        if (m<n)
            do{
            if(m%3==0){
                System.out.print(" ");
            } else{
                System.out.print(m+ " " );
                x=x+1;
                jumlah +=m;
            }
            m++;
            }while (m<=n);
                ratarata = jumlah/x;
        System.out.println();
        System.out.println("Jumlah Data: " + jumlah);
        System.out.println("Jumlah Nilai: " + x);
        System.out.println("Jumlah rata-rata: " + ratarata);
        input.close();
    }
}
