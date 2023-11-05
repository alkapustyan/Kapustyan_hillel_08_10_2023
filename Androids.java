package ua.vodafone.homework;

public class Androids extends Smartphone implements LinuxOs {

    public Androids(String name, String imei) {
        super(name, imei);
    }

    @Override
    public void connectWifi(String name, String password) {
        System.out.println(super.getName() + " connecting to WiFi with name = " + name + ", and password = " + password);
    }

}
