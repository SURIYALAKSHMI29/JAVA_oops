package exception;
import java.util.*;
public class Exception
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int a, b;
        int[] arr= new int[3];
        String str, str2;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the numbers a & b to perform Division:");
        a = obj.nextInt();
        b = obj.nextInt();
        try
        {
            float c = (float)a/(float)b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled!\nError:"+e.getMessage());
        }
        try
        {
            System.out.println("Array of 3 elements, assigning 32 as 4th element...");
            arr[0] = 34;
            arr[4] = 32;
            System.out.println("The given array is...");
            for(int i:arr)
            {
                System.out.print(i+"   ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Handled!\nArray Index Out Of Bounds Error: "+e.getMessage());
        }
        System.out.print("Enter Number:");
        str = obj.next();
        try
        {
            int num = Integer.parseInt(str);
            System.out.println("Entered number is "+ num);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Exception Handled!\nError:"+ex.getMessage());
        }
        System.out.print("Enter String:");
        str2 = obj.next();
        try
        {
            System.out.println("Character at 6th position: "+ str2.charAt(5));
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println("Exception Handled!\nError:"+ex.getMessage());
        }       
    }
    
}
