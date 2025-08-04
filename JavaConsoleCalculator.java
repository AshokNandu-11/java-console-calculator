import java.util.Scanner;

public class JavaConsoleCalculator {
    public static double add(double a , double b){
        return a+b;
    }
    public static double subtract(double a , double b){
        return a-b;
    }
    public static double multiplication(double a , double b){
        return a*b;
    }
    public static  double division(double a , double b){
        if(b==0){
            System.out.println("Divison Not Possible with: "+b);
            return Double.NaN;
        }
        return a/b;
    }
    public static void main(String[] args) {
        double num1,num2,result;
        char operator;
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("This is Java Console Calculator");
        do{
            System.out.println("Enter your 1st Value:");
            num1 = sc.nextDouble();
            System.out.println("Enter Operation[+,-,*,/]");
            operator = sc.next().charAt(0);
            System.out.println("Enter the 2nd Value");
            num2 = sc.nextDouble();
            switch (operator){
                case '+':
                    result=add(num1, num2);
                    System.out.println("Result:"+result);
                    break;
                case '-':
                    result=subtract(num1,num2);
                    System.out.println("Result:"+result);
                    break;
                case '*':
                    result = multiplication(num1, num2);
                    System.out.println("Result:"+result);
                    break;
                case '/':
                    result = division(num1, num2);
                    System.out.println("Result:"+result);
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
            System.out.println("continue(Yes / No)");
            choice = sc.next();
        }while (choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("y") );
    }
}
