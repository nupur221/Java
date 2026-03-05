import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton equalButton, decimalButton, clearButton;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        textField.setBounds(30, 25, 240, 30);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            numberButtons[i].addActionListener(this); // Add action listener
        }

        functionButtons = new JButton[7];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalButton = new JButton("=");
        decimalButton = new JButton(".");
        clearButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equalButton;
        functionButtons[5] = decimalButton;
        functionButtons[6] = clearButton;

        for (JButton button : functionButtons) {
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setBackground(Color.WHITE);
            button.addActionListener(this);
        }

        panel = new JPanel();
        panel.setBounds(30, 75, 240, 260);
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(clearButton);
        panel.add(divButton);
        panel.add(equalButton);

        setLayout(null);
        add(textField);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Number buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
                return;
            }
        }
        
        // Decimal button
        if (e.getSource() == decimalButton) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText().concat("."));
            }
        }
        
        // Operator buttons
        if (e.getSource() == addButton) {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = '+';
                textField.setText("");
            }
        }
        if (e.getSource() == subButton) {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = '-';
                textField.setText("");
            }
        }
        if (e.getSource() == mulButton) {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = '*';
                textField.setText("");
            }
        }
        if (e.getSource() == divButton) {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = '/';
                textField.setText("");
            }
        }
        
        // Equal button
        if (e.getSource() == equalButton) {
            if (!textField.getText().isEmpty()) {
                num2 = Double.parseDouble(textField.getText());
                
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
                
                // Check if result is an integer
                if (result == (int) result) {
                    textField.setText(String.valueOf((int) result));
                } else {
                    textField.setText(String.valueOf(result));
                }
            }
        }
        
        // Clear button
        if (e.getSource() == clearButton) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = ' ';
        }
    }
}