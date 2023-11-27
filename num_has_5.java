/*
 Count the numbers from 1 to n that have 5 as a digit.
 */
package model_lab;
import java.util.*;
public class num_has_5 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=obj.nextInt();
        System.out.println("Numbers that has Digit 5 are,");
        int count=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            while(num>0)
            {
                int digit = num%10;
                if(digit==5)
                {
                    count++;
                    System.out.print(i+"  ");
                }   
                num=num/10;
            }
        }
        System.out.println("\nTotal number of Numbers that has 5 from 1 to "+n+" is: "+count);
    }
}
