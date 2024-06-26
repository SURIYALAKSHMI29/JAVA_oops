/*
Create a new Java GUI application to convert miles to kilometers when pressing the “Convert!” button. 
Note that you need to implement the ActionListener interface and override the actionPerformed() method.
Note that 1 mile is equal to 1.609 kilometers.
 */
package model_lab;
import java.awt.*;
import static java.awt.Font.*;
import javax.swing.*;
import java.awt.event.*;
public class km_miles {
    public static void main(String[] args)
    {
          new convertor();
    }
}
class convertor extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1,t2; 
    JButton B1;
    convertor()
    {   
        l1 = new JLabel("Miles:");
        l1.setBounds(100,50,70,30);
        add(l1);
        l2 = new JLabel("Kilometers: ");
        l2.setBounds(100,100,100,30);
        add(l2);
      
        t1=new JTextField("",15);
        t1.setBounds(200, 50, 50, 20);
        add(t1);
        t2=new JTextField("",15);
        t2.setBounds(200,100, 50, 20);
        add(t2);
        
        B1 = new JButton("Convert!");
        B1.setBounds(125,200,120,20);
        add(B1);
        B1.addActionListener(this);
    
        setLayout(null);
        setSize(400,300);
        setVisible(true);
        setTitle("CONVERTOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        double m = Double.parseDouble(t1.getText());
        double km = m*1.609;
        t2.setText(Double.toString(km));
    }
}
