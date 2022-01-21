import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    int num1;
    int num2;
    int ans;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    ans = num1 + num2;
    System.out.println(ans);
  }
}
