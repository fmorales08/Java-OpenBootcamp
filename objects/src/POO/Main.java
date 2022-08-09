package POO;
import POO.SmartDevice ;
import POO.SmartPhone;
import POO.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartDevice mi11 = new SmartDevice("Xiaomi", "blue", 158, 8.6f, 164, true, true, true);
        System.out.println(mi11);
        SmartDevice iphone12 = new SmartPhone("apple", "white", 220, 6.6f, 220, true, true, true, 3, "ios");
        System.out.println(iphone12);
        SmartWatch gt2   = new SmartWatch("Huawei", "black", 50, 1.3f, 0.1f, true, true, false, false, true, "amoled" );
        System.out.println(gt2);

    }}