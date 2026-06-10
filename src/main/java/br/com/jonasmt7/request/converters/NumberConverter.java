package br.com.jonasmt7.request.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        return Double.parseDouble(strNumber);
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;

        String number = strNumber.replace(",",".");
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
