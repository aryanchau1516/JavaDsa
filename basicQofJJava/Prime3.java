
import java.util.Scanner;

public class Prime3 {

  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Enter the number to check its prime");
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    input.close();

    for (int i = 2; i <= value; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}