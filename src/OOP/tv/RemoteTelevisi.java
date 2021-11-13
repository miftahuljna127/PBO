package OOP.tv;
public class RemoteTelevisi {//buat karakteristik
      private String merek;
      private String warna;
      
      public RemoteTelevisi(String merek, String warna){
            this.merek = merek;
            this.warna = warna;
}
      public void  setOnOff(televisi tv){//parameter=variabel
            tv.setOnOff();//seperti tombol onOff
      }
      
      public void setChannelNext(televisi tv){
            tv.setChannelNext();
      }
      
      public void setChannelPrev(televisi tv){
            tv.setChannelPrev();
      }
      
      public void setVolumeUp(televisi tv){
            tv.setVolumeUp();
      }
      
      public void setVolumeDown(televisi tv){
            tv.setVolumeUp();
      }
      public void setChannel(televisi tv, int channel){
            tv.setChannel(channel);
      }
      public void showInfo(televisi tv){
            tv.showInfo();
      }
}