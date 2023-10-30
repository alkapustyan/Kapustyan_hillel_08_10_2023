package ua.vodafone.homework;

public class Iphones extends Smartphone implements Ios {
    public Iphones(String name, String imei) {
        super(name, imei);
    }

    @Override
    public void makeSelfie() {
        System.out.println(super.getName() + " make selfie");
    }

}
