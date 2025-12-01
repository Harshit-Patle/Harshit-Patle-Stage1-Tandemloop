import java.util.Scanner;

class Calculator {
	
	boolean isValid = true;
    
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
        	isValid = false;
            System.out.println("Error: Cannot divide by zero.");
            return 0; 
        }
        return a / b;
    }

    public void calculate(double a, double b, String type) {
        double result = 0;

        String operation = type.toLowerCase();

        switch (operation) {
            case "addition":
            case "add":
            case "+":
                result = add(a, b);
                break;
                
            case "subtraction":
            case "subtract":
            case "-":
                result = subtract(a, b);
                break;
                
            case "multiplication":
            case "multiply":
            case "*":
                result = multiply(a, b);
                break;
                
            case "division":
            case "divide":
            case "/":
                result = divide(a, b);
                break;
                
            default:
                System.out.println("Invalid operation type entered.");
                isValid = false;
        }

        if (isValid) {
            System.out.println("Result: " + result);
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.print("Enter number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter number b: ");
        double b = sc.nextDouble();

        System.out.print("Enter type of operation: ");
        String type = sc.next();

        cal.calculate(a, b, type);
        
        sc.close();
    }
}