package ua.vodafone.homework;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        int[] dogsTeam = new int[25];
        int[] catsTeam = new int[25];
        int minAge = 18;
        int maxAge = 40;

        fillArray(dogsTeam, minAge, maxAge);
        fillArray(catsTeam, minAge, maxAge);

        System.out.println("The first team players age: ");
        printAge(dogsTeam);
        System.out.println();
        System.out.println();

        System.out.println("The second team players age: ");
        printAge(catsTeam);
        System.out.println();
        System.out.println();

        System.out.println("Average age of the players of the first team: " + averageAge(dogsTeam));
        System.out.println("Average age of the players of the first team: " + averageAge(catsTeam));

    }

    public static void fillArray(int[] someArray, int min, int max) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = generateAge(min, max);
        }
    }

    public static int generateAge(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, (max + 1));
    }

    public static void printAge(int[] someArray) {
        for (int num : someArray) {
            System.out.print(num + " ");
        }
    }

    public static double averageAge(int[] someArray) {
        double sum = 0;
        for (int num : someArray) {
            sum += num;
        }
        return (sum / someArray.length);
    }
}
