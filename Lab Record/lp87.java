// 87.	Write a program to implement a simple calculator using a switch case.
import java.util.Scanner;

public class lp87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble(), num2 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: System.out.println("Invalid operator");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}