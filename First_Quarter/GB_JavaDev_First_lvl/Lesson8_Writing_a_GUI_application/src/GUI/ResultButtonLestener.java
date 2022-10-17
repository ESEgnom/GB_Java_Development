package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultButtonLestener implements ActionListener {
    private final JTextField inputField;
    private String lastCommand;
    private int x;

    public ResultButtonLestener(JTextField inputField, String lastCommand, int x) {
        this.inputField = inputField;
        this.lastCommand = lastCommand;
        this.x = x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(lastCommand.equals("+")){
           int y = Integer.parseInt(inputField.getText());
           inputField.setText(String.valueOf(x+y));
        }
    }
}
