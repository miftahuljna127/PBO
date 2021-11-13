//ingin membuat turunan dari parent class
//pertama tama import dulu
package OOP.accesmodifier;
import OOP.parentClass;

public class childClass extends parentClass {
    public childClass(){
    System.out.println("Constructor dari Child Class");
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);
    //System.out.println("Nilai c: " + c);
    //System.out.println("Nilai d: " + d);
    }
    public static void main(String[] args){
    new childClass();
    }
}
