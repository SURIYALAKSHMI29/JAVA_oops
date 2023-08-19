//numbers divisible by 7 between 100 and 200
package javaapplication1;
import java.util.*;
public class JavaApplication1
{
    public static void main(String[] args)
    {
        int sum=0,i;
        for(i=100;i<=200;i++)
        {
            if(i%7==0)
            {
               sum+=i;              
            }
        }
        System.out.println("Sum="+sum);
     }    
}
