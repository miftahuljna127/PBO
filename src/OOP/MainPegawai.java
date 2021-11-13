package OOP;

public class MainPegawai {
    public static void main(String[] args){
    
    Pegawai pgw1;
    pgw1 = new Pegawai();
     System.out.println("Nama: " + pgw1.nama);
        pgw1.berjalan();
        pgw1.berlari();
        pgw1.makan();
        pgw1.minum(); 
        pgw1.kerja();
    }
}
