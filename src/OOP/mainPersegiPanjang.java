package OOP;

public class mainPersegiPanjang {
    public static void main(String[] args){
        PersegiPanjang pp1, pp2;

        pp1= new PersegiPanjang();//untuk membuat objek(pada saat)//default constructor
        pp1.setPanjang(5); //ngeset/mengatur nilai panjang
        pp1.setLebar(3);
        
        System.out.println("Objek Persegi Panjang1");
        System.out.println("Panjang: " + pp1.getPanjang());//seperti bertanya berapakah panjangnya?
        System.out.println("Lebar: " + pp1.getLebar());//bertanya kepada penggguna
        System.out.println("Luas: " + pp1.getLuas());
        System.out.println("Keliing: " + pp1.getKeliling());
        System.out.println("\n");

        pp2= new PersegiPanjang(4,5);
        System.out.println("Objek Persegi Panjang2");
        System.out.println("Panjang: " + pp2.getPanjang());//seperti bertanya berapakah panjangnya?
        System.out.println("Lebar: " + pp2.getLebar());//bertanya kepada penggguna
        System.out.println("Luas: " + pp2.getLuas());
        System.out.println("Keliing: " + pp2.getKeliling());
    }
}
