package Operator;
public class OperatorKondisional {
    public static void main(String[] args){
        int x, y, z;
        String hasil;
        x = 6; y = 4; z = 9;
        hasil = "Belum Diketahui";

        System.out.println("Nilai Awal");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("hasil = " + hasil);

        System.out.println("Operator Kondisional");
        System.out.println("Contoh 1:");
        System.out.println("hasil = (x>y) ? \"Benar\" : \"Salah\"");
        hasil = (x>y) ? "Benar" : "Salah";

        System.out.println("Nilai variabel hasil = " + hasil);
        System.out.println("Contoh 2:");
        System.out.println("hasil = (x>z) ? \"Benar\" : \"Salah\"");
        
        hasil = (x>z) ? "Benar" : "Salah";
        System.out.println("Nilai variabel hasil = " + hasil);
    }
}
