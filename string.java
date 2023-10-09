package strings;
public class Strings {
    public static void main(String[] args) 
    {
        String s=new String("Land");
        s.concat("mister").replace('d', 'n').toUpperCase().replace('M','N').toString();
        System.out.println(s);
        String str ="oops";
        String str2 = new String("oops");
        System.out.println(str==str2);
    }  
}
