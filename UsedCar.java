// ThrowUsedCarExceptions.java file
import java.util.*;
public class ThrowUsedCarExceptions 
{
    public static void main(String[] args)
    {
        UsedCar[] uc = new UsedCar[8];
        Scanner obj = new Scanner(System.in);
        String VIN, make;
        int year, mileage, price;
        System.out.println("Enter the details of 8 Cars...");
        for(int i=0;i<8;i++)
        {
            System.out.println("\nCar "+(i+1)+":");
            System.out.print("VIN:");
            VIN = obj.next();
            System.out.print("Make:");
            make = obj.next();
            System.out.print("Year:");
            year = obj.nextInt();
            System.out.print("Price:");
            price = obj.nextInt();
            System.out.print("Mileage:");
            mileage = obj.nextInt();
            uc[i] = new UsedCar(make, VIN, year, mileage, price);
        }    
        System.out.println("\n\nUsedCar objects are constructed Sucessfully!\n");
        for(UsedCar c:uc)
        {
            if(c.year!=0)
                System.out.println(c);
        }
    }
}

// UsedCar.java file
public class UsedCar 
{
    String make;
    int VIN,year, mileage, price, c=0;
    UsedCar(String make, String VIN, int year, int mileage, int price)
    {
        try
        {
        String[] m= {"Ford","Honda","Toyota","Chrysler","Other"};
        if(VIN.length()!=4 || year<1990 || year>2014 || mileage<0 || price<0)
        {
            throw new UsedCarException(VIN);
        }
        for(String s:m)
        {
            if(s.equalsIgnoreCase(make))
                break;
            else
                c+=1;
        }
        if(c==4)
            throw new UsedCarException(VIN);
        this.make = make;
        int V = Integer.parseInt(VIN);
        this.VIN = V;
        this.year = year;
        this.price=price;
        this.mileage=mileage;
        }
        catch(UsedCarException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public String toString()
    {
         return "VIN:"+VIN+"\nMake:"+make+"\nYear:"+year+"\nMileage:"+mileage+"\nPrice:"+price+"\n";
    }
}

// UsedCarException.java file
public class UsedCarException extends Exception
{
    UsedCarException(String VIN)
    {
        super(VIN+" Invalid Information!");
    }
}

