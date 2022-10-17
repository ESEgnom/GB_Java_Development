package GUI;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.CENTER;

public class TopFrame {

    private final JPanel panel;
    private final JTextField inputField;
    public TopFrame() {
        panel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        panel.add(inputField, CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getInputField() {
        return inputField;
    }
}
