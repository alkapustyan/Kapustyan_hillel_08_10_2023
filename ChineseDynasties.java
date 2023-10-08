package ua.vodafone.homework;

public class ChineseDynasties {
    public static void main(String[] args) {

        // Li warriors
        int liWarriorAttack = 13;
        int liArcherAttack = 24;
        int liRiderAttack = 46;
        int numberOfLiWarriors = 913; //860;

        //Min warriors
        int minWarriorAttack = 9;
        int minArcherAttack = 35;
        int minRiderAttack = 12;
        double difference = 2.3125; //1.5;

        double liAttack = numberOfLiWarriors * (liWarriorAttack + liArcherAttack + liRiderAttack);
        double minWar = Math.round(difference * numberOfLiWarriors);
        double minAttack = minWar * (minWarriorAttack + minArcherAttack + minRiderAttack);

        System.out.println("Total attack of Li army: " + liAttack);
        System.out.println("Total attack of Min army: " + minAttack);
        System.out.println(minWar);
    }
}
