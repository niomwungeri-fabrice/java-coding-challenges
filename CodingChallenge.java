import java.util.HashMap;
import java.util.Map;

public class CodingChallenge {

    public static void main(String[] args) {
        System.out.println(stringReversal("-543213"));
    }

    public static int reverseIn(int n) {
        int sign = 1;
        if (n == 0)
            return 0;
        if (n < 0) {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        int steps  = 1;
        while (n != 0) {
            System.out.println("================= STEPS("+steps+")=================");
            int times10 = reverse * 10;
            int moduleBy10 = n % 10;
            reverse = times10 + moduleBy10;
            n = n / 10;
            steps++;
            System.out.println("Times 10:: " + times10);
            System.out.println("Module 10:: " + moduleBy10);
            System.out.println("N values:: " + n);
            System.out.println("Reversed Value:: "+reverse);
        }
        return sign * reverse;
    }

    public static char[] slicedArray(char a[], int start, int len) {
        if (len > a.length)
            return null;
        if (len + start > a.length)
            return null;
        if (start < 0 || len < 0)
            return null;
        char slice[] = new char[len];
        for (int i = 0; i < slice.length; i++) {
            slice[i] = a[start++];
        }
        return slice;
    }

    public static int f(int a[]) {
        if (a == null)
            return 0;
        if (a.length == 1)
            return 1;

        int even = 0, odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even += a[i];
            } else {
                odd += a[i];
            }
        }
        return odd - even;
    }

    public static int strictArrays(int[] a) {
        if (a.length % 2 == 0 || a == null) {
            return 0;
        }
        int midIndex = a.length / 2;
        int middleItem = a[midIndex];
        for (int i = 0; i < a.length; i++) {
            if (middleItem >= a[i] && i != midIndex) {
                return 0;
            }
        }
        return 1;
    }

    public static String stringReversal(String text) {
        String sb = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            sb+=text.charAt(i);
        }
        return sb;
    }

    public static int[] twoSum(int target, int[] a) {
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int delta = target - a[i];
            if (visitedNumber.containsKey(delta)) {
                return new int[] { i, visitedNumber.get(delta) };
            }
            visitedNumber.put(a[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
