package ua.vodafone.homework;

public interface Smartphones {
    public void call(String number);

    public void sms(String number, String text);

    public void internet(String apn);
}
