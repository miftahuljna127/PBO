//pengimplementasian
package OOP; //package = folder

public class Manusia {//class
    //attribute atau variable atau state atau instance member
    String nama;//class member
    int umur;//instance member
    int beratBadan;//instance member
    int tinggiBadan;//instance member harus dibuat objek dahulu
    //default constructor//nama method sama dengan nama class ciri ciri costructor
    //method atau perilaku atau behavior
    int idInstance = 0;//untuk memberikan id ke masing masing objek
    //static int id =0;//class member..setiap pembuatan objek nilai id akan di incrementkan
    //menuliskan id++ dalam constructor, kemudian buat statement diawal..
    static int jumlahInstance = 0;//untuk menentukan berapa banyak objek yang telah dibuat///class member
    //--------------------------------------------------------------
    //constructor.. tidak lagi menggunakan nilai default
    public Manusia(){
        nama = "Andi";
        umur = 20;
        beratBadan = 50;
        tinggiBadan = 160;
        jumlahInstance++;
        idInstance = jumlahInstance;
}
    //constructor2
    public Manusia(String nama, int umur, int beratBadan, int tinggiBadan){
    this.nama = nama;
    this.umur = umur;
    this.beratBadan = beratBadan;
    this.tinggiBadan = tinggiBadan;
    jumlahInstance++;
    idInstance = jumlahInstance;
}
    //constructor 3
    public Manusia(String nama){
    this.nama = nama;
    jumlahInstance++;//jumlah objeknya akan bertambah
    idInstance = jumlahInstance;
}
    void berlari(){
        System.out.println(nama+ " berlari");
    }
    void berjalan(){
        System.out.println(nama+ " berjalan");
    }
    void makan(){
        System.out.println(nama+ " makan");
    }
    void minum(){
        System.out.println(nama+ " minum");
    }
    
}
