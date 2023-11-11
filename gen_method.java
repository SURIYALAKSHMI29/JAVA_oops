//generic methods

package generic;
import java.util.*;
public class Generic 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter No.of elements:");
        int n = obj.nextInt();
        Integer[] arr = new Integer[n];
        System.out.print("Enter the elements (Integers)...\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        sample c = new sample();
        c.odd(arr);
        System.out.print("Enter No.of elements:");
        int m = obj.nextInt();
        String[] str = new String[m];
        System.out.print("Enter the elements (String)...\n");
        for(int i=0;i<m;i++)
        {
            str[i]=obj.next();
        }
        System.out.print("Enter positions to be swapped:");
        int s1 = obj.nextInt();
        int s2 = obj.nextInt();
        if(s1<=m && s2<=m && s1!=s2)
            c.swap(str,s1-1,s2-1);
        else
            System.out.println("The position specified is out of range!");
        System.out.print("\n*******Finding maximal Element between the given indices*******");
        System.out.print("\nEnter Start index:");
        int start = obj.nextInt();
        System.out.print("Enter end index:");
        int end = obj.nextInt();
        if(start<=n && end<=n)
            c.max(arr, start-1, end-1);
        else
            System.out.println("The position specified is inappropriate!");
    }
}
class sample
{ 
    <T extends Number> void odd(T obj[])
    {
        int count=0;
        for(int i=0;i<obj.length;i++)
        {
            double n = obj[i].doubleValue();
            if(n%2!=0)
            {
                System.out.printf(obj[i]+"\t");
                count++;
            }
        }
        System.out.println("\nNo.of Odd numbers: "+count);
    }
    <T> void swap(T obj[], int s1, int s2)
    {
        T temp;
        temp = obj[s1];
        obj[s1] = obj[s2];
        obj[s2] = temp;
        for(int i =0;i<obj.length;i++)
            System.out.printf(obj[i]+"\t");
    }
    <T extends Number> void max(T obj[], int start, int end)
    {
       double max = obj[start].doubleValue();
       for(int i =start;i<=end;i++)
       {
           double num=obj[i].doubleValue();
           if(max<num)
           {
               max=num;
           }
       } 
       System.out.println("Maximal element: "+max);
    }    
}
