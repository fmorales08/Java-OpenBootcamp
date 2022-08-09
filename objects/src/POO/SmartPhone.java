package POO;
import POO.SmartDevice;

public class SmartPhone extends SmartDevice {
        int cams = 3;
        String SO = "android";

        public SmartPhone(String marca, String color, int weight, float screenSize, float memoryGb, boolean GPS, boolean bluetooth, boolean wifi, int cams, String SO){
            this.marca = marca;
            this.color = color;
            this.weight = weight;
            this.screenSize = screenSize;
            this.memoryGb = memoryGb;
            this.GPS = GPS;
            this.bluetooth = bluetooth;
            this.wifi = wifi;
            this.cams = cams;
            this.SO = SO;
    }
    }
