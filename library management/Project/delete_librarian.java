import javax.swing.*;
import java.awt.*;

public class delete_librarian {

    public JFrame f;
    public Container c;
    public JTextField tf1;
    public JButton b;
    public JLabel l;

    public void create_frame()
    {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setTitle("Delete Librarian");
        c = f.getContentPane();
        c.setLayout(null);
    }

    public void add_components()
    {
        l = new JLabel ("Enter ID : ");
        l.setBounds(30,20,100,40);
        c.add(l);

        tf1 = new JTextField ();
        tf1.setBounds (100,20,130,40);
        c.add(tf1);

        b = new JButton ("Delete");
        b.setBounds (100,80,80,40);
        c.add (b);
    }

    delete_librarian ()
    {
        create_frame();
        add_components();
    }
    public static void main (String[] args ){
        delete_librarian al = new delete_librarian();
    }
}
