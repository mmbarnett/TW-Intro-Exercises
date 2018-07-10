public class Exercises {
    public static void main(String[] args) {
        System.out.println(exc1());
        System.out.println(exc2(8));
        System.out.println(exc3(3));
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




}
