/*
Create a java abstract class to implement stack concept. Check for the overflow and empty conditions.
 */
package model_lab;
public class stack_imp {
    public static void main(String[] args)
    {
        Stack st = new int_stack(3);
        st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.push(4);
        st.pop();
        st.display();
    }
}
abstract class Stack
{
    int[] stack_arr;
    int top, capacity;
    Stack(int capacity)
    {
        this.capacity = capacity;
        stack_arr = new int[capacity];
        top = -1;
    }
    public abstract void push(int num);
    public abstract void pop();
    public abstract void display();
}
class int_stack extends Stack
{
    int_stack(int capacity)
    {
        super(capacity);
    }
    public void push(int num)
    {
        if(top>=capacity-1)
        {
            System.out.println("Stcak Overflow");
        }
        else
        {
            stack_arr[++top] = num;
            System.out.println("Element pushed: "+stack_arr[top]);
        }
    }
    public void pop()
    {
        if(top==-1)
            System.out.println("Stack Underflow");
        else
        {
            System.out.println("Element popped: "+stack_arr[top]);
            top--;
        }
    }
    public void display()
    {
        if(top==-1)
           System.out.println("Empty Stack");
        else
        {
            for(int i=top;i>=0;i--)
                System.out.print(stack_arr[i]+"  ");
            System.out.println();
        }
    }
}
