import javax.swing.*;
import java.awt.*;

class issue_book{
    public JFrame f;
    public JLabel l1,l2,l3,l4,l5;
    public Container c;
    public JButton b1,b2;
    public JTextField tf1,tf2,tf3,tf4;
    public Font font1;


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
        font1 = new Font ("verdana",Font.PLAIN,17);
        l1 = new JLabel ("Issue Book");
        l1.setBounds (140,20,120,30);
        l1.setFont (font1);
        c.add(l1);

        l2 = new JLabel ("Book ID : ");
        l2.setBounds(70,80,120,30);
        c.add(l2);

        l3 = new JLabel ("Student ID : ");
        l3.setBounds(70,130,120,30);
        c.add(l3);

        l4 = new JLabel ("Student Name : ");
        l4.setBounds(70,180,120,30);
        c.add(l4);

        l5 = new JLabel ("Contact No. : ");
        l5.setBounds(70,230,120,30);
        c.add(l5);

        tf1 = new JTextField();
        tf1.setBounds(200,80,120,30);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(200,130,120,30);
        c.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(200,180,120,30);
        c.add(tf3);

        tf4 = new JTextField();
        tf4.setBounds(200,230,120,30);
        c.add(tf4);

        b1 = new JButton ("Issue Book");
        b1.setBounds(140,280,120,30);
        c.add(b1);
    }
    issue_book ()
    {
        create_frame();
        add_components();
    }

    public static void main (String[] args ){
        issue_book ib = new issue_book();
    }
}