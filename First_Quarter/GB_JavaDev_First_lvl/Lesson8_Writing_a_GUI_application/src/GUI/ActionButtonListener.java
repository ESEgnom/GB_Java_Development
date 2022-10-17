package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ActionButtonListener implements ActionListener {
    private final JTextField inputField;
    private String lastCommand;
    private int x;

    public ActionButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("+")){
            lastCommand = e.getActionCommand();
           x = Integer.parseInt(inputField.getText());
           inputField.setText("");
        }

    }

    public String getLastCommand() {
        System.out.println("1 "+ lastCommand);
        return lastCommand;
    }

    public int getX() {
        return x;
    }
}
