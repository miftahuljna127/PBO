package OOP;

public class MainMahasiswa {
    public static void main(String[] args){
        //Deklarasi variabel mhs1 bertipe data string Mahasiswa
        //untuk menampung atau menyimpan  object mahasiswa
        Mahasiswa  mhs1;
        //pembuatan object mahasiswa yang selanjutnya disimpan di variabel mhs1
        mhs1 = new Mahasiswa();
        System.out.println("Nama: " + mhs1.nama);
        mhs1.berjalan();
        mhs1.berlari();
        mhs1.makan();
        mhs1.minum(); 
        mhs1.kuliah();
    }
}
