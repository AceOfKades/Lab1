//GUI Panel for Register

//needed for GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    private Register register;
    private JPanel inputPanel;
    private JTextField input;
    private PursePanel changePanel;
    RegisterPanel() {
        input = new JTextField(16);
        register = new Register();
        inputPanel = new JPanel();
        changePanel = new PursePanel();

        input.addActionListener(new InputListener());

        inputPanel.add(input);
        inputPanel.setPreferredSize(new Dimension(500, 100));

        changePanel.setBackground(Color.gray);
        changePanel.setPreferredSize(new Dimension(500, 200));

        this.add(inputPanel);
        this.add(changePanel);

    }
    public class InputListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            double amt;
            try
            {
                amt = Double.parseDouble(text);
            }
            catch(Exception InputMismatchException)
            {
                amt = 0.0;
            }
            changePanel.purse = register.makeChange(amt);
            changePanel.removeAll();
            changePanel.repaint();
        }
    }
}

