package OOP.tv;

public class mainTelevisi {
    public static void main(String[] args){
    televisi tv;
    tv = new televisi("Toshiba", "21 inch", 10);
    RemoteTelevisi remoteTv;
    remoteTv = new RemoteTelevisi("Toshiba", "hitam");
    remoteTv.setOnOff(tv);
    remoteTv.setChannel(tv, 5);
    remoteTv.setChannel(tv, 12);
    }
}
