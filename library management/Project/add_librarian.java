import javax.swing.*;
import java.awt.*;

class add_librarian {
    public JFrame f;
    public JLabel l1,l2,l3,l4,l5,l6;
    public Container c;
    public JButton b1;
    public JTextField tf1,tf2,tf3,tf4,tf5;


    public void create_frame()
    {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setTitle("BAUST Library Management System");
        c = f.getContentPane();
        c.setLayout(null);
    }

    public void add_components ()
    {
        l1 = new JLabel ("Add Librarian");
        l1.setBounds (200,10,150,30);
        c.add(l1);

        l2 = new JLabel ("Name");
        l2.setBounds (50,50,80,50);
        c.add(l2);

        l3 = new JLabel ("Password");
        l3.setBounds (50,120,80,50);
        c.add(l3);

        l4 = new JLabel ("Email");
        l4.setBounds (50,190,80,50);
        c.add(l4);

        l5 = new JLabel ("City");
        l5.setBounds (50,260,80,50);
        c.add(l5);

        l6 = new JLabel ("Contact No");
        l6.setBounds (50,330,80,50);
        c.add(l6);

        tf1 = new JTextField();
        tf1.setBounds (200,50,200,30);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds (200,120,200,30);
        c.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds (200,190,200,30);
        c.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds (200,260,200,30);
        c.add(tf4);

        tf5 = new JTextField();
        tf5.setBounds (200,330,200,30);
        c.add(tf5);

        b1 = new JButton ("Add Librarian");
        b1.setBounds (150,390,200,30);
        c.add(b1);

    }

    add_librarian ()
    {
        create_frame();
        add_components();
    }

    public static void main (String[] args ){
        add_librarian al = new add_librarian();
    }
}
