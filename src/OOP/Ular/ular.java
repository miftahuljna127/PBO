package OOP.Ular;

public class ular {
    String nama, jenis;
    int berat;
    int IDInstance;
    static int jumlahInstance = 0;
    
    public ular(String nama, String jenis, int berat){
    this.nama = nama;
    this.jenis = jenis;
    this.berat = berat;
    jumlahInstance++;
    IDInstance=jumlahInstance;
    }
    
    public ular(String nama){
    this.nama = nama;
    jumlahInstance++;
    IDInstance=jumlahInstance;
    }
    
    void merayap(){
        System.out.println(nama+ " merayap");
    }
    void berbisa(){
        System.out.println(nama+ " berbisa");
    }
    void makan(){
        System.out.println(nama+ " makan");
    }
    
}
