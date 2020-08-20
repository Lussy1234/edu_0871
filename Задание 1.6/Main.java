import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();
	System.out.println(a + a/100 * 15);
    }
}
