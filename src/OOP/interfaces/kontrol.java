package OOP.interfaces;

public interface kontrol {//Interface itu kontrol
    //di interface semua adalah abstract method
    //tapi juga bisa mendefinisikan yang bukan abstract, hanya mendefinisikan saja
    //interface khusus mendefinisikan fitur fitur objek itu apa saja terkait dengan perilaku(karakteristik jarang)
    abstract void setOnOff();
    abstract void setChannelNext();
    abstract void setChannelPrev();
    abstract void setVolumeUp();
    abstract void setVolumeDown();
    abstract void showInfo();
}
