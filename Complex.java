//complex
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of Complex number 1:");
        int x1 = obj.nextInt();
        int y1 = obj.nextInt();
        System.out.println("Enter real and imaginary part of Complex number 2:");
        int x2 = obj.nextInt();
        int y2 = obj.nextInt();
        System.out.println("Arithmetic operations...");
        complex comp = new complex();
        complex x = new complex(x1,y1);
        complex y = new complex(x2,y2);
        comp.add(x,y);
        comp.sub(x,y);
        comp.mul(x,y);
        comp.div(x,y);
    }
}
class complex
{
    int real, img;
    char ch = '+';
    //default constructor
    complex()
    {}
    //parameterized constructor
    complex(int r,int i)
    {
        real=r;
        img=i;
    }
    void add(complex x, complex y)
    {
        complex a= new complex();
        a.real = x.real + y.real;
        a.img = x.img + y.img;
        System.out.println("Addition: "+a.real+ch+a.img+"i");
    }
    void sub(complex x, complex y)
    {
        complex b = new complex();
        b.real = x.real - y.real;
        b.img = x.img - y.img;
        System.out.println("Subtraction: "+ b.real+ch+b.img+"i");
    }
    void mul(complex x, complex y)
    {
        complex m = new complex();
        m.real = x.real * y.real;
        m.img = x.img * y.img;
        System.out.println("Multiplication: "+m.real+ch+m.img+"i");
    }
    void div(complex x, complex y)
    {
        complex d = new complex();
        d.real = x.real / y.real;
        d.img = x.img / y.img;
        System.out.println("Division: "+d.real+ch+d.img+"i");
    }
}
