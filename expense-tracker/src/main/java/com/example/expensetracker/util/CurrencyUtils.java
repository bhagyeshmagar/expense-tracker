package com.example.expensetracker.util;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtils {
    public static String format(double value){
        return NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN")).format(value);
    }
}
