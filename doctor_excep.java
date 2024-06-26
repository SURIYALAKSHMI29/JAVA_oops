/*
Create a class Doctor with attributes id, name, age and department. Initialize values through parameterized constructor.
If age of Doctor is not in between 25 and 65 then generate user-defined exception “AgeNotWithinRangeException”.
If name contains numbers or special symbols raise exception “NameNotValidException”. Define the two exception classes.
 */
package model_lab;
public class doctor_exp {
    public static void main(String[] args)
    {
        new doctor("suriya",29,29,"CSE");
    }
}
class doctor
{
    String name, dept;
    int age,id;
    doctor(String name, int id, int age, String dept)
    {
        try
        {
            if(age<25 || age>65)
                throw new AgeNotWithinRangeException("Age invalid");
            if(!(name.matches("^[a-zA-Z]+$")))
                throw new NameNotValidException("Name Invalid!");
            System.out.println("Successfully instance is created for "+name);
        }
        catch(AgeNotWithinRangeException e)
        {
            System.err.println(e.getMessage());
        }
        catch(NameNotValidException ex)
        {
            System.err.println(ex.getMessage());
        }
        this.name = name;
        this.id = id;
        this.age = age;
        this.dept = dept;
    }
}
class AgeNotWithinRangeException extends Exception
{
    AgeNotWithinRangeException(String msg)
    {
        super(msg);
    }
}
class NameNotValidException extends Exception
{
    NameNotValidException(String msg)
    {
        super(msg);
    }
}
