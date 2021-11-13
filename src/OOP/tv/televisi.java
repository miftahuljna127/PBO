package OOP.tv;

public class televisi {
    //Deklarasi variabel
    private String merk, ukuranLayar;
    private boolean status;//hidup = true, mati = false
    private int volumeSuara, channel, jumlahChannel, maxVolume;
    
public televisi(String merk, String ukuranLayar, int jumlahChannel){
        this.merk = merk;
        this.ukuranLayar = ukuranLayar;
        this.jumlahChannel = jumlahChannel;
        channel = 1;
        volumeSuara = 0;
        maxVolume = 100;
        status = false;
    }
    public void setOnOff(){
        if (status==false){
            status = true;
            System.out.println("TV Menyala");
            showInfo();
        } else{
            status = false;
            System.out.println("Tv Mati");
        }
    }
    public void setChannelNext(){
        if (status == true){
        if (channel == jumlahChannel) {
            channel = 1;
        } else {
            channel++;
        }
        System.out.println("Channel: " + channel);
    }
    }
    public void setChannelPrev(){
        if (status == true){
        if (channel == 1){
            channel = jumlahChannel;
        } else {
            channel--;
        }
        System.out.println("Channel: " + channel);
    }
    }
    public void setVolumeUp(){
        if (status == true){
     if (volumeSuara < maxVolume){
        volumeSuara++;
     }
     System.out.println("Volume: " + volumeSuara);
    }
    }
    public void setVolumeDown(){
        
        if (status == true){
        if(volumeSuara > 0){
            volumeSuara--;
        }
        System.out.println("Volume: " + volumeSuara);
        }
    }
    
    public void setChannel(int channel){//agar channel remote bisa terhubung ke tv
        
        if ((channel >=1) && (channel <= jumlahChannel)){//untuk menset jumlah channel
        this.channel = channel;
        System.out.println("Channel Saat Ini: " + channel);
        } else {
        System.out.println("Channel Tidak Ditemukan");
        }
    }
    
    public void showInfo(){
        
        if (status == true){
        System.out.println("Merk TV: " + merk);
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Channel saat ini: " + channel);
        System.out.println("Volume: " + volumeSuara);
        }
    }
}