package eksepsi;

public class EfekThrow {
    public static void main(String[] args){
    RuntimeException r;
    r = new RuntimeException("Eksepsi RuntimeException");
    System.out.println("Sebelum Perintah throw");
    throw(r);
    }
}
//FrameWork = kerangka kerja = Library