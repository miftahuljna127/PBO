package eksepsi;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EksepsiBertingkat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    int x, y;
    try{
    System.out.print("Input Nilai X: ");
    x = input.nextInt();
    System.out.print("input Nilai Y: ");
    y = input.nextInt();
    System.out.println("Hasil => x / y = " + (x/y));
        }catch(InputMismatchException i){//lakukan import
            System.err.println("terjadi kesalahan input nilai");
        }catch(ArithmeticException i){
            System.err.println("Terjadi kesalahan akibat" + 
                    "pembagian dengan nol");
        }
    input.close();
    }
}
