package OOP.tv;

public class remoteTv {
    private String merek;
    private int volSuara, maxVol, channel, maxChannel;
    private boolean status;
    
    public remoteTv(String merek, int maxChannel){
        this.merek = merek;
        this.maxChannel = maxChannel;
        channel = 1;
        volSuara = 0; 
        maxVol = 100;
        status = false;
    }
    public void onOff(){
        if (status==false){
            status = true;
            System.out.println("Remote Menyala");
            showInfo();
        } else{
            status = false;
        }
    }
    public void setChannelNext(){
        if (status == true){
        if (channel == maxChannel) {
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
            channel = maxChannel;
        } else {
            channel--;
        }
        System.out.println("Channel: " + channel);
    }
    }
    public void setVolumeUp(){
        if (status == true){
     if (volSuara < maxVol){
        volSuara++;
     }
     System.out.println("Volume: " + volSuara);
    }
    }
    public void setVolumeDown(){
        if (status == true){
        if(volSuara > 0){
            volSuara--;
        }
        System.out.println("Volume: " + volSuara);
    }
    }
    public void showInfo(){
        if (status == true){
        System.out.println("Merk Remote: " + merek);
        System.out.println("Channel saat ini: " + channel);
        System.out.println("Volume: " + volSuara);
        }
    }
}
