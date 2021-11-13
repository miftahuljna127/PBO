package OOP.accesmodifier;

public class mainaccessModifier {
    public static void main(String[] args){
        accesModifier am;//deklarasi variabel am
        //pembuatan objek dari class accessmodifier yang kemudian
        //ditampung atau disimpan ke dalam variabel am
        am = new accesModifier();
        System.out.println("Nilai attribute a: " + am.a);
        System.out.println("Nilai attribute b: " + am.b);
        //System.out.println("Nilai attribute c: " + am.c);
        //am.c tidak dapat diakses melalui kelas lain karena private
        //private hanya dapat diakses melalui kelasnya sendiri
        System.out.println("Nilai attribute d: " + am.d);
        
        am.showPublic();
        am.showProtected();
        //am.showPrivate();
        //am.showprivate() tidak adapat diakses oleh class lain
        //kecuali ada pemanggilan nama private didalamnya seperti "showPrivate();
        //dibagian private void dibawah System.out.println
        am.showDefault();
    }
}
