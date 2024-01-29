package com.github.elemocrack;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> currencies = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        currencies.put("clp", 912.0);
        currencies.put("ars", 1230.0);
        currencies.put("usd", 1.0);
        currencies.put("eur", 0.92);
        currencies.put("try", 30.0);
        currencies.put("gbp", 0.79);
        currencies.put("uyu", 40.0);
        currencies.put("inr", 83.11);

        System.out.println("Ingrese moneda a convertir");
        String firstCurrency = scanner.next().toLowerCase();
        System.out.println("Ingrese cantidad a convertir");
        double amountToConvert = scanner.nextDouble();
        System.out.println("Ingrese moneda final");
        String wantToConvert = scanner.next().toLowerCase();

        if (!currencies.containsKey(firstCurrency) || !currencies.containsKey(wantToConvert)) {
            System.out.println("El programa no admite ese pais");
            return;
        }

        double firstAmount = currencies.get(firstCurrency);
        double secondAmount = currencies.get(wantToConvert);

        double convertedAmount = (amountToConvert / firstAmount) * secondAmount;
        System.out.println("Converted amount: " + convertedAmount);

    }

}