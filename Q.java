/**
 * Q
 */
public class Q {

    public static void main(String[] args) {
        int t[] = { 2, 6, 9, 0, -3 };
        System.out.println(isWave(t));
    }

    static int isWave(int[] a) {
        int result = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                result = 0;
                break;
            }
            if (a[i] % 2 != 0 && a[i + 1] % 2 != 0) {
                result = 0;
                break;
            }
        }
        return result;
    }

    static void minDistance(int n) {
        int min = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.format(" %d  ", i);
                if (isPrime(i) == 1) {
                    if (min < (i + 1)) {
                        min = i + 1;
                    }
                }
            }
        }
    }

    static int isEvens(int n) {
        int temp = 0;
        int result = 1;
        while (n > 0) {
            temp = n % 10;
            System.out.println(temp);
            if (temp % 2 != 0) {
                result = 0;
                break;
            }
            n /= 10;
        }
        return result;
    }

    static int[] fill(int[] arr, int k, int n) {
        int slice[] = new int[k];
        int results[] = new int[n];
        if (k == 0)
            return null;
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[i];
        }
        int position = 0;
        for (int i = 0; i < n; i++) {
            results[i] = slice[position];
            position++;
            if (position == slice.length) {
                position = 0;
            }
        }
        return results;
    }

    static boolean hasKSmallFactors(int k, int n) {
        if (k < 0 || n < 0)
            return false;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i * j == n && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int isCentred(int a[]) {
        if (a == null)
            return 0;
        if (a.length % 2 == 0)
            return 0;
        int midIndex = a.length / 2;

        int midValue = a[midIndex];
        int centred = 1;
        for (int i = 0; i < a.length; i++) {
            if (midIndex == i)
                continue;
            if (midValue >= a[i]) {
                System.out.println(midValue + "<->" + a[i]);
                centred = 0;
                break;
            }
        }
        return centred;
    }

    static int isBalanceed(int[] a) {
        boolean isEvenBalanced = false;
        boolean isOddBalanced = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (i % 2 == 0) {
                    isEvenBalanced = true;
                } else {
                    isEvenBalanced = false;
                }

            }
            if (a[i] % 2 != 0) {
                if (i % 2 != 0) {
                    isOddBalanced = true;
                } else {
                    isOddBalanced = false;
                }
            }

        }

        return (isOddBalanced && isEvenBalanced) == true ? 1 : 0;
    }

    static int isPrimeProduct(int n) {
        int isPrime = 0;
        if (n < 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (isPrime(j) == 1 && isPrime(i) == 1) {
                    if (n == i * j) {
                        System.out.println(i + " x " + j + " = " + n);
                        isPrime = 1;
                        break;
                    }
                }
            }
        }
        return isPrime;
    }

    public static boolean palindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
            System.out.println(sum);
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
        return temp == sum;
    }

    public static int isComplete(int a[]) {

        int min = 0;
        int max = 0;
        boolean found = true;
        boolean hasEven = false;
        boolean minEqualToMax = false;
        boolean includesNumberBetween = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && found) {
                hasEven = true;
                min = a[i];
                found = false;
            }
            if (a[i] % 2 == 0) {
                if (a[i] < min)
                    min = a[i];
                if (a[i] > max)
                    max = a[i];
            }
            if (min != max)
                minEqualToMax = true;

        }

        int sum = ((max + 1) * (max + 2)) / 2;
        for (int j = min; j < max; j++) {
            sum -= a[j];
        }
        if (hasEven && minEqualToMax && includesNumberBetween) {
            return 1;
        }
        return 0;
    }

    public static int isMagicPrimeArray(int a[]) {
        int target = a[0];
        int sum = 0;
        if (a[0] == 0)
            return 1;
        for (int i = 0; i < a.length; i++) {

            boolean isPrime = isPrime(a[i]) == 1;

            if (isPrime && a[i] > 0 && i != 0) {
                System.out.println(a[i]);
                sum += a[i];
            }
        }
        if (target == sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int isBalanced(int[] a) {
        int isBalance = 0;
        if (a.length % 2 != 0) {
            return isBalance;
        }
        int sign = -1;
        int tempI = 0;
        int tempT = 0;
        for (int i = 0; i < a.length; i++) {
            for (int t = 0; t < a.length; t++) {
                if (a[t] < 0)
                    tempT = a[t] * sign;
                if (a[i] < 0)
                    tempI = a[i] * sign;
                if (tempI == tempT) {
                    isBalance = 1;
                }
            }
        }
        return isBalance;
    }

    public static int isFineArray(int[] a) {
        int isFine = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (isPrime(a[j]) == 0 && isPrime(a[i]) == 0 && i != j) {
                    isFine = 1;
                } else {
                    isFine = 0;
                    if (a[j] + 2 == a[i] || a[j] - 2 == a[i]) {
                        isFine = 1;
                        break;
                    }
                }
            }
        }
        return isFine;
    }

    static int isPrime(int inputNumber) {
        int isItPrime = 1;

        if (inputNumber <= 1) {
            isItPrime = 0;
            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = 0;
                    break;
                }
            }
            return isItPrime;
        }
    }

    public static int isDigitSum(int n, int m) {
        if (n < 0 || m < 0)
            return -1;

        int temp = 0, sum = 0;
        while (n > 0) {
            temp = n % 10;
            sum += temp;
            n /= 10;
        }
        if (sum < m)
            return 1;
        return 0;
    }

    public static Integer isFilter(int[] a) {
        if (a == null)
            return null;
        if (a.length == 0)
            return null;
        boolean has9 = false;
        boolean has11 = false;
        boolean has7 = false;
        boolean has13 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9)
                has9 = true;
            if (a[i] == 11)
                has11 = true;
            if (a[i] == 7)
                has7 = true;
            if (a[i] == 13)
                has13 = true;
        }

        if (has9 && has11) {
            System.out.println("First Condition");
            return 1;
        }

        if (has7 && !has13) {
            System.out.println("Second Condition");
            return 1;
        }

        return 0;
    }

    public static int diffOps(String[] ops) {
        // deter
        String[] item = {};
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                item = new String[ops.length - 1];
            }
        }

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("D")) {
                item[i] = String.valueOf(Integer.parseInt(ops[i - 1]) * 2);
            } else if (ops[i].equals("+")) {
                item[i] = String.valueOf(Integer.parseInt(ops[i - 1]) * Integer.parseInt(ops[i - 2]));
            } else if (ops[i].equals("C")) {
                item[i - 1] = "0";
            } else {
                item[i] = ops[i];
            }

        }
        int results = 0;
        for (int i = 0; i < item.length; i++) {
            results += Integer.parseInt(ops[i]);
        }
        return results;
    }

    public static int[] distinctArray(int[] first, int[] second) {
        if (first == null || second == null)
            return null;
        if (first.length == 0 || second.length == 0)
            return new int[0];
        int min = first.length < second.length ? first.length : second.length;
        int[] common = new int[min];
        int k = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    common[k] = second[j];
                    k++;
                }
            }
        }

        int[] retArray = new int[k];
        for (int i = 0; i < retArray.length; i++) {
            retArray[i] = common[i];
        }
        return retArray;
    }

    int isAllPossibilities(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == i) {
                System.out.print(a[i]);
                System.out.print(a[i]);
                found = true;
            }
        }
        return found == true ? 1 : 0;
    }

    int isNormal(int n) {
        int normal = 1;
        if (n != 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (i % 2 != 0 && i != 1) {
                        normal = 0;
                    }
                }
            }
        }
        return normal;
    }

    int isOddValent(int[] a) {
        boolean isHalfOddValent = false;
        boolean otherHalf = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && j != i) {
                    isHalfOddValent = true;
                }
            }
            if (a[i] % 2 != 0) {
                otherHalf = true;
            }
        }
        return (isHalfOddValent && otherHalf) == true ? 1 : 0;
    }

    int isDaphne(int[] a) {
        int even = 0;
        int odds = 0;
        int isDaphne = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odds++;
            }
        }
        if (odds == a.length) {
            isDaphne = 1;
        }
        if (even == a.length) {
            isDaphne = 1;
        }
        return isDaphne;
    }

    public static int countOnes(int value) {
        int count = 0;
        while (value > 0) {
            int remainder = value % 2;
            if (remainder == 1)
                count++;
            value /= 2;
        }
        return count;
    }

}