package Operator;
public class OperatorBitwiseAND {
    public static void main(String[] args){
        int x, y, z;
        x =2; y = 3; z = 5;
        
        System.out.println("Operator Bitwise - AND");
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);
        System.out.println("Hasil Operasi Bitwise: x & y = " + (x & y));
        System.out.println("Hasil Operasi Bitwise: x & z = " + (x & z));
        System.out.println("Hasil Operasi Bitwise: y & z = " + (y & z));
    }
}
