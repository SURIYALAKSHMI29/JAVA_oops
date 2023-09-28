/*Create a package named ‘com’. Define subpackages;  ‘transact’: with class ‘Transaction’ with static methods credit() and debit()   ‘loan’: with class ‘LoanAccount’ with method 
doTransaction() which calls Transaction class methods. Create one ‘LoanAccount’ object in main to perform operations on it by accepting command line arguments
*/

//com.java file (package)
package com;
import com.loan.*;
public class Com 
{
    public static void main(String args[]) 
    {
        float amt, bal;
        String TransType;
        LoanAccount obj = new LoanAccount();
        if(args.length<1)
            System.out.println("Provide proper information in command line");
        else
        {
        TransType=args[0];
        amt=Integer.parseInt(args[1]);  
        bal=Integer.parseInt(args[2]);
        float newbal = obj.dotransaction(TransType,amt,bal);
        if(bal==newbal)
        {
            System.out.println("Balance:"+bal);
        }
        else
            System.out.println("After performing "+TransType+" process, Balance = "+newbal);
        }
    }   
}


//transaction.java file (sub-package)
package com.transact;
public class transaction
{
    public static float credit(float amt, float bal)
    {
        return (bal+=amt);
    }
    public static float debit(float amt, float bal)
    {
        return(bal-=amt);
    }   
}


//LoanAccount.java file (sub-package)
package com.loan;
import com.transact.*;
public class LoanAccount
{
    public float dotransaction(String a, float amt, float bal)
    {
        if(a.equalsIgnoreCase("credit"))
            return transaction.credit(amt,bal);
        else if(a.equalsIgnoreCase("debit"))
             return transaction.debit(amt,bal);
        else
        {
            System.out.println("NA");
            return bal;
        }
    }
}
