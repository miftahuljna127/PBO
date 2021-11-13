//untuk uji cobe dengan biasanya
package OOP;
public class MainClass {
    public static void main(String[] args){//ada method main bisa main(tanda segitiga)
        //bisa di compile tapi tak bisa di runnning\
        System.out.println("Jumlah objek manusia: " + Manusia.jumlahInstance);// ini adalah statement awal.....
        System.out.println("\n");
        Manusia manusia1, manusia2, manusia3;//deklarasi satu objek atau dua
        manusia1= new Manusia();//pembuatan objek
        System.out.println("Nama: " + manusia1.nama);
        System.out.println("Umur: " + manusia1.umur + " tahun");
        System.out.println("Berat Badan: " + manusia1.beratBadan + " kg");
        System.out.println("Tinggi Badan: "+ manusia1.tinggiBadan + " cm");
        manusia1.berjalan();
        manusia1.berlari();
        manusia1.makan();
        manusia1.minum();
        System.out.println("Jumlah objek saat ini: " + Manusia.jumlahInstance);
        System.out.println("\n");
        manusia2 = new Manusia("Budi", 20, 55, 158);
        System.out.println("Nama: " + manusia2.nama);
        System.out.println("Umur: " + manusia2.umur + " tahun");
        System.out.println("Berat Badan: " + manusia2.beratBadan + " kg");
        System.out.println("Tinggi Badan: "+ manusia2.tinggiBadan + " cm");
        manusia2.berjalan();
        manusia2.berlari();
        manusia2.makan();
        manusia2.minum();
        System.out.println("Jumlah objek saat ini: " + Manusia.jumlahInstance);
        System.out.println("\n");
        manusia3 = new Manusia("Cika");
        System.out.println("Nama: " + manusia3.nama);
        System.out.println("Umur: " + manusia3.umur + " tahun");
        System.out.println("Berat Badan: " + manusia3.beratBadan + " kg");
        System.out.println("Tinggi Badan: "+ manusia3.tinggiBadan + " cm");
        manusia3.berjalan();
        manusia3.berlari();
        manusia3.makan();
        manusia3.minum();
        System.out.println("Jumlah objek saat ini: " + Manusia.jumlahInstance);//manusia itu class
        System.out.println("\n");
        System.out.println("Nama: " +manusia1.nama);
        System.out.println("Jumlah objek saat ini: " + manusia1.jumlahInstance);
        System.out.println("ID Instance: " +  manusia1.idInstance);
        System.out.println("Nama: " + manusia2.nama);
        System.out.println("Jumlah objek saat ini: " + manusia2.jumlahInstance);
        System.out.println("ID Instance: " +manusia2.idInstance);
        System.out.println("Nama: " + manusia3.nama);
        System.out.println("Jumlah objek saat ini: " + manusia3.jumlahInstance);
        System.out.println("ID INstance: " + manusia3.idInstance);
    }
}
