package OOP.polimorfisme;

public class Hewan {
    String nama;//private tidak diwariskan 
    int umur, beratBadan, tinggiBadan;
    
    void berjalan(){
        System.out.println("Berjalan");
    }
    
    void bersuara(){
        System.out.println("Bersuara");
    }
}
