package ScientificCalculator;

import java.util.*;
import java.lang.Math;

import static java.lang.Float.NaN;

public class DevOpsCalculator {
    public static void main(String args[])
    {
        int choice, flag=0;
        double num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Scientific Calculator");
        do {
            System.out.println("Press\n1 for Square Root\n2 for Factorial\n3 for Natural Logarithm\n4 for Power Function\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (flag != 1){
                if (choice == 4) {
                    System.out.println("Enter two numbers");
                    System.out.print("Enter number 1: ");
                    num1 = scan.nextDouble();
                    System.out.print("Enter number 2: ");
                    num2 = scan.nextDouble();
                }
                else
                {
                    System.out.println("Enter number: ");
                    num1 = scan.nextDouble();
                    num2 = 0;
                }
                switch(choice) {
                    case 1: System.out.println("Square Root of "+num1+" = "+SquareRoot(num1));
                        break;
                    case 2: System.out.println("Factorial of "+num1+" = "+Factorial(num1));
                        break;
                    case 3: System.out.println("Natural Log of "+num1+" = "+NaturalLog(num1));
                        break;
                    case 4: System.out.println(num1+" to the Power "+num2+" = "+Power(num1, num2));
                        break;
                    default: System.out.println("Exiting, Bye");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }

    static double SquareRoot(double a) {
        return Math.sqrt(a);
    }
    static double Factorial(double a) {
        if (a==0 || a==1)
        {
            return 1;
        }
        else if(a<0)
        {
            return NaN;
        }
        else if(a%1!=0)
        {
            return NaN;
        }
        else {
            long result = 1;

            for (int factor = 2; factor <= a; factor++) {
                result *= factor;
            }

            return result;
        }
    }
    static double NaturalLog(double a) {
        return Math.log(a);
    }
    static double Power(double a, double b) {
        return Math.pow(a, b);
    }
}
