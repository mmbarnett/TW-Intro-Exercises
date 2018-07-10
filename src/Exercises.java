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





}
