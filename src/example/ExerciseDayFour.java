package example;

import tools.LoopAndCondition;

import java.util.*;

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
            List<Integer> list = new ArrayList<>();
            String input;
            scanner.nextLine();
            do {
                System.out.print("Enter a number or 'x' to exit: ");
                input = scanner.nextLine();
                try {
                    if(!input.equalsIgnoreCase("x")) {
                        int numberToAdd = Integer.parseInt(input);
                        list.add(numberToAdd);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number!");
                }
            } while (!input.equalsIgnoreCase("x"));
            System.out.println("The number list inputted: " + list.toString());
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
