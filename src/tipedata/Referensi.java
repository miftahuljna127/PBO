package tipedata;
public class Referensi {
    public static void main(String args[]){
        
    String nama, jenisKelamin, statusMenikah;
    Integer nilai;
    Manusia manusia;
    Kucing kucing;
    
    nama = "Andi";
    jenisKelamin = "Pria";
    statusMenikah = "Menikah";
    nilai = 10;
    manusia = new Manusia();
    kucing = new Kucing();
    
    System.out.println(nama);
    System.out.println(jenisKelamin);
    System.out.println(statusMenikah);
    System.out.println(nilai);
    System.out.println(manusia);//diambil dari kelas manusia
    System.out.println(manusia.NAMA);
    System.out.println(manusia.TINGGI_BADAN);
    System.out.println(manusia.BERAT_BADAN);
    manusia.berjalan();
    manusia.berlari();
    manusia.makan();
    manusia.minum();
    //diambil dari kelas kucing
    System.out.println(kucing.NAMA);
    System.out.println(kucing.WARNA_BULU);
    System.out.println(kucing.JENIS);
    kucing.bersuara();
    kucing.berjalan();
    kucing.melompat();
   }
}
