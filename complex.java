/*
Define a class named COMPLEX for representing complex numbers that contains necessary data members and member functions. 
A complex number has the general form a + ib, where a is the real part and b is the imaginary part (i stands for imaginary). 
Include methods for all the four basic arithmetic operators.
 */
package model_lab;
import java.util.*;
public class complexNo {
    public static void main(String[] args)
    {
        complex c = new complex();
        c.show();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
class complex
{
    int x1,y1,x2,y2;
    complex()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Real & Imaginary part of Complex Number 1: ");
        x1 = obj.nextInt();
        y1 = obj.nextInt();
        System.out.print("Enter Real & Imaginary part of Complex Number 2: ");
        x2 = obj.nextInt();
        y2 = obj.nextInt();
    }
    public void show()
    {
        System.out.println("Complex Number 1: "+x1+"+"+y1+"i\nComplex Number 1: "+x2+"+"+y2+"i");
    }
    void add()
    {
        System.out.println("Addition: "+(x1+x2)+"+"+(y1+y2)+"i");
    }
    void sub()
    {
        System.out.println("Subtraction: "+(x1-x2)+"+"+(y1-y2)+"i");
    }
    void mul()
    {
        System.out.println("Mulplication: "+(x1*x2)+"+"+(y1*y2)+"i");
    }
    void div()
    {
        System.out.println("Division: "+(x1/x2)+"+"+(y1/y2)+"i");
    }
}
