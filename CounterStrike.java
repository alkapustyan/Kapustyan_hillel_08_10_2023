package ua.vodafone.homework;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input name of the first team: ");
        String firstTeamName = scanner.nextLine();

        System.out.print("Input number of frags for the 5 players of the first team (should be 5 variables): ");
        int firstPlayerTeamOne = scanner.nextInt();
        int secondPlayerTeamOne = scanner.nextInt();
        int thirdPlayerTeamOne = scanner.nextInt();
        int fourthPlayerTeamOne = scanner.nextInt();
        int fifthPlayerTeamOne = scanner.nextInt();

        String tmp = scanner.nextLine();
        System.out.print("Input name of the second team: ");
        String secondTeamName = scanner.nextLine();

        System.out.print("Input number of frags for the 5 players of the second team (should be 5 variables): ");
        int firstPlayerTeamTwo = scanner.nextInt();
        int secondPlayerTeamTwo = scanner.nextInt();
        int thirdPlayerTeamTwo = scanner.nextInt();
        int fourthPlayerTeamTwo = scanner.nextInt();
        int fifthPlayerTeamTwo = scanner.nextInt();

        int numberOfPlayers = 5;
        double arithmeticMeanTeamOne = (double) ((firstPlayerTeamOne + secondPlayerTeamOne + thirdPlayerTeamOne + fourthPlayerTeamOne + fifthPlayerTeamOne) / numberOfPlayers);
        double arithmeticMeanTeamTwo = (double) (firstPlayerTeamTwo + secondPlayerTeamTwo + thirdPlayerTeamTwo + fourthPlayerTeamTwo + fifthPlayerTeamTwo) / numberOfPlayers;

        double eps = 0.0001;
        double dif = Math.abs(arithmeticMeanTeamOne - arithmeticMeanTeamTwo);
        //System.out.println(arithmeticMeanTeamOne);
        //System.out.println(arithmeticMeanTeamTwo);
        //System.out.println(dif);

        if (dif <= eps) {
            System.out.println("Both teams scored an equal number of points");
        } else if ((arithmeticMeanTeamOne - arithmeticMeanTeamTwo) > 0) {
            System.out.println("The winner is " + firstTeamName + " with result number of points: " + arithmeticMeanTeamOne);
        } else {
            System.out.println("The winner is " + secondTeamName + " with result number of points: " + arithmeticMeanTeamTwo);
        }
    }
}
