package ua.vodafone.homework;

public class Smartphone implements Smartphones {
    private String name;
    private String imei;

    public Smartphone(String name, String imei) {
        this.name = name;
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public void call(String number) {
        System.out.println(name + " colling to number = " + number);
    }

    @Override
    public void sms(String number, String text) {
        System.out.println(name + " sending sms with text '" + text + "' to number = " + number);

    }

    @Override
    public void internet(String apn) {
        System.out.println(name + " connecting to internet with apn = " + apn);
    }

}
