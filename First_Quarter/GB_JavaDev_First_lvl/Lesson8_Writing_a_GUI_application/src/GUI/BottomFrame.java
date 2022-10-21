package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class BottomFrame {
    private final JPanel panel;

    public BottomFrame(JTextField inputField) {
        DigitButtonListener buttonListener = new DigitButtonListener(inputField);
        ActionButtonListener actionBL = new ActionButtonListener(inputField);

        panel = new JPanel(new GridLayout(5, 4));

        JButton btnC = new JButton("c");
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });

        panel.add(btnC);
        JButton btnSqrt = new JButton("s");
        panel.add(btnSqrt);
        JButton btnPlug  = new JButton(" ");
        panel.add(btnPlug);
        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(actionBL);
        panel.add(btnDivide);

        JButton btnSeven = new JButton("7");
        btnSeven.addActionListener(buttonListener);
        panel.add(btnSeven);
        JButton btnEight = new JButton("8");
        btnEight.addActionListener(buttonListener);
        panel.add(btnEight);
        JButton btnNine = new JButton("9");
        btnNine.addActionListener(buttonListener);
        panel.add(btnNine);

        JButton btnMultiply = new JButton("x");
        btnMultiply.addActionListener(actionBL);
        panel.add(btnMultiply);

        JButton btnFour = new JButton("4");
        btnFour.addActionListener(buttonListener);
        panel.add(btnFour);
        JButton btnFive = new JButton("5");
        btnFive.addActionListener(buttonListener);
        panel.add(btnFive);
        JButton btnSix = new JButton("6");
        btnSix.addActionListener(buttonListener);
        panel.add(btnSix);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(actionBL);
        panel.add(btnMinus);

        JButton btnOne = new JButton("1");
        btnOne.addActionListener(buttonListener);
        panel.add(btnOne);
        JButton btnTwo = new JButton("2");
        btnTwo.addActionListener(buttonListener);
        panel.add(btnTwo);
        JButton btnThree = new JButton("3");
        btnThree.addActionListener(buttonListener);
        panel.add(btnThree);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(actionBL);

        panel.add(btnPlus);
        JButton btnPoint = new JButton(".");
        btnPoint.addActionListener(actionBL);
        panel.add(btnPoint);

        JButton btnZero = new JButton("0");
        btnZero.addActionListener(buttonListener);
        panel.add(btnZero);

        JButton btnPlag2 = new JButton(" ");
        panel.add(btnPlag2);
        JButton btnResult = new JButton("=");
        btnResult.addActionListener(actionBL);
        panel.add(btnResult);
    }

    public JPanel getPanel() {
        return panel;
    }
}
