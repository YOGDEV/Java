
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ActionListener
{
JTextField tf1,tf2,tf3;
A()
{
JLabel l1=new JLabel("FISRT NUMBWER ");
JLabel l2=new JLabel("SECOND NUMBWER ");
JLabel l3=new JLabel("RESULT: ");


tf1=new JTextField(20);
tf2=new JTextField(20);
tf3=new JTextField(20);
JButton b1=new JButton("SUM");
JButton b2=new JButton("SUB");
JButton b3=new JButton("MUL");
JButton b4=new JButton("DIV");
JButton b5=new JButton("EXIT");

setLayout(new FlowLayout());
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(l3);
add(tf3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}

   public void actionPerformed(ActionEvent e)
   {
   int r=0;
   String s=e.getActionCommand();
   
     if(s.equals("SUM"))
     {
     r=Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
     }

     if(s.equals("SUB"))
     {
     r=Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText());
     }
     if(s.equals("MUL"))
     {
     r=Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
     }

     if(s.equals("DIV"))
     {
           if(Integer.parseInt(tf2.getText())==0)
           throw new ArithmeticException("Dont't divide by Zero");
           else
           r=Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText());
     }

     if(s.equals("EXIT"))
     {
     System.exit(0);
     }


   tf3.setText(Integer.toString(r));
   }

public static void main(String[] args)
{
A d=new A();
d.setSize(300,400);
d.setVisible(true);
}
}
