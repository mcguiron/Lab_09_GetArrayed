import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] dataPoints = new int[100];
        int sum = 0;
        double average;
        int counter = 0;
        boolean done = false;

        Random gen = new Random();

        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = gen.nextInt(100) + 1;
        }


        for (int x = 0; x < dataPoints.length; x++) {
            if (x < dataPoints.length - 1) {
                System.out.print(dataPoints[x] + " | ");
            } else {
                System.out.print(dataPoints[x]);
            }
        }

        for (int x = 0; x < dataPoints.length; x++) {
            sum += dataPoints[x];
        }

        average = sum / (double) dataPoints.length;

        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);



        int userValue = SafeInput.getRangedInt(in, "Please enter a value between 1 and 100", 1, 100);


        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == userValue) {
                counter++;
            }
        }

        System.out.println("The value " + userValue + " was found " + counter + " times in the array.");


        int search = SafeInput.getRangedInt(in, "Please enter a value to search for in the array [1-100]", 1, 100);


        for (int x = 0; x < dataPoints.length; x++) {
            if (dataPoints[x] == search) {
                System.out.println("The value " + search + " was found at array index " + x + ".");
                done = true;
                break;
            }
        }

        if (!done) {
            System.out.println("The value " + search + " was not found in the array.");
        }

        // Initialize minVal with the first item price
        double minVal = dataPoints[0];
        double maxVal = dataPoints[0];


        for (int x = 1; x < dataPoints.length; x++) {
            if (dataPoints[x] > maxVal) {
                maxVal = dataPoints[x];

            }
            if (dataPoints[x] < minVal) {
                minVal = dataPoints[x];

            }
        }

        System.out.println("Min value is " + minVal);
        System.out.println("Max value is " + maxVal);


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;

        for (int x = 0; x < values.length; x++) {
            sum += values[x];
        }

        return sum / (double) values.length;
    }

}

