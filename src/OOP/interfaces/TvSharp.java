package OOP.interfaces;

public class TvSharp implements kontrol {//boleh lebih dari satu interfaces, dengan cara dipisahkan dengan koma,
    
    private String merk, ukuranLayar;
    private boolean status;//hidup = true, mati = false
    private int volumeSuara, channel, jumlahChannel, maxVolume;
    
    public TvSharp(String merk, String ukuranLayar, int jumlahChannel){
        this.merk = merk;
        this.ukuranLayar = ukuranLayar;
        this.jumlahChannel = jumlahChannel;
        channel = 1;
        volumeSuara = 0;
        maxVolume = 100;
        status = false;
    }
    @Override
    public void setOnOff() {
         if (status==false){
            status = true;
            System.out.println("TV Menyala");
            showInfo();
        } else{
            status = false;
            System.out.println("Tv Mati");
        }
    }

    @Override
    public void setChannelNext() {
        if (status == true){
        if (channel == jumlahChannel) {
            channel = 1;
        } else {
            channel++;
        }
        System.out.println("Channel: " + channel);
    }
    }

    @Override
    public void setChannelPrev() {
        if (status == true){
        if (channel == 1){
            channel = jumlahChannel;
        } else {
            channel--;
        }
        System.out.println("Channel: " + channel);
    }
    }

    @Override
    public void setVolumeUp() {
        if (status == true){
     if (volumeSuara < maxVolume){
        volumeSuara++;
     }
     System.out.println("Volume: " + volumeSuara);
    }
    }

    @Override
    public void setVolumeDown() {
         if (status == true){
        if(volumeSuara > 0){
            volumeSuara--;
        }
        System.out.println("Volume: " + volumeSuara);
        }
    }

    @Override
    public void showInfo() {
        if (status == true){
        System.out.println("Merk TV: " + merk);
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Channel saat ini: " + channel);
        System.out.println("Volume: " + volumeSuara);
        }
    }
}
