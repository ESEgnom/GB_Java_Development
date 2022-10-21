package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class ActionButtonListener implements ActionListener {
    private final JTextField inputField;
    private String lastCommand;
    private int x, y;


    public ActionButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("+")){
            lastCommand = e.getActionCommand();
            inputField.setText(inputField.getText() + " + ");

        }
        if(e.getActionCommand().equals("=")){
            String[] temp = inputField.getText().split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[2]);
            inputField.setText(String.valueOf(x + y));
        }
    }
}
