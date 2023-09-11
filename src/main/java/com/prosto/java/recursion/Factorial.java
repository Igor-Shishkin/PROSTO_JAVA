package com.prosto.java.recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = -1;
        System.out.printf("%d! = %d", number, getFactorial(number));

//        for (int i = 1; i <= number; i++) {
//            System.out.printf("%d! = %d%n", i, getFactorial(i));
//        }

    }

    private static long getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        System.out.println(number);
        // 5! = 5*4*3*2*1 = 5 * 4!
        return number * getFactorial(number - 1);
    }


//    a)3!=1⋅2⋅3=6
//    b)4!=1⋅2⋅3⋅4=24
//    c)5!=1⋅2⋅3⋅4⋅5=120
//    d)6!=1⋅2⋅3⋅4⋅5⋅6=720


//    Thrown when a stack overflow occurs because
//    an application recurses too deeply.
//    Since:
//            1.0

}
