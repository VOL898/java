import javax.swing.*;
import java.awt.*;

class gui{

    public static void main(String args[]){
       JFrame frame = new JFrame("Simple Calculator");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,500);

       //Header
       JPanel header = new JPanel();
       JLabel label = new JLabel("Total = ");
       JTextField tf = new JTextField(20); // accepts upto 20 characters
       header.add(label);
       header.add(tf);

       //Enter Number stuff
       JPanel panel = new JPanel();
       JLabel label2 = new JLabel("Enter Number");
       JTextField tf2 = new JTextField(20); // accepts upto 20 characters
       JButton enter = new JButton("Enter");
       JButton clearTotal = new JButton("Clear Total");
       panel.add(label2);
       panel.add(tf2);
       panel.add(enter);
       panel.add(clearTotal);

       /*JButton b1 = new JButton("Add");
       JButton b2 = new JButton("Subtract");
       JButton b3 = new JButton("Multiply");
       JButton b4 = new JButton("Divide");
       JButton b5 = new JButton("Modulus");
       panel.add(b1);
       panel.add(b2);
       panel.add(b3);
       panel.add(b4);
       panel.add(b5);*/

       frame.getContentPane().add(BorderLayout.NORTH, header);
       frame.getContentPane().add(BorderLayout.CENTER, panel);
       frame.setVisible(true);
    }

}