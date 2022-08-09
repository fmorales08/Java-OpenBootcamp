package POO;
import POO.SmartDevice;


public class SmartWatch extends SmartDevice {
    boolean appStore = true;
    boolean mic = false;
    String display = "amoled";

    public SmartWatch(String marca, String color, int weight, float screenSize, float memoryGb, boolean GPS, boolean bluetooth, boolean wifi , boolean appStore, boolean mic, String display){
        this.marca = marca;
        this.color = color;
        this.weight = weight;
        this.screenSize = screenSize;
        this.memoryGb = memoryGb;
        this.GPS = GPS;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.appStore = appStore;
        this.mic = mic;
        this.display = display;

}

}
