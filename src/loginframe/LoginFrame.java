package loginframe;
import java.awt.*;
import java.awt.event.*;
class LoginFrame extends Frame implements ActionListener
{
    TextField tf1, tf2;
    Label l1, l2;
    Button b;
    String status ="";
    LoginFrame()
    {
        
        FlowLayout fl = new FlowLayout();	    
        setLayout(fl);    
        setVisible(true);
        setSize(500,500);
        setTitle("LoginFrame");
        l1 = new Label("User Name");
        l2 = new Label("Password");
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf2.setEchoChar('*');
        b = new Button("Login");
        b.addActionListener(this);
        setBackground(Color.yellow);
        
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.out.println("Window Closing");
                System.exit(0);                
            }
        });

        
        Font f = new Font("arial", Font.BOLD, 25);
        l1.setFont(f);
        l2.setFont(f);
        tf1.setFont(f);
        tf2.setFont(f);
        b.setFont(f);
        
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b);
                
    }
    public void actionPerformed(ActionEvent ae)
    {
        String uname = tf1.getText();
        String upwd = tf2.getText();
        if(uname.equals("nishil") && upwd.equals("nishil"))
        {
            status = "Success";
        }
        else
        {
            status = "Failure";
        }
        repaint();
        
    }
    public void paint(Graphics g)
    {
        Font f = new Font("arial", Font.BOLD,35);
        g.setFont(f);
        this.setForeground(Color.red);
        g.drawString("Login Status"+status, 50, 300);
    }
    public static void main(String[] args)
    {
        LoginFrame t = new LoginFrame();
    }    
    
}
