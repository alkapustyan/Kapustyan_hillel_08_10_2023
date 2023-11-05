package ua.vodafone.homework;

public class Person {
    String name;
    String surname;
    String city;
    String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String printInfo() {
        return "Call Mr " + this.name + " " + this.surname + " from " + this.city + " by number " + this.phoneNumber + ".";
    }

}
