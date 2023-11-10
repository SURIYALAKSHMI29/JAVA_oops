//counter using JFrame & Multi-Threading

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends Frame{
    public static void main(String[] args)
    {
        JFrame j = new JFrame("COUNTER");
        j.setSize(500,500);
        j.setVisible(true);
        JButton jb = new JButton("START");
        jb.setBounds(100,300,100,40);
        JButton jb2 = new JButton("STOP");
        jb2.setBounds(300,300,100,40);
        JLabel txt = new JLabel("COUNTER THAT COUNTS UPTO 1000...");
        txt.setBounds(110,45,500,95);
        j.add(txt);
        jb2.setEnabled(false);
        count c = new count(j);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                jb.setEnabled(false);
                Thread countTh = new Thread(c, "Counter");
                countTh.start();
                jb2.setEnabled(true);
            }
        });
        j.add(jb);
        jb2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                jb2.setEnabled(false);
                c.Stop();
                jb.setEnabled(true);
            }
        });
        j.add(jb2);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
class count extends Thread
{
    JFrame j;
    Graphics g;
    boolean keepRunning;
    count(JFrame j)
    {
        this.j = j;
        g = j.getGraphics();
        Font f = new Font("TimesNewRomans",Font.PLAIN,40);
        g.setFont(f);
    }
    public void run()
    {
        keepRunning = true;
        print();
    }
    public synchronized void print()
    {
        while(true)
        {
        g.drawOval(200,150,100,100);
        try
        {
            for(int i= 0;i<1000;i++)
            {
            if(keepRunning == false)
                break;
            g.setColor(Color.white);
            g.fillOval(202,152,98,98);
            String str = Integer.toString(i);
            g.setColor(Color.black); 
            g.drawString(str,240,220);
            Thread.sleep(1000);
            }
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {}
        }
    }
    public void Stop()
    {
        keepRunning = false;
    }
}
