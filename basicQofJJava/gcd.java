import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 2, gcd = 1;
        while (i <= Math.min(a, b)) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;

            }
            i++;
        }
        System.out.println(gcd);
    }

}
