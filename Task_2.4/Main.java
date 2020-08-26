public class Main {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            int result = 0;
            for (int a2 = 1; a2 <= a; a2++) {
                result = result + a2;
            }
            System.out.println(result);
        }
    }
}

