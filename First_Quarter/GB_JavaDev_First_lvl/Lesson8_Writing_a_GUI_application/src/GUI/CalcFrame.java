package GUI;

import javax.swing.*;
import java.awt.*;

import static java.awt.BorderLayout.*;


public class CalcFrame extends JFrame {
    public CalcFrame() {
        setTitle("Считало 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 300, 300);
        setLayout(new BorderLayout());

        TopFrame top = new TopFrame();
        add(top.getPanel(), NORTH);

        BottomFrame bottom = new BottomFrame(top.getInputField());
        add(bottom.getPanel(), CENTER);


        setVisible(true);
    }
}
