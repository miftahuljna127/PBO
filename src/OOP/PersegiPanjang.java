package OOP;

public class PersegiPanjang {
    //Deklarasi variabel
    private float panjang, lebar, luas, keliling;
    
    public PersegiPanjang(){//menentukan nilai pada saat pembuatan objek
    }
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;} 
    //methods
    public void setPanjang(float panjang){//setter panjang
        this.panjang = panjang;//memerlukan this untuk mengakses instance panjang
    }
    public float getPanjang(){//getter panjang
        return panjang;
    }
    public void setLebar(float lebar){//setter lebar
        this.lebar = lebar;
    }
    public float getLebar(){//getter lebar
        return lebar;
    }
    public void setLuas(float luas){
        this.luas = luas;
    }
    public float getLuas(){
        hitungLuas();//masukkan untuk penghitungan
        return luas;
    }
    public void setKeliling(float keliling){
        this.keliling = keliling;
    }
    public float getKeliling(){
        hitungKeliling();
        return keliling;
    }
    private void hitungLuas(){
        luas = panjang * lebar;
    }
    private void hitungKeliling(){
        keliling = 2 * (panjang + lebar);
    }
    
}
