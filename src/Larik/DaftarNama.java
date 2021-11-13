package Larik;
public class DaftarNama {
    public static void main(String[] args){
    String[] nama;   //Pendeklarasian larik
    nama = new String[5];  //Pembuatan objek larik 
    nama[0] = "Andi";  //Isi data larik sama  
    nama[1] = "Budi";
    nama[2] = "Cika";
    nama[3] = "Dika";
    nama[4] = "Edo";
    //menampilkan data larik
    //ke layar output(Console)
    System.out.println("Nama 1: " + nama[0]);
    System.out.println("Nama 2: " + nama[1]);
    System.out.println("Nama 3: " + nama[2]);//(+)operator penggsbungan string
    System.out.println("Nama 4: " + nama[3]);//atau konkatenasi
    System.out.println("Nama 5: " + nama[4]);//Supaya ada keterangannya
    }
}
