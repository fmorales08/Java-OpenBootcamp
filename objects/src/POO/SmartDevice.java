package POO;

public class SmartDevice {

    String marca = "apple";
    String color = "plate";
    int weight = 200;
    float screenSize = 10.2f;
    float memoryGb = 4.0f;
    boolean GPS = true;
    boolean bluetooth = true;
    boolean wifi = true;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String color, int weight, float screenSize, float memoryGb, boolean GPS, boolean bluetooth, boolean wifi){
        this.marca = marca;
        this.color = color;
        this.weight = weight;
        this.screenSize = screenSize;
        this.memoryGb = memoryGb;
        this.GPS = GPS;
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }
}
