package com.hexaware.Strings;

import java.util.ArrayList;

public class NumberToString {
	public static String[] processNumber(int number) {
        // Step 1: Reverse the number
        int reversedNumber = reverseNumber(number);

        // Step 2: Find prime numbers in reversed order
        ArrayList<Integer> primeNumbers = findPrimeNumbersInReverse(reversedNumber);

        // Step 3: Create a string array with the count and names of prime numbers
        String[] result = createResultArray(primeNumbers);

        return result;
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    private static ArrayList<Integer> findPrimeNumbersInReverse(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        while (number != 0) {
            int digit = number % 10;
            if (isPrime(digit)) {
                primeNumbers.add(digit);
            }
            number /= 10;
        }
        return primeNumbers;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[] createResultArray(ArrayList<Integer> primeNumbers) {
        int count = primeNumbers.size();
        String[] result = new String[count + 1];
        
        result[0] = count + " primes";

        for (int i = 0; i < count; i++) {
            result[i + 1] = convertToName(primeNumbers.get(count - i - 1));
        }

        return result;
    }

    private static String convertToName(int digit) {
        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Invalid digit";
        }
    }

    public static void main(String[] args) {
        int inputNumber = 257891;
        String[] result = processNumber(inputNumber);

        System.out.println("Output:");
        for (String item : result) {
            System.out.println(item);
        }
    }

}
