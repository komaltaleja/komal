import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculator implements ActionListener
{
JFrame fr;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6;
Container conn;
calculator()
{
fr=new JFrame();
conn=fr.getContentPane();
conn.setBackground(Color.gray);
fr.setBounds(0,0,400,400);
l1=new JLabel("Enter 1st number");
l1.setBounds(0,0,100,20);
fr.add(l1);
t1=new JTextField();
t1.setBounds(130,0,120,20);
fr.add(t1);
l2=new JLabel("Enter 2nd number");
l2.setBounds(0,30,120,20);
fr.add(l2);
t2=new JTextField();
t2.setBounds(130,30,120,20);
fr.add(t2);
l3=new JLabel("Answer");
l3.setBounds(0,60,120,20);
fr.add(l3);
t3=new JTextField();
t3.setBounds(130,60,120,20);
fr.add(t3);
b1=new JButton("ADD");
b1.setBounds(0,90,100,20);
fr.add(b1);
b2=new JButton("SUBTRACT");
b2.setBounds(110,90,120,20);
fr.add(b2);
b3=new JButton("MULTIPLY");
b3.setBounds(240,90,140,20);
fr.add(b3);
b4=new JButton("DIVIDE");
b4.setBounds(0,120,100,20);
fr.add(b4);
b5=new JButton("EXIT");
b5.setBounds(110,120,120,20);
fr.add(b5);
b6=new JButton("RESET");
b6.setBounds(240,120,140,20);
fr.add(b6);
fr.setLayout(null);
fr.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
}
public void actionPerformed(ActionEvent k)
{
if(k.getSource()==b1)
{
t3.setText(String.valueOf(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
}
if(k.getSource()==b2)
{
t3.setText(String.valueOf(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
}
if(k.getSource()==b3)
{
t3.setText(String.valueOf(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
}
if(k.getSource()==b4)
{
t3.setText(String.valueOf(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));
}
if(k.getSource()==b5)
{
fr.dispose();
}
if(k.getSource()==b6)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
public static void main(String hgvf[])
{
new calculator();
}
}
