import java.util.Scanner;

public class ComplexCalculator {
   public static void main(String[] args) {
      double n1;
      double n2;
      double answer;
      char n;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      n1 = sc.nextDouble();
      n2 = sc.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      n = sc.next().charAt(0);
      switch (n) {
         case '+':
            answer = n1 + n2;
            break;
         case '-':
            answer = n1 - n2;
            break;
         case '*':
            answer = n1 * n2;
            break;
         case '/':
            answer = n1 / n2;
            break;
         default:
            System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result ar as follows:\n");
      System.out.printf(n1 + " " + n + " " + n2 + " = " + answer);
   }
}