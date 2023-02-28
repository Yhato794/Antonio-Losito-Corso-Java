import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        boolean a = true;
        do {
            a = calc(a);

        } while (a);

    }

    public static boolean calc(boolean b) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");

        char operator = input.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator.");
                break;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println("Exit? y/n");
        Scanner stringa = new Scanner(System.in);
        String exitOption = stringa.nextLine();

        if (exitOption.equals("y")) {
            b = false;
        }
        return b;
    }
}