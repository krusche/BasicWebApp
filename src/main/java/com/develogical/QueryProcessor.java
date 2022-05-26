package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] numbers = query.toLowerCase().split(" ");
            int firstNumber = Integer.parseInt(numbers[3]);
            int secondNumber = Integer.parseInt(numbers[5]);
            return firstNumber + secondNumber + "";
        }
        if (query.toLowerCase().contains("largest")) {
            String[] numbers = query.toLowerCase().split(" ");
            int largestNumber = -1;
            for (String stringNumber: numbers) {
                if (stringNumber.contains(",")) {
                    stringNumber = stringNumber.replaceAll(",", "");
                }
                try {
                    int currentNumber = Integer.parseInt(stringNumber);
                    if (currentNumber > largestNumber) {
                        largestNumber = currentNumber;
                    }
                }
                catch (NumberFormatException ignored) {
                }
            }

            return largestNumber + "";
        }
        if (query.toLowerCase().contains("name")) {
            return "Stephan";
        }
        return "";
    }
}
