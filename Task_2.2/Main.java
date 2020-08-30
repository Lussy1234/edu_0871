public class Main {

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }

    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    public static int min(int a, int b, int c, int d) {
        int minAB = min(a, b);
        int minCD = min(c, d);
        int ABCD = min(minAB, minCD);

        return minAB;
    }

}
