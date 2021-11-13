package OOP.Ular;

public class mainUlar {
    public static void main(String[] args){
    
    ular ular1, ular2;
    ular1 = new ular("Cobra", "berbisa", 50);
    System.out.println("Nama: " + ular1.nama);
        System.out.println("Jenis Ular: "+ ular1.jenis);
        System.out.println("Berat Ular: " + ular1.berat + " kg");
        ular1.merayap();
        ular1.berbisa();
        ular1.makan();
        }
}
