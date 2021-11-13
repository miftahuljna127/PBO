package Operator;
public class OperatorLogikaOR {
    public static void main(String[] args) {
    int x, y, z;
    x = 4; y = 2; z = 5;
    System.out.println("Nilai Awal");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("Operasi Logika ||");
    System.out.println("(x==y) || (++x==z) => " + ((x==y) || (++x==z)));
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("(x==z) || (++x==z) => " + ((x==z) || (++x==z)));
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    x = 4; y = 3; z =4;
    System.out.println("Nilai Awal");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    System.out.println("Operator Logika |");
    System.out.println("(x==y) | (++x==z) => " + ((x==y) | (++x==z)));
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z + " + z);
    System.out.println("(x==z) | (++x==z) => " + ((x==z) | (++x==z)));
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);
    }
}
