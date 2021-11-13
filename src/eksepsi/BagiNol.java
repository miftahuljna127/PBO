package eksepsi;

public class BagiNol {
    public static void main(String[] args){
        System.out.println("Sebelum Eksepsi");
        try{
            System.out.println(5/0);
    }catch(ArithmeticException a){
        System.out.println("Terjadi Kesalahan akibat" + 
                " pembagian dengan nol");
    }
        System.out.println("Setelah Eksepsi");
    }
}
    //tidak muncul apa apa saat Run->Built Project->OK->tidak muncul apa apa
    //compile sucsess
    //penanganan pakai try
