/*
A program accepts two integers as command line arguments. It displays all prime numbers between these two.
Validate the input for the following criteria: Both should be positive integers. The second should be larger than the first.
Create user defined exceptions for both.
 */
package model_lab;
public class prime_arg {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try
        {
            if(args.length>2)
                throw new ArgumentException("Error!\nProvide only 2 numbers as arguments");
            if(a<0 || b<0)
                throw new PositiveException("Error! Entered a negative number");
            if(a>b)
                throw new LargeNumberException("Error! First number is larger than second number");
            else
            {
                System.out.println("The prime numbers between "+a+"& "+b+":");
                for(int i=a;i<=b;i++)
                {
                    int count=0;
                    for(int j=2;j<i;j++)
                    {
                        if(i%j==0)
                        {
                            count++;
                            break;
                        }
                    }    
                    if(count==0)
                        System.out.print(i+"  ");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class ArgumentException extends Exception
{
    ArgumentException(String msg)
    {
        super(msg);
    }
}
class PositiveException extends Exception
{
    PositiveException(String msg)
    {
        super(msg);
    }
}
class LargeNumberException extends Exception
{
    LargeNumberException(String msg)
    {
        super(msg);
    }
}
