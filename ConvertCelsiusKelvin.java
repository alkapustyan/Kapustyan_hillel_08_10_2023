package ua.vodafone.homework;

public class ConvertCelsiusKelvin extends Converter {

    public ConvertCelsiusKelvin(double temperature) {
        super(temperature);
    }

    public double celsiusToFahrenheit() {
        return (super.getTemperature() * 1.8) + 32;
    }

    public double fahrenheitToCelsius() {
        return (super.getTemperature() - 32) / 1.8;
    }

    public double celsiusToKelvin() {
        return super.getTemperature() + 273.15;
    }

    public double kelvinToCelsius() {
        return super.getTemperature() - 273.15;
    }
}
