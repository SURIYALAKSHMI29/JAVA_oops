//package_structure_demo.java file (Package)
import java.util.*;
import pack1.*;
import pack1.pack2.*;
import pack1.pack2.pack3.*;
public class package_structure_demo 
{   
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        MathOperations math = new MathOperations();
        StringOperations str = new StringOperations();
        Calculator cal = new Calculator();
        System.out.print("Enter 2 integers:");
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Addition:"+ math.add(a,b));
        System.out.println("Subtraction:"+ math.subtract(a,b));
        System.out.println("Multiplication:"+ cal.multiply(a,b));
        System.out.println("Division:"+ cal.divide(a,b));
        System.out.print("Enter 2 Strings:");
        String str1 = obj.next();
        String str2 = obj.next();
        System.out.println("Concatenation:"+ str.concatenate(str1,str2));
        System.out.println("After Reversing string1:"+ str.reverse(str1));
        System.out.println("After Reversing string2:"+ str.reverse(str2));
    }
}


//pack1 package - MathOperations .java file
package pack1;
public class MathOperations 
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int subtract(int a, int b)
    {
        return a-b;
    }      
}


//pack2 package - StringOperations.java file
package pack1.pack2;
public class StringOperations
{
    public String concatenate(String str1, String str2)
    {
        String str = str1 + str2;
        return str;
    }
    public String reverse(String str)
    {
        String str1="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            str1=ch+str1;
        }
        return str1;
    }
}


//pack3 package - Calculator.java file
package pack1.pack2.pack3;
public class Calculator
{
    public int multiply(int a, int b)
    {
        return a*b;
    }
    public float divide(int a, int b)
    {
        try
        {  
            if(b==0)
                throw new DividedByZeroException("Cannot dvided by zero");
            else
            {
            float c = (float)a/(float)b;
            return c;
            }
        }
        catch(DividedByZeroException e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
class DividedByZeroException extends Exception
{
    DividedByZeroException(String msg)
    {  
        super(msg);
    }  
}
