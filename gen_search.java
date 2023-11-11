//search an element in the given array using generic method

package generic;
import java.util.*;
public class searchDemo {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("*****String Array*****");
        System.out.print("Enter No.of elements:");
        int n = obj.nextInt();
        String[] str = new String[n];
        System.out.print("Enter the elements(String)...\n");
        for(int i=0;i<n;i++)
        {
            str[i]=obj.next();
        }
        System.out.print("Enter the search element:");
        String ele = obj.next();
        func f = new func();
        f.search(str, ele);
        Integer[] int_arr = new Integer[n];
        System.out.println("*****Integer Array*****");
        System.out.print("Enter No.of elements:");
        int n1 = obj.nextInt();
        System.out.print("Enter the elements(Integer)...\n");
        for(int i=0;i<n1;i++)
        {
            int_arr[i]=obj.nextInt();
        }
        System.out.print("Enter the search element:");
        Integer el = obj.nextInt();  
        f.search(int_arr, el);
    }
}
class func
{
    <T> void search(T obj[], T s)
    {
        int c=0;
        String ele = s.toString();
        for(int i=0;i<obj.length;i++)
        {
            String ob = obj[i].toString();
            if(ob.equals(ele))
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println("FOUND!");
        else
            System.out.println("NOT FOUND!");
    }
}
