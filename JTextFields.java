import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFields implements ActionListener {
    JTextField jTextField;
    JButton reverseButton;
    JLabel promptLabel;
    JLabel contentLabel;




    public JTextFields() {

        // create Jframe
        JFrame jFrame = new JFrame("Text");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(250,120);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        jTextField = new JTextField(10);
        jTextField.setActionCommand("textField");


        // button
        reverseButton = new JButton("Reverse");

        // Add action listeners

        jTextField.addActionListener(this);
        reverseButton.addActionListener(this);

        //Create our label prompt
        promptLabel = new JLabel("Enter your text");
        contentLabel = new JLabel("");

        //Add to frame
        jFrame.add(promptLabel);
        jFrame.add(jTextField);
        jFrame.add(reverseButton);
        jFrame.add(contentLabel);

        // make it visible
        jFrame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Reverse")){
            // Reverse the string
            String originalString = jTextField.getText();
            String holder ="";

            for (int i = originalString.length() -1; i >=0; i--){

                holder += originalString.charAt(i);
            }
            contentLabel.setText(holder);



        } else {
            // If pressed enter while focus was on textfield
            contentLabel.setText("You pressed Enter.  Text is :" + jTextField.getText());

        }


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
