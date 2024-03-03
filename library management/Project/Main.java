import javax.swing.*;
import java.awt.*;

class Main{
    public JFrame f;
    public JLabel ilabel;
    public Container c;
    public JButton b1,b2;
    public JTextField tf1,tf2;
    public ImageIcon img;

    public void create_frame()
    {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,600);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setTitle("BAUST Library Management System");
    }
    public void addImage ()
    {
        img = new ImageIcon (getClass().getResource(".\\bin\\blogo.jpg"));
        ilabel = new JLabel (img);
        ilabel.setBounds (150,20,300,300);
        c.add(ilabel);
    }
    public void getcp()
    {
        c = f.getContentPane();
        c.setLayout(null);
    }
    public void add_button ()
    {
        b1 = new JButton ("Admin Login");
        b1.setBounds(245,330,130,50);
        c.add(b1);

        b2 = new JButton ("Librarian Login");
        b2.setBounds(245,400,130,50);
        c.add(b2);
    }
    Main ()
    {
        create_frame();
        getcp();
        ChangeIcon();
        changeBackgroundColor();
        addImage();
        add_button();
    }
    public void changeBackgroundColor ()
    {
        c.setBackground (Color.white);
    }
    public void ChangeIcon ()
    {
        ImageIcon i = new ImageIcon (getClass().getResource(".\\bin\\blogo.jpg"));
        f.setIconImage(i.getImage());
    }
    public static void main (String[] args ){
        Main m = new Main();
    }
}