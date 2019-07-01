package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String args[]){

        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);


        for(int i=0; i<numberOfStudents; i++){

            double total = 0;
            for(int j=0; j<numberOfTests; j++){

                System.out.println("Enter the score for the Test #" + (j+1));
                total = total + scanner.nextDouble();
            }

            System.out.println("Average score: " + total/numberOfTests);

        }

        scanner.close();
    }
}
