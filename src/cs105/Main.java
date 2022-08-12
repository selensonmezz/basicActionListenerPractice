package cs105;

import javax.swing.*;
import javax.swing.tree.AbstractLayoutCache;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame= new JFrame("Term Finder");
        frame.setSize(400,250);
        frame.setLayout(new GridLayout(3,2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        //panel1
        panel3.setBackground(Color.pink);
        JTextArea txtarea= new JTextArea("today my teacher called me and tell me that ı have to upload hw5 but hw5 is very difficult that ı cant do hw5");
        txtarea.setBackground(Color.white);
        panel1.add(txtarea);

        //panel2
        JLabel label1= new JLabel("Find:");
        panel2.add(label1);
        JTextField txtfield= new JTextField("me;hw5;and");
        panel2.add(txtfield);
        JButton button= new JButton("Find");
        panel2.add(button);
        JRadioButton radioButton= new JRadioButton("Case Sensitive");
        panel2.add(radioButton);

        //panle3
        JLabel unvisiblelabel=new JLabel();
        panel3.add(unvisiblelabel);
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setVisible(true);


        MyActionListener listener =new MyActionListener(txtarea,txtfield,unvisiblelabel);
        button.addActionListener(listener);
        txtfield.addActionListener(listener);



    }

}

