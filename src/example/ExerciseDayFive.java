package example;

import tools.MethodsExercise;

import java.util.*;

public class ExerciseDayFive {
    Scanner scanner = new Scanner(System.in);
    public void result(){
        try{
            //#1

            //#2 currency conversion
            System.out.print("Enter the amount to convert (USD): ");
            double amount = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Type the currency target (EUR, GBP, or JPY): ");
            String targetCurrency = scanner.nextLine().toUpperCase();
            double convertedAmount = MethodsExercise.convertCurrency(amount, targetCurrency);
            System.out.println(amount + " USD = "
                    + String.format("%.2f", convertedAmount) + " "
                    + targetCurrency);
            //#3 remove all odd numbers in an array
            int[] arrayToDoOddEliminateOn = {1,2,3,4,5,6,7,8,9,10};
            int[] filteredArray = MethodsExercise.eliminateOddNumber(arrayToDoOddEliminateOn);
            System.out.println(Arrays.toString(filteredArray));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}
