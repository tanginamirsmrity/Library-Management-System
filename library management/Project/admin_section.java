import javax.swing.*;
import java.awt.*;

public class admin_section {

    public JFrame f;
    public Container c;
    public JLabel l1;
    public JButton b1,b2,b3,b4;

    public void create_frame()
    {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,300);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setTitle("BAUST Library Management System");
        c = f.getContentPane();
        c.setLayout(null);
    }

    admin_section()
    {
        create_frame();
        
        l1 = new JLabel ("Admin Section");
        l1.setBounds(150,20,150,20);
        c.add(l1);  

        b1 = new JButton("Add Librarian");
        b1.setBounds(120,60,150,30);
        c.add(b1);

        b2 = new JButton("View Librarian");
        b2.setBounds(120,110,150,30);
        c.add(b2);

        b3 = new JButton("Delete Librarian");
        b3.setBounds(120,160,150,30);
        c.add(b3);

        b4 = new JButton("Log Out");
        b4.setBounds(120,210,150,30);
        c.add(b4);

    }

    public static void main (String[] args ){
        admin_section as = new admin_section();
    }
}
