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
        }else if(e.getActionCommand().equals("-")) {
            lastCommand = e.getActionCommand();
            inputField.setText(inputField.getText() + " - ");
        }else if(e.getActionCommand().equals("x")) {
            lastCommand = e.getActionCommand();
            inputField.setText(inputField.getText() + " x ");
        }else if(e.getActionCommand().equals("/")) {
            lastCommand = e.getActionCommand();
            inputField.setText(inputField.getText() + " / ");
        }else if (e.getActionCommand().equals("s")){
            x = Integer.parseInt(inputField.getText());
            inputField.setText(String.valueOf(Math.sqrt(x)));

        }

        if(e.getActionCommand().equals("=")){
            String[] temp = inputField.getText().split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[2]);
            if (lastCommand.equals("+")) inputField.setText(String.valueOf(x + y));
            else if (lastCommand.equals("-")) inputField.setText(String.valueOf(x - y));
            else if (lastCommand.equals("x")) inputField.setText(String.valueOf(x * y));
            else if (lastCommand.equals("/")) inputField.setText(String.valueOf(x / y));

        }
    }
}
