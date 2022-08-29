import javax.swing.*;
import java.awt.*;

public class JTextFields {
    JTextField jTextField;
    JButton reverseButton;
    JLabel promptLabel;
    JLabel contentLabel;




    public JTextFields(){

        JFrame jFrame = new JFrame("Text");

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(250,120);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
        jTextField = new JTextField(10);
        jTextField.setActionCommand("textField");


        // button
        reverseButton = new JButton("reverse");

        // Add action listeners


        jFrame.add(jTextField);
        jFrame.add(reverseButton);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFields();
            }
        });
    }



}
