import javax.swing.*;
import java.awt.*;

class return_book{
    public JFrame f;
    public JLabel l1,l2;
    public Container c;
    public JButton b1,b2;
    public JTextField tf1,tf2;

    public void create_frame()
    {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setTitle("BAUST Library Management System");
        c = f.getContentPane();
        c.setLayout(null);
    }

    public void add_components()
    {
        l1 = new JLabel ("Book ID : ");
        l1.setBounds (50,20,100,50);
        c.add(l1);

        tf1 = new JTextField ();
        tf1.setBounds (160,20,150,50);
        c.add(tf1);

        l2 = new JLabel ("Student ID : ");
        l2.setBounds (50,90,100,50);
        c.add(l2);

        tf2 = new JTextField();
        tf2.setBounds (160,90,150,50);
        c.add(tf2);

        b1 = new JButton ("Retrun Book");
        b1.setBounds(120,180,150,50);
        c.add(b1);

    }
    return_book ()
    {
        create_frame();
        add_components();
    }

    public static void main (String[] args ){
        return_book rb = new return_book();
    }
}