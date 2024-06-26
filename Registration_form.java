/* Develop a course registration form with Name, Address, phone number,Gender(Male or Female),
department(user have to select from CSE, ECE,EEE, Mech, Civil) and course (user have to select from (C,C++,JAVA,PYTHON).
When the user submits the form, a dialog box should appear with a message “Username , you have successfully enrolled in
Course Name” */
package model_lab;
import javax.swing.*;
import java.awt.event.*;
public class Reg_form 
{
    public static void main(String[] args)
    {
        new Registration();
    }
}
class Registration extends JFrame implements ActionListener
{
    JLabel name, address, num, gen, D, cour;
    JTextField n,add,ph;
    JComboBox<String> b1,b2,b3;
    JButton sub;

    Registration()
    {
        setSize(450,500);
        setLayout(null);
        setTitle("REGISTRATION FORM");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        name = new JLabel("Name:");
        name.setBounds(100,75,80,30);
        add(name);
        address = new JLabel("Address:");
        address.setBounds(100,125,80,30);
        add(address);
        num = new JLabel("Phone No:");
        num.setBounds(100,175,80,30);
        add(num);
        gen = new JLabel("Gender:");
        gen.setBounds(100,225,80,30);
        add(gen);
        D = new JLabel("Department:");
        D.setBounds(100,275,80,30);
        add(D);
        cour = new JLabel("Course:");
        cour.setBounds(100,325,80,30);
        add(cour);
        
        n= new JTextField("",15);
        n.setBounds(200,75,150,30);
        add(n);
        add= new JTextField("",15);
        add.setBounds(200,125,150,30);
        add(add);
        ph= new JTextField("",15);
        ph.setBounds(200,175,150,30);
        add(ph);
        
        String[] gender = {"Male","Female"};
        String[] dept = {"CSE","ECE","EEE","Mech","Civil"};
        String[] course = {"C","C++","JAVA","PYTHON"};
        b1 = new JComboBox<>(gender);
        b1.setBounds(200,225,60,30);
        add(b1);
        b2 = new JComboBox<>(dept);
        b2.setBounds(200,275,60,30);
        add(b2);
        b3 = new JComboBox<>(course);
        b3.setBounds(200,325,60,30);
        add(b3);
        
        sub = new JButton("SUBMIT");
        sub.setBounds(150,400,80,30);
        add(sub);
        sub.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String Username = n.getText();
        String coursename = (String) b3.getSelectedItem();
        JOptionPane.showMessageDialog(this,Username+", you have successfully enrolled in the "+coursename);
    }    
}
