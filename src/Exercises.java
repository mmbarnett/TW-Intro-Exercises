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

//        System.out.println(exc5(3));
//        System.out.println();
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





}
