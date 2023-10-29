package ua.vodafone.homework.test;

import ua.vodafone.homework.ConvertCelsiusFahrenheit;
import ua.vodafone.homework.ConvertCelsiusKelvin;

public class ConverterRunner {
    public static void main(String[] args) {
        ConvertCelsiusFahrenheit celsius = new ConvertCelsiusFahrenheit(10);
        ConvertCelsiusFahrenheit fahrenheit = new ConvertCelsiusFahrenheit(100);
        System.out.println("celsius = " + celsius.getTemperature());
        System.out.println("celsius in fahrenheit = " + celsius.celsiusToFahrenheit());
        System.out.println("fahrenheit = " + fahrenheit.getTemperature());
        System.out.println("fahrenheit in celsius = " + fahrenheit.fahrenheitToCelsius());
        System.out.println();

        ConvertCelsiusKelvin anotherCelsius = new ConvertCelsiusKelvin(20);
        ConvertCelsiusKelvin kelvin = new ConvertCelsiusKelvin(200);
        System.out.println("anotherCelsius = " + anotherCelsius.getTemperature());
        System.out.println("anotherCelsius in kelvin = " + anotherCelsius.celsiusToKelvin());
        System.out.println("kelvin = " + kelvin.getTemperature());
        System.out.println("kelvin in celsius = " + kelvin.kelvinToCelsius());

    }
}
