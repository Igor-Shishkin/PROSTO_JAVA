package com.prosto.java.recursion;

public class FibonacciSequence {

    public static void main(String[] args) {
        int number = 40;

        long startForMethod = System.currentTimeMillis();
        System.out.printf("%dth number of the Fibonacci sequence with 'for': %d%n",
                number, calculateTheFibonacciNumberWithFor(number));
        long startRecursionMethod = System.currentTimeMillis();

        System.out.printf("%dth number of the Fibonacci sequence 'recursion': %d%n",
                number, calculateTheFibonacciNumberWithRecursion(number));

        long endRecursionMethod = System.currentTimeMillis();

        System.out.printf("Calculating time%nfor: %d%nrecursion: %d%n",
                startRecursionMethod - startForMethod,
                endRecursionMethod - startRecursionMethod);
    }

    private static int calculateTheFibonacciNumberWithRecursion(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return calculateTheFibonacciNumberWithRecursion(number - 1) +
                calculateTheFibonacciNumberWithRecursion(number - 2);
    }

    private static int calculateTheFibonacciNumberWithFor(int number) {
        int previousNumber = 1;
        int nextNumber = 1;
        for (int i = 2; i < number; i++) {
            nextNumber = nextNumber + previousNumber;
            previousNumber = nextNumber - previousNumber;
        }
        return nextNumber;
    }

    // 1  2  3  4  5  6  7   8   9
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, ...


//    private static int calculateTheFibonacciNumber(int number) {
//        if (number == 0 || number == 1) {
//            return number;
//        }
//        int n1 = calculateTheFibonacciNumber(number - 1);
//        int n2 = calculateTheFibonacciNumber(number - 2);
//
//        System.out.println(n1 + "\t" + n2);
//
//        return n1 + n2;
//    }
}
