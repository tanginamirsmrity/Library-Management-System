import javax.swing.*;
import java.awt.*;

public class librarian_login {
    JFrame j;
    Container c;

    public void create_frame ()
        {
            j = new JFrame("Librarian Login Page");
            j.setVisible(true);
            j.setLocationRelativeTo(null);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j.setSize(400,400);
            j.setResizable(false);
        }

        public void entities ()
        {
            c = j.getContentPane();
            c.setLayout(null);

            JLabel l1 = new JLabel ("Enter Name : ");
            l1.setBounds(40,40,80,50);
            c.add(l1);
            JTextField tf1 = new JTextField ();
            tf1.setBounds(160,40,120,50);
            c.add(tf1);

            JLabel l2 = new JLabel ("Enter Password : ");
            l2.setBounds (40,100,120,50);
            c.add(l2);

            JTextField tf2 = new JTextField();
            tf2.setBounds(160,100,120,50);
            c.add(tf2);
            
            JButton login = new JButton ("Login");
            login.setBounds(140,200,100,50);
            c.add(login);
        }

        librarian_login()
        {
            create_frame();
            entities();
        }
    public static void main (String[] args) {
        librarian_login obj = new librarian_login();

    }
}
