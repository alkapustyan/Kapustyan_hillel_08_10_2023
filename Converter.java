package ua.vodafone.homework;

public abstract class Converter {
    private double temperature;

    public Converter(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public abstract double celsiusToFahrenheit();

    public abstract double celsiusToKelvin();

    public abstract double fahrenheitToCelsius();

    public abstract double kelvinToCelsius();

}
