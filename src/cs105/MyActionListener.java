package cs105;

import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

public class MyActionListener extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JTextField textField;
    private JLabel label;
    private String[] textAreaArray;
    private String[] textFieldArray;
    private String print="";
    private int counter;



    public MyActionListener(JTextArea textarea, JTextField txtfield, JLabel label) {
        this.textArea=textarea;
        this.textField=txtfield;
        this.label=label;
        this.textAreaArray=textArea.getText().split(" ");
        this.textFieldArray=textField.getText().split(";");



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int y=0;y<textFieldArray.length;y++){
            counter=0;
            for(int x=0;x<textAreaArray.length;x++){
                if(textAreaArray[x].equals(textFieldArray[y])){
                    counter+=1;

                }
            }
            print=(print+textFieldArray[y]+" "+counter+"\n");

        }

        label.setText(print);





    }


}
