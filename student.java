/*
Write a java class called ‘student’ with name, and rollno. Write a class ‘Result’ to get Marks of 3 subjects
and another class “Sports’ to get the points obtained in sports. Calculate the total Marks and displays the
result (pass or fail) with points obtained in sports for three students using inheritance and constructor.
 */
package model_lab;
import java.util.*;
public class main1
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Sports[] s = new Sports[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("\nStudent "+(i+1)+" Details: ");
            System.out.print("Name: ");
            String name = obj.next();
            System.out.print("Roll.No: ");
            int r_no = obj.nextInt();
            System.out.print("Enter 3 Subject Marks: ");
            int m1 = obj.nextInt();  
            int m2 = obj.nextInt();            
            int m3 = obj.nextInt();
            System.out.print("Sports Point: ");
            int spM = obj.nextInt();            
            s[i]= new Sports(name, r_no, m1, m2, m3, spM);
        }
        System.out.println("*******Displaying Results******");
        for(int i=0;i<3;i++)
            s[i].display();
    }
}
class student
{
    String name;
    int r_no;
    student(String name, int r_no)
    {
        this.name = name;
        this.r_no = r_no;
    }
}
class Result extends student
{
    int m1,m2,m3;
    int total;
    String res;
    Result(String name, int r_no, int m1, int m2, int m3)
    {
        super(name,r_no);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        total=m1+m2+m3;
        if(total>=120)
            res="PASS";
        else
            res = "FAIL";
    }
}    
class Sports extends Result
{
    int spM;
    Sports(String name, int r_no, int m1,int m2, int m3,int spM)
    {
        super(name,r_no,m1,m2,m3);
        this.spM = spM;
    }
    void display()
    {
        System.out.println("\nName: "+name+"\nRoll No: "+r_no+"\nTotal: "+total+"\nResult: "+res+"\nSports Point: "+spM);
    }    
}
