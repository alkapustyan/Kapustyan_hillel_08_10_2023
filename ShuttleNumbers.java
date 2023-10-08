package ua.vodafone.homework;

public class ShuttleNumbers {
    public static void main(String[] args) {
        String[] shuttleNumber = new String[100];

        createShuttleNumbers(shuttleNumber);
        printShuttleNumbers(shuttleNumber);
    }

    public static void createShuttleNumbers (String[] someArray) {
        int i = 0;
        int number = 1;
        while (i < someArray.length) {
            String numberToStr = String.valueOf(number);
            if (!numberToStr.contains("4") & !numberToStr.contains("9")) {
                someArray[i] = numberToStr;
                i++;
            }
            number++;
        }
        //return someArray;
    }

    public static void printShuttleNumbers(String[] someArray) {
        for (int i = 0; i < someArray.length; i++){
            System.out.println("Shuttle " + (i + 1) + " will get number " + someArray[i]);
        }
    }
}
