package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultButtonLestener implements ActionListener {
    private final JTextField inputField;
    private String lastCommand;
    private int x;

    public ResultButtonLestener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(lastCommand.equals("+")){
            System.out.println("3 "+ lastCommand);
           int y = Integer.parseInt(inputField.getText());
           inputField.setText(String.valueOf(x+y));
        }
    }
}
