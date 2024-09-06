package tools;

import java.util.HashMap;

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
}
