/*
 Write a java program for exception handling:
a.To create a user defined exception whenever user input the word “hello”.
b.To add two integers and raise exception when any other character except number (0 – 9) is given as input.
 */
package model_lab;
import java.util.*;
public class exception_handling {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.next();
        char num1, num2;
        System.out.println("Enter 2 Numbers(Digits): ");
        num1 = obj.next().charAt(0);
        num2 = obj.next().charAt(0);
        try
        {
            if(str.equals("hello") || str.equals("Hello"))
                throw new HelloException("Error! User Entered the word Hello");
            else
                System.out.println("String Entered: "+str);
        }
        catch(HelloException e)
        {
            System.err.println(e.getMessage());
        }
        try
        {
            if(Character.isLetter(num1) || Character.isLetter(num2))
                throw new DigitException("Error Handled! Enter Digits alone");
            else
            {
                int n1= Integer.parseInt(num1+"");
                int n2= Integer.parseInt(num2+"");
                System.out.println("Sum: "+(n1+n2));
            }
        }
        catch(DigitException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
class HelloException extends Exception
{
    HelloException(String msg)
    {
        super(msg);
    }
}
class DigitException extends Exception
{
    DigitException(String msg)
    {
        super(msg);
    }
}
