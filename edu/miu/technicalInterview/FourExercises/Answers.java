package edu.miu.technicalInterview.FourExercises;

public class Answers {
    public static void main(String[] args) {
        // int a[] = { 2, 4, -4, 5, 3, -5 };
        // System.out.printf("%.2f\n", pow(5, 2));
        System.out.println(countOccur("jdjdyudkcnbhjgahdfxn", 'j'));
    }

    // # Find Max
    static int[] reverseArray(int[] a) {
        int counter = 0;
        for (int i = a.length - 1; i == 0; i--) {
            a[counter++] = a[i];
        }
        return a;
    }

    // # Number 2 minimum
    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max > a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    // Number 3 raise to the pow
    public static double pow(double base, double exponent) {
        double result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        return result;
    }

    public static int countOccur(String text, char z) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == z)
                counter++;
        }
        return counter;
    }

}
