package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        for (int i : arrayToFilter) {
            if (arrayToFilter[i-1] % 2 == 0) {
                EvenNumberList.add(arrayToFilter[i-1]);
            }
        }
        return EvenNumberList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void loopNumberAndReplace(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 15 == 0) {
                System.out.print("FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.print("Buzz");
            } else if(i % 3 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(i);
            }
            if(i < n) {
                System.out.print(", ");
            }
        }
    }
}
