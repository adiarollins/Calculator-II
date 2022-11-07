import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        boolean run = true;
        //while (run == true) {
            System.out.print("Enter a number: ");
            int num1 = stdin.nextInt();
            System.out.print("Enter another number: ");
            int num2 = stdin.nextInt();
            System.out.print("Select operator (Add/Subtract/Multiply/Divide): ");
            String uselessEnter = stdin.nextLine();
            String operator = stdin.nextLine();
            char symbol;
            int answer;
            if (operator.equals ("Add")) {
                symbol = '+';
                answer = add(num1,num2);
                System.out.println (num1 + " " + symbol  + " " + num2 + " is " + answer);
            } else if (operator.equals ("Subtract")) {
                symbol = '-';
                answer = subtract(num1, num2);
                System.out.println (num1 + " " + symbol  + " " + num2 + " is " + answer);
            } else if (operator.equals ("Multiply")) {
                symbol = '*';
                answer = multiply(num1,num2);
                System.out.println (num1 + " " + symbol  + " " + num2 + " is " + answer);
            } else if (operator.equals ("Divide")) {
                symbol = '/';
                answer = divide(num1,num2);
                System.out.println (num1 + " " + symbol  + " " + num2 + " is " + answer);
            } else {
                System.out.println ("I don't know how to do that!");
            }
        //} 
    }

    public static int add(int num1, int num2)
    {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public static int subtract(int num1, int num2)
    {
        int diff;
        diff = num1 - num2;
        return diff;
    }

    public static int multiply(int num1, int num2)
    {
        int product;
        product = num1 * num2;
        return product;
    }

    public static int divide(int num1, int num2)
    {
        int quotient;
        quotient = num1 / num2;
        return quotient;
    }
    
}