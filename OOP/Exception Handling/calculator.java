import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class calculator extends JFrame implements ActionListener {
    
    JFrame f;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18;
    JTextField jt1;
    JLabel lb1;

    calculator()
   {
       jt1 = new JTextField();
       jt1.setBounds(180,50,300,40);
       add(jt1);
       lb1 = new JLabel("Result");
       lb1.setBounds(250,600,150,40);
       add(lb1);
       
       jb1 = new JButton("1");
       jb1.setBounds(50,150,80,40);
       add(jb1);
       
       
       jb2 = new JButton("2");
       jb2.setBounds(180,150,80,40);
       add(jb2);

       jb3 = new JButton("3");
       jb3.setBounds(320,150,80,40);
       add(jb3);
       jb4 = new JButton("+");
       jb4.setBounds(460,150,80,40);
       add(jb4);
       jb5 = new JButton("4");
       jb5.setBounds(50,240,80,40);
       add(jb5);
       jb6 = new JButton("5");
       jb6.setBounds(180,240,80,40);
       add(jb6);
       jb7 = new JButton("6");
       jb7.setBounds(320,240,80,40);
       add(jb7);
       jb8 = new JButton("-");
       jb8.setBounds(460,240,80,40);
       add(jb8);
       jb9 = new JButton("7");
       jb9.setBounds(50,320,80,40);
       add(jb9);
       jb10 = new JButton("8");
       jb10.setBounds(180,320,80,40);
       add(jb10);
       jb11 = new JButton("9");
       jb11.setBounds(320,320,80,40);
       add(jb11);
       jb12 = new JButton("*");
       jb12.setBounds(460,320,80,40);
       add(jb12);
       jb13 = new JButton(".");
       jb13.setBounds(50,400,80,40);
       add(jb13);
       jb14 = new JButton("0");
       jb14.setBounds(180,400,80,40);
       add(jb14);
       jb15 = new JButton("=");
       jb15.setBounds(320,400,80,40);
       add(jb15);
       jb16 = new JButton("/");
       jb16.setBounds(460,400,80,40);
       add(jb16);
       jb17 = new JButton("Delete");
       jb17.setBounds(370,480,150,40);
       add(jb17);
       jb18 = new JButton("Clear");
       jb18.setBounds(100,480,150,40);
       add(jb18);
       
       jb1.addActionListener(this);
       jb2.addActionListener(this);
       jb3.addActionListener(this);
       jb4.addActionListener(this);
       jb5.addActionListener(this);
       jb6.addActionListener(this);
       jb7.addActionListener(this);
       jb8.addActionListener(this);
       jb9.addActionListener(this);
       jb10.addActionListener(this);
       jb11.addActionListener(this);
       jb12.addActionListener(this);
       jb13.addActionListener(this);
       jb14.addActionListener(this);
       jb15.addActionListener(this);
       jb16.addActionListener(this);
       jb17.addActionListener(this);
       jb18.addActionListener(this);
       
       setLayout(null);
       setSize(700,700);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
   }
   
   public void actionPerformed (ActionEvent e)
   {
       int a = 0;
       int b = 0;
       
       try{
           a = Integer.parseInt(jt1.getText());
          // b = Integer.parseInt(jt2.getText());
       }
       
       catch(NumberFormatException ne){
           
           //JOptionPane.showMessageDialog(this, "Enter Integers");
       }
       
       double c = 0;


       
       if(e.getSource().equals(jb1))
       {
            try{
               c = a/b;
           }
           catch(ArithmeticException ae){
             //JOptionPane.showMessageDialog(this, "Divider must not be 0");  
           }
           lb1.setText(String.valueOf(c));
       }
       
       if(e.getSource().equals(jb2))
       {
           c = a + b;
          lb1.setText(String.valueOf(c));
       }
       
       if(e.getSource().equals(jb3))
       {
           c = a - b;
           lb1.setText(String.valueOf(c));
        }
       
      if(e.getSource().equals(jb4))
      {
          c = a*b;
          lb1.setText(String.valueOf(c));
      }

    }

     
      public static void main(String[] args){
           new calculator();
      }
   
}

