import javax.swing.*;
import java.awt.*;

public class about {
    public JFrame f;
    public Container c;
    public JLabel l1,l2,l3,l4;
    public Font f1,f2,f3,f4;

    about ()
    {
        f = new JFrame ("About us");
        f.setVisible (true);
        f.setLocationRelativeTo(null);
        f.setSize(600,400);             //600x400
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        c = f.getContentPane();
        c.setLayout (null);

        add_components();
    }

    public void add_components ()
    {
        f1 = new Font ("veranda",Font.PLAIN,17);
        l1 = new JLabel("BAUST Library Management System");
        l1.setBounds(150,30,290,30);
        l1.setFont(f1);
        c.add(l1);

        f2 = new Font ("veranda",Font.PLAIN,17);
        l2 = new JLabel ("Version 1");
        l2.setBounds (250,80,100,30);
        l2.setFont(f2);
        c.add(l2);

        f3 = new Font ("veranda",Font.PLAIN,17);
        l3 = new JLabel ("Copyright 2021");
        l3.setBounds (230,130,150,30);
        l3.setFont(f3);
        c.add(l3);

        f4 = new Font ("veranda",Font.PLAIN,17);
        l4 = new JLabel ("Designed and Developed By :");
        l4.setBounds (10,190,400,30);
        l4.setFont(f4);
        c.add(l4);
    }
    
    public static void main (String[] args) {
        about obj  = new about ();
    }
}
