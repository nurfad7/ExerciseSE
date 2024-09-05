package example;

import tools.ArrayProcessor;
import tools.BasicMath;
import tools.StringProcessor;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseDayThree {
    Scanner scanner = new Scanner(System.in);
    public void result(){
        try{
            //#1 sum the digits
            BasicMath basicMath = new BasicMath();
            System.out.println("Please input number to sum: ");
            int numberToSum = scanner.nextInt();
            basicMath.setNumberToProcess(numberToSum);
            int resultSum = basicMath.calculateTheSum();
            System.out.println("the sum of " + numberToSum + " = " + resultSum);
            //#2 check if the number is prime
            System.out.println("Please input number to check if it's prime: ");
            int numberToCheckPrime = scanner.nextInt();
            basicMath.setNumberToProcess(numberToCheckPrime);
            System.out.println("number " + numberToCheckPrime
                    + (basicMath.isPrime() ? " is prime" : " is not prime"));
            //#3 find the largest element in an array
            int[] arrayNumber = {3, 7, 2, 8, 1};
            basicMath.setArrayNumberToProcess(arrayNumber);
            int largestNumber = basicMath.findLargest();
            System.out.println("the largest among "
                    + Arrays.toString(arrayNumber)
                    + " = " + largestNumber);
            //#4 simple calculator
            scanner.nextLine();
            System.out.println("Please input basic operation to calculate: ");
            String operationString = scanner.nextLine();
            basicMath.setStringToProcess(operationString);
            double calculatedNumber = basicMath.calculateOperation();
            System.out.println(" = " + calculatedNumber);
            //#5 function to reverse a string
            System.out.println("Please input text to revert: ");
            StringProcessor stringProcessor = new StringProcessor();
            stringProcessor.setStringToProcess(scanner.nextLine());
            System.out.println(stringProcessor.reverseTheString());
            //#6 generate the Fibonacci sequence up to given number
            System.out.println("Please input number to generate the Fibonacci sequence: ");
            int numberFibonacci = scanner.nextInt();
            basicMath.setNumberToProcess(numberFibonacci);
            basicMath.generateFibonacci();
            //#7 function to count the number of vowels in a string
            //scanner.nextLine();
            System.out.println("Please input text to search the vowel: ");
            stringProcessor.setStringToProcess(scanner.nextLine());
            System.out.println("Vowel(s) counted: " + stringProcessor.countTheVowels());
            //#8 sort an array of integers using bubble sort
            int[] integerArrayToSort = {64, 34, 25, 12, 22, 11, 90};
            ArrayProcessor arrayProcessor = new ArrayProcessor();
            arrayProcessor.setArrayNumberToProcess(integerArrayToSort);
            System.out.println(Arrays.toString(arrayProcessor.bubbleSort()));
            //#9 check if two strings are anagrams
            System.out.println("Please input text to do anagram check on (1): ");
            stringProcessor.setStringToProcess(scanner.nextLine());
            System.out.println("Please input text to do anagram check on (2): ");
            stringProcessor.setSecondStringToProcess(scanner.nextLine());
            System.out.println(stringProcessor.isAnagram());
            //#10 find the second-smallest element in an array
            int[] integerArrayToProcess = {5, 3, 8, 1, 2, 9};
            arrayProcessor.setArrayNumberToProcess(integerArrayToProcess);
            System.out.println("the second-smallest among "
                    + Arrays.toString(integerArrayToProcess) + " is "
                    + arrayProcessor.getSecondSmallest());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}