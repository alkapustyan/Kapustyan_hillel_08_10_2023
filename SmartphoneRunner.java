package ua.vodafone.homework;

import java.util.Arrays;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone[] devices = {new Androids("Nokia", "111"),
                                new Androids("Xiaomi", "222"),
                                new Iphones("IPhone 10", "333"),
                                new Iphones("IPhone 15", "444")};

        for (Smartphone device : devices) {
            if (device instanceof Androids) {
                device.call("380501234567");
                device.sms("380501111111", "some text");
                device.internet("internet");
                ((Androids) device).connectWifi("qwerty", "qwerty");
            } else if (device instanceof Iphones) {
                device.call("3805099999999");
                device.sms("38066456789", "some another text");
                device.internet("internet");
                ((Iphones) device).makeSelfie();
            }
            System.out.println();
        }
    }
}
