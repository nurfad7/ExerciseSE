package example;

import tools.LoopAndCondition;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ExerciseDayFour {
    Scanner scanner = new Scanner(System.in);
    public void result(){
        try{
            //#1 prints a multiplication table up to n
            LoopAndCondition loopAndCondition = new LoopAndCondition();
            boolean tableWasNotMade = true;
            while (tableWasNotMade) {
                System.out.print("Please input number to make multiply table: ");
                int numberToMultiply = scanner.nextInt();
                loopAndCondition.setNumberToProcess(numberToMultiply);
                tableWasNotMade = !loopAndCondition.multiplicationTableWasMade();
            };
            //#2 print the triangle pattern for n rows
            boolean patternWasNotMade = true;
            while (patternWasNotMade) {
                System.out.print("Please input number to make the triangle pattern: ");
                int numberToMultiply = scanner.nextInt();
                loopAndCondition.setNumberToProcess(numberToMultiply);
                patternWasNotMade = !loopAndCondition.starTrianglePatternWasMade();
            };
            //#3 reads n number of input from scanner
            //#4 simple number guessing game
            boolean theGuessWasEnd = false;
            Random random = new Random();
            int randomIntInRange = random.nextInt(101);
            int guessAttempt = 0;
            while (!theGuessWasEnd) {
                if(guessAttempt == 10) {
                    System.out.print("It's hard is it? Do you want to continue to guess?(y/n)");
                    if (scanner.nextLine().equalsIgnoreCase("y")) {
                        System.out.print("Thanks for playing");
                        System.out.print("The Random Number is " + randomIntInRange);
                        break;
                    }
                    guessAttempt = 0;
                }
                System.out.print("Please input number you guess: ");
                int guessedNumber = scanner.nextInt();
                loopAndCondition.setNumberToProcess(randomIntInRange);
                loopAndCondition.setSecondNumberToProcess(guessedNumber);
                theGuessWasEnd = loopAndCondition.theGuessIsRight();
                guessAttempt++;
            };
            //#5 swap the case of each character from string
            scanner.nextLine();
            System.out.print("Please input string to swap case: ");
            loopAndCondition.setStringToProcess(scanner.nextLine());
            System.out.print(loopAndCondition.swapTheCase());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            scanner.close();
        }
    }
}
