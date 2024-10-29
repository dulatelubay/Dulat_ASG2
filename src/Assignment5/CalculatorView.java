package Assignment5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumberField = new JTextField(10);
    private JTextField secondNumberField = new JTextField(10);
    private JLabel resultLabel = new JLabel("Результат:");
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");

    public CalculatorView() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        panel.add(firstNumberField);
        panel.add(secondNumberField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(resultLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.add(panel);
    }

    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText());
    }

    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText());
    }

    public void setResult(String result) {
        resultLabel.setText("Результат: " + result);
    }

    public void addOperationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
    }

    public JButton getAddButton() { return addButton; }
    public JButton getSubtractButton() { return subtractButton; }
    public JButton getMultiplyButton() { return multiplyButton; }
    public JButton getDivideButton() { return divideButton; }
}
