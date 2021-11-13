package OOP.drone;

public class drone {
    //variabel/attribute
    private int energi, jumlahEnergi;
    private int ketinggian, jumlahTinggi;
    private int kecepatan, maxKecepatan;
    private String merek;
    private boolean status;
    
    public drone(String merek){
        this.merek = merek;
        status = false;
        kecepatan =0;
        energi=0;
    }
    
    //method/fungsi
     public void onOff(){
        if (status==false){
            status = true;
            System.out.println("Drone Menyala");
            showInfo();
        } else{
            status = false;
        }
    }
    public void terbang(){
        if (status == false){
    if (energi == jumlahEnergi){
        energi = 1;
    }else{
        energi++;
    }
            System.out.println("Energi: " + energi);
    }
    }
    
    public void matikanMesin(){
          if (status == false){
    if (ketinggian == jumlahTinggi){
        ketinggian = 1;
    }else{
        ketinggian++;
    }
            System.out.println("Energi: " + ketinggian);
    }
    }
    
    public void turun(){
    ketinggian--;
    energi--;
        System.out.println("Drone turun");
    }
    
    public void belok(){
    energi--;
        System.out.println("Drone belok");
    }
    
    public void mundur(){
    energi--;
        System.out.println("Drone mundur");
    kecepatan++;
    }
  public void showInfo(){
        if ( energi > 10){
            System.out.println("");
        System.out.println("Kecepatan: " +kecepatan);
        System.out.println("Ketinggian: " + ketinggian);
        System.out.println("Status: " + status);
        }   
  }
}