package ru.aincorp.solutions;

public class FibonacciNumber {

    public int fib(int n) {
        int sumFibonacciNum = 0;

        if (n == 0) return 0;
        if (n == 1) return 1;

        int fibFirst = 0;
        int fibSecond = 1;

        for (int i = 0; i < n - 1; i++) {
            sumFibonacciNum = fibFirst + fibSecond;
            fibFirst = fibSecond;
            fibSecond = sumFibonacciNum;
        }
        return sumFibonacciNum;
    }

}
