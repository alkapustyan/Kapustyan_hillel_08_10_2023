package ua.vodafone.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArray {
    public static void main(String[] args) {

        Integer[][] steppedArray = setDimensions();

        int minRandomValue = 0;
        int maxRandomValue = 10;
        fillSteppedArray(steppedArray, minRandomValue, maxRandomValue);
        System.out.println();
        System.out.println("Generated stepped array: ");
        printArray(steppedArray);

        sortArray(steppedArray);
        System.out.println();
        System.out.println("Sorted stepped array: ");
        printArray(steppedArray);

        System.out.println();
        System.out.println("Sum of all elements in array = " + sumAllElements(steppedArray));

        Integer[] minInRows = findMin(steppedArray);
        System.out.println();
        System.out.println("Min elements from each row:");
        printArray(minInRows);

        Integer absMin = findMin(minInRows);
        System.out.println();
        System.out.println("Absolute minimum in array = " + absMin);

        System.out.println();
        divideElementsToAbsMin(steppedArray, absMin);

    }

    public static Integer[][] setDimensions() {
        System.out.print("Set the number of rows: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        String tmp = scanner.nextLine();

        System.out.print("Set the maximum elements in each row: ");
        int maxRowSize = scanner.nextInt();
        return createArrayWithDimensions(rows, maxRowSize);
    }

    public static Integer[][] createArrayWithDimensions(int rows, int rowSize) {
        Integer[][] steppedArray = new Integer[rows][];
        for (int i = 0; i < rows; i++) {
            steppedArray[i] = new Integer[ThreadLocalRandom.current().nextInt(0, rowSize + 1)];
        }
        return steppedArray;
    }

    public static void fillSteppedArray(Integer[][] array, int minValue, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = generateNumber(minValue, maxValue);
                }
            } else {
//                System.out.println("Row number " + (i + 1) + " in array is null");
            }
        }
    }

    public static int generateNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, (max + 1));
    }


    public static void printArray(Integer[][] array) {
        for (Integer[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length > 0) {
                if (((i + 1) % 2) == 0) {
                    Arrays.sort(array[i]);
                } else {
                    Arrays.sort(array[i], Collections.reverseOrder());
                }
            }
        }
    }

    public static Integer sumAllElements(Integer[][] array) {
        Integer sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length > 0) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static Integer[] findMin(Integer[][] array) {
        Integer[] minInRows = new Integer[array.length];
        for (int i = 0; i < minInRows.length; i++) {
            if (array[i].length > 0) {
                if (((i + 1) % 2) == 0) {
                    minInRows[i] = array[i][0];
                } else {
                    minInRows[i] = array[i][array[i].length - 1];
                }
            } else {
                minInRows[i] = null;
            }
        }
        return minInRows;
    }

    public static Integer findMin(Integer[] array) {
        Integer min = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                //do nothing
            } else if (count == 0) {
                min = array[i];
                count++;
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        if (count == 0) {
            min = null;
        }
        return min;
    }

    public static void divideElementsToAbsMin(Integer[][] array, Integer absMin) {
        if (absMin == null || absMin == 0) {
            System.out.println("Division by null or zero is not allowed.");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length > 0) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = (int) array[i][j] / absMin;
                    }
                }
            }
            System.out.println("New stepped array where all elements were divided to the absolute minimum without remainder:");
            printArray(array);
        }
    }

}
