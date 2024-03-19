package org.example;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed.append(digits[i]);
        }
        return number == Integer.parseInt(reversed.toString());
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
    StringBuilder numberToText = new StringBuilder();
    char[] digits = String.valueOf(number).toCharArray();
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numberToText.append("Zero ");
                    break;
                case '1':
                    numberToText.append("One ");
                    break;
                case '2':
                    numberToText.append("Two ");
                    break;
                case '3':
                    numberToText.append("Three ");
                    break;
                case '4':
                    numberToText.append("Four ");
                    break;
                case '5':
                    numberToText.append("Five ");
                    break;
                case '6':
                    numberToText.append("Six ");
                    break;
                case '7':
                    numberToText.append("Seven ");
                    break;
                case '8':
                    numberToText.append("Eight ");
                    break;
                case '9':
                    numberToText.append("Nine ");
                    break;
            }
        }
        return numberToText.toString().trim();
    }


}
