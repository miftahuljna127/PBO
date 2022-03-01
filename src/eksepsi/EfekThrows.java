package eksepsi;
import java.io.IOException;

public class EfekThrows {
    public static void main(String[] args){
        Kelas objek = new Kelas();
        objek.methodA();
    try{
        objek.methodB();
    }catch(IOException i){
        }
    }
}
