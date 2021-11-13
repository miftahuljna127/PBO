package OOP.abstactclass;

public abstract class Hewan {
    String nama;
    int umur, tinggiBadan, beratBadan;
    
    abstract void bersuara();
    void berjalan(){
        System.out.println("Berjalan");
    }
}
