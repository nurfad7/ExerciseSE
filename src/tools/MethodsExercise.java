package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MethodsExercise {
    private static final HashMap<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD_TO_EUR", 0.92);
        exchangeRates.put("USD_TO_GBP", 0.72);
        exchangeRates.put("USD_TO_JPY", 147.65);
    }

    private static double getExchangeRate(String currencyPair) {
        return exchangeRates.getOrDefault(currencyPair, 0.0);
    }

    public static double convertCurrency(double amount, String targetCurrency) {
        return getExchangeRate("USD_TO_" + targetCurrency) * amount;
    }

    public static int[] eliminateOddNumber(int[] arrayToFilter) {
        List<Integer> EvenNumberList = new ArrayList<>();
        for (int n : arrayToFilter) {
            if (n % 2 == 0) {
                EvenNumberList.add(n);
            }
        }
        return EvenNumberList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void loopNumberAndReplace(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.print("Buzz");
            } else if(i % 3 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(i);
            }
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }

    public static void searchTheAddUp(int[] numberBase, int n) {
        boolean isExist = false;
        for(int i = 0; i < numberBase.length; i++) {
            int secondNumber = n - numberBase[i];
            int indexOfSecondNumber = searchTheNumber(numberBase, secondNumber);
            if (indexOfSecondNumber != -1) {
                System.out.println("[" + (i) + "," + (indexOfSecondNumber) + "]");
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("No pair exist");
        }

    }

    private static int searchTheNumber(int[] numbers, int numberToSearch) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == numberToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static String getRandomWords(){
        String[] words = {"watermelon", "apple", "lemon", "orange", "mango"};
        Random random = new Random();
        int randomInt = random.nextInt(5);
        return words[randomInt];
    }

    public static String updateHiddenWord(String guessChar,
                                          String hiddenWord,
                                          String answer) {
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == guessChar.toLowerCase().charAt(0)) {
                updatedHiddenWord.setCharAt(i, guessChar.toLowerCase().charAt(0));
            }
        }
        return updatedHiddenWord.toString();
    }
}
