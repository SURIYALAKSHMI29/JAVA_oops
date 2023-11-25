/*
Create an interface “CreditCardInterface” with methods to viewCreditAmount, viewPin, changePin and payBalance. Create
a class Customer (name, card number, pin, creditAmount – initialized to 0). Implement methods of the interface
“CreditCardInterface” in Customer class. Create an array of customer objects and perform the following actions.
• Pay Balance
• Change Pin
 */
package model_lab;
import java.util.*;
public class interface_sample {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        customer[] c = new customer[2];
        for(int i=0;i<2;i++)
        {
            System.out.println("Client "+(i+1)+":");
            System.out.print("Name: ");
            String name = obj.next();
            System.out.print("Credit card Number: ");
            String c_no = obj.next();
            System.out.print("PIN: ");
            int pin = obj.nextInt();
            c[i] = new customer(name,c_no,pin);
        }
        c[0].changePin(4567);
        System.out.println("Updated PIN: "+c[0].viewpin());
        c[1].payBalance(100);
        System.out.println(c[0].name);
    }
}
interface CreditCardInterface
{
    double viewCreditAmount();
    int viewpin();
    void changePin(int n_pin);
    void payBalance(double amt);
}
class customer implements CreditCardInterface
{
    String name,c_no;
    int pin;
    double creditAmount;
    customer(String name, String c_no, int pin)
    {
        this.name = name;
        this.c_no = c_no;
        this.pin = pin;
        creditAmount=0.0;
    }    
    public double viewCreditAmount()
    {
        return creditAmount;
    }
    public void changePin(int n_pin)
    {
        pin=n_pin;
    }
    public int viewpin()
    {
        return pin;
    }
    public void payBalance(double amt)
    {
        creditAmount -= amt;
        System.out.println(amt+" is transfered from "+c_no);
    }
}
