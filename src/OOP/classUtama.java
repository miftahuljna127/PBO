//Penggabungan dua buah object
package OOP;

public class classUtama {
    public static void main(String[] args){
        //Deklarasi variabel ->tipedatanya manusia, constroctur nya beda
        //kenapa bisa karena mhs turunan dari manusia, dan pgw turunan dari manusia
        //Manusia mhs1, pgw1;//yang muncul hanya object manusia saja tidak spesifiknya 
        //atau bisa juga dideklarasikan seperti dibawah ini
        Mahasiswa mhs1;
        Pegawai pgw1; //kenapa bisa? karena satu turunan
        //Pembuatan object mahasiswa
        mhs1 = new Mahasiswa();
        System.out.println("Nama Mahasiswa: "+ mhs1.nama);
        mhs1.kuliah();
        //Pembuatan object pegawai
        pgw1 = new Pegawai();
        System.out.println("Nama Pegwai: " +pgw1.nama);
        pgw1.kerja();
    }
}
