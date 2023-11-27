/*
 Write an application that prompts a user for a full name and street address and constructs an ID from the user’s initials 
and numeric part of the address. For example, the user William Henry Harrison who lives at 34 Elm would have an ID of WHH34, 
whereas user Addison Mitchell who lives at 1778 Monroe would have an ID of AM1778.
 */
package model_lab;
import java.util.*;
public class name_add {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String name, address;
        System.out.print("Enter Name: ");
        name = obj.nextLine();
        System.out.print("Enter Address: ");
        address = obj.nextLine();
        String[] str = name.split(" ");
        String op = "";
        for(int i=0; i<str.length; i++)
        {
            op+=str[i].charAt(0);
        }
        op = op.toUpperCase();
        op+=address.replaceAll("[^0-9]", "");
        System.out.println("ID: "+op);
    }
}
