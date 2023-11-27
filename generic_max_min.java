/*
 Write a java program to find the minimum, maximum value from the given type of elements using a generic function.
 */
package model_lab;
import java.util.*;
public class gen_max_min {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        min_max m = new min_max();
        System.out.print("Enter no.of elements(integer) in a array:");
        int n = obj.nextInt();
        Integer[] int_arr = new Integer[n];
        System.out.println("Enter the Elements..");
        for(int i=0;i<n;i++)
            int_arr[i]=obj.nextInt();
        m.max(int_arr);
        System.out.print("Enter no.of elements(double) in a array:");
        int d = obj.nextInt();
        Double[] d_arr = new Double[d];
        System.out.println("Enter the Elements...");
        for(int i=0;i<d;i++)
            d_arr[i]=obj.nextDouble();        
        m.max(d_arr);
    }
}
class min_max
{
    <T extends Number> void max(T[] ele)
    {
        double max= ele[0].doubleValue();
        double min= ele[0].doubleValue();
        for(int i=0;i<ele.length;i++)
        {
            double num = ele[i].doubleValue();
            if(num>max)
                max=num;
            else if(num<min)
                min=num;
        }
        System.out.println("Maximal EElement: "+max+"\nMinimal Element: "+min);
    }
}
