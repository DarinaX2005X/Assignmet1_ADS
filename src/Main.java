import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    //Complexity: linear - O(N)
    public static int minElem(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    //Complexity: linear - O(N)
    public static double avgElem(int[] arr) {
        double sum = 0;
        for (int elem : arr)
            sum += elem;
        return sum / arr.length;
    }

    //Complexity: square root - O(sqrt(N))
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Complexity: linear - O(N)
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }

    //Complexity: exponential - O(2^N)
    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    //Complexity: linear - O(N)
    public static int pow(int a, int n) {
        if (n == 0)
            return 1;
        else
            return a * pow(a, n - 1);
    }

    //Complexity: factorial - O(N!)
    public static void perm(String str) {
        ArrayList<String> perms = new ArrayList<>();
        perms.add(str);
        for (int i = 0; i < str.length(); i++) {
            int size = perms.size();
            for (int j = 0; j < size; j++) {
                char[] current = perms.get(j).toCharArray();
                for (int k = i + 1; k < str.length(); k++) {
                    char temp = current[i];
                    current[i] = current[k];
                    current[k] = temp;
                    perms.add(String.valueOf(current));
                }
            }
        }

        for (String perm : perms) {
            System.out.println(perm);
        }
    }

    //Complexity: linear - O(N)
    public static boolean consistOfDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }

    //Complexity: exponential - O(2^N)
    public static int bin(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        return bin(n - 1, k - 1) + bin(n - 1, k);
    }

    //Complexity: logarithmic - O(log(N))
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void task1() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minElem(arr));
    }

    public static void task2() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(avgElem(arr));
    }

    public static void task3() {
        int n = sc.nextInt();
        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }

    public static void task4() {
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static void task5() {
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static void task6() {
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }

    public static void task7() {
        String str = sc.nextLine();
        perm(str);
    }

    public static void task8() {
        String str = sc.nextLine();
        if (consistOfDigits(str))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void task9() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(bin(n, k));;
    }

    public static void task10() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));;
    }
}