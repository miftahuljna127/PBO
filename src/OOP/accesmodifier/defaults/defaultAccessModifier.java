//mencoba mengakses member yang ada di package accessmodifier
//unutk menampilkan access modifier public
package OOP.accesmodifier.defaults;
import OOP.accesmodifier.accesModifier;
//import OOP.accesmodifier.Default;//tidak bisa diakses di package yang lain

public class defaultAccessModifier {
    public static void main(String[] args){
        accesModifier am;
        am = new accesModifier();
        System.out.println("Nilai Attribute a: " + am.a);
        //System.out.println("Nilai Attribute b: " + am.b);
        //System.out.println("Nilai Attribute c: " + am.c);
        //System.out.println("Nilai Attribute d: " + am.d);
        am.showPublic();
       
        //am.showProtected();
        //am.showPrivate();
        //am.showDefault();
        
        System.out.println("Penampilan kelas default");
        System.out.println("Kelas default tidak dapat diakases di package yang lain");
        //masih dapat diakses pada packages yang sama
        //System.out.println("Object Class Default");
        //Default df;
        //df = new Default();
        //df.show();
    }
}
