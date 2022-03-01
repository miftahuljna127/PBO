package eksepsi;

public class Eksepsi {
    public static void main(String[] args){
    int x[] = new int[2];
    x[0] = 5;
    x[1] = 2;
    
        for (int i = 0; i <= 3; i++){
            try{
                System.out.println("Nilai elemen x ke- "+i+": "+ x[i]);
            }catch(ArrayIndexOutOfBoundsException a){
            System.err.println("Terjadi kesalahan dalam "+" mengakses indeks dalam sebuah array");}
        }
    }
}
