//CALCULATOR
import java.util.*;
public class calci {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a:");
        String x = obj.next();
        System.out.print("Enter b:");
        String y = obj.next();       
        System.out.print("Enter operator...\n1. +\n2. -\n3. *\n4. /");
        String op = obj.next();
        try
        {
            float a=Float.parseFloat(x);
            float b=Float.parseFloat(y);
            if(b==0)
                throw new ArithmeticException("Divided by zero is not possible!");  
            if(!"+".equals(op) && !"-".equals(op) && !"*".equals(op) && !"/".equals(op) )
            {
                throw new OperatorException("Invalid Operator sign");
            }
            else
            {
                switch(op)
                {
                    case "+":
                        System.out.println("Addition: "+a+" + "+b+" = "+(a+b));
                        break;
                    case "-":
                        System.out.println("Subtraction: "+a+" - "+b+" = "+(a-b));
                        break;
                    case "*":
                        System.out.println("Multiplivation: "+a+" * "+b+" = "+(a*b));
                        break;
                    case "/":
                        System.out.println("Division: "+a+" / "+b+" = "+(a/b));
                        break;
                }
            }
        }
        catch(NumberFormatException e)
        {
            System.err.println("Invalid inputs");
        }
        catch(ArithmeticException e)
        {
            System.err.println(e.getMessage());
        }
        catch(OperatorException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
class OperatorException extends Exception
{
    OperatorException(String msg)
    {
        super(msg);
    }
}
