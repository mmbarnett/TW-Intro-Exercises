import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(exc1());
        System.out.println();

        System.out.println(exc2(8));
        System.out.println();

        System.out.println(exc3(3));
        System.out.println();

        System.out.println(exc4(3));
        System.out.println();

        System.out.println(exc5(3));
        System.out.println();

        System.out.println(exc6(3));
        System.out.println();

        System.out.println(exc7(3, "Michael"));
        System.out.println();

        fizzBuzz();
        System.out.println();

        ArrayList<Integer> factors = generate(30);
        for (int i = 0; i < factors.size(); i ++) {
            if (i != factors.size() -1)
                System.out.print(factors.get(i) + ", ");
            else
                System.out.println(factors.get(i));
        }
    }

    private static String exc1() {
        return "*";
    }

    private static String exc2(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    private static String exc3(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != n-1)
                sb.append("*\n");
            else
                sb.append("*");
        }
        return sb.toString();
    }

    private static String exc4(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            // looping vertically...

            for (int j = 1; j <= i; j++) {
                // looping horizontally...

                sb.append("*");
            }

            if (i != n) {
                // not the last line yet
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static String exc5(int n) {
        int lineLength = 2*n-1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= lineLength; j++) {
                // a character is a * if
                // it is within i chars of the middle (n)
                if (j >= n-1-i && j <= n-1+i)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            if (i != n -1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static String exc6(int n) {
        int lineLength = 2*n-1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lineLength; i++) {
            for (int j = 0; j <= lineLength; j++) {
                int distance = i;
                if (distance >= n) {
                    // if we're in the bottom half...
                    distance = lineLength - distance - 1;
                }
                // a character is a * if
                // it is within distance chars of the middle (n)
                if (j >= n-1-distance && j <= n-1+distance)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            if (i != lineLength -1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static String exc7(int n, String name) {
        int lineLength = 2*n-1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lineLength; i++) {
            if (i == n - 1) {
                sb.append(name + "\n");
                continue;
            }

            for (int j = 0; j <= lineLength; j++) {
                int distance = i;
                if (distance >= n) {
                    // if we're in the bottom half...
                    distance = lineLength - distance - 1;
                }
                // a character is a * if
                // it is within distance chars of the middle (n)
                if (j >= n-1-distance && j <= n-1+distance)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            if (i != lineLength -1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static void fizzBuzz() {
        for (int i = 1; i <= 100; i ++) {
            if (i % 15 == 0) { // divisible by 5 and 3
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        ArrayList<Integer> primesSoFar = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i, primesSoFar)) {
                primesSoFar.add(i);
                if (n % i == 0) {
                    factors.add(i);
                }
            }
        }
        return factors;
    }

    private static boolean isPrime(int n, ArrayList<Integer> primesSoFar) {
        for (Integer p : primesSoFar) {
            if (n % p == 0) {
                return false;
            }
        }
        return true;
    }




}
