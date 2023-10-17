package ua.vodafone.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixTransposition {
    public static void main(String[] args) {

        int[][] matrix = setDimensions();
        System.out.println("lines " + matrix.length);
        System.out.println("rows " + matrix[0].length);
        System.out.println();

        int minRandomValue = 0;
        int maxRandomValue = 10;
        fillMatrix(matrix, minRandomValue, maxRandomValue);

        System.out.println("Original matrix with random value from " + minRandomValue + " to " + maxRandomValue + ": ");
        printMatrix(matrix);
        matrix = transposeMatrix(matrix);
        System.out.println();
        System.out.println("Transposed matrix: ");
        printMatrix(matrix);

    }

    public static int[][] setDimensions() {
        System.out.print("Set the dimensions (M and N) of the matrix: ");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int rows = scanner.nextInt();
        return new int[lines][rows];
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(row[i] + "   ");
            }
            System.out.println();
        }
    }

    public static void fillMatrix(int[][] matrix, int min, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = generateNumber(min, max);
            }
        }
    }

    public static int generateNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, (max + 1));
    }
}
