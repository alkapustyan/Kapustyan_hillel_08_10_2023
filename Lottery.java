package ua.vodafone.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int lenght = 7;
        int minNumber = 0;
        int maxNumber = 9;
        int[] ownerNumbers = new int[lenght];
        int[] playerNumbers = new int[lenght];

        fillArray(ownerNumbers, minNumber, maxNumber);
        fillArray(playerNumbers, minNumber, maxNumber);

        sortArrayAsc(ownerNumbers);
        sortArrayAsc(playerNumbers);

        System.out.println("Lottery numbers: ");
        printArray(ownerNumbers);
        System.out.println();

        System.out.println("Your numbers: ");
        printArray(playerNumbers);
        System.out.println();
        System.out.println();

        System.out.println("Number of matches: " + numberMatches(ownerNumbers, playerNumbers));

    }

    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber(min, max);
        }
    }

    public static int generateNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, (max + 1));
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print("]");
    }

    public static void sortArrayAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j);
                }
            }
        }
    }

    public static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }

    public static int numberMatches(int[] firstArray, int[] secondArray) {
        int matches = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                matches++;
            }
        }
        return matches;
    }
}
