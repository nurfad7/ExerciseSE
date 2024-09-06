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
        System.out.print(getExchangeRate("USD_TO_JPY"));
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
}
