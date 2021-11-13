package eksepsi;

public class EfekThrow2 {
    public static void main(String[] args){
    try{
        System.out.println(5/0);
    }catch(ArithmeticException a){
        a = new ArithmeticException("terjadi Kesalahan" + 
                " pembagian dengan angka nol");
    throw(a);//digunakan untuk melontarkan pesan yang telah dibuat pada baris ke 8
        }
    }
}