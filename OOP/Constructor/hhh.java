
/*import javax.swing.*;
import java.awt.*;
import java.io.*;

public class hhh {

    public static void operate(int key) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[fis.available()];
                fis.read(data);
                fis.close();
                for (int i = 0; i < data.length; i++) {
                    data[i] = (byte) (data[i] ^ key);
                }
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(data);
                fos.close();
                JOptionPane.showMessageDialog(null, "Done");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Operation");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Roboto", Font.BOLD, 25);
        JButton button = new JButton("Open Image");
        button.setFont(font);

        JTextField textField = new JTextField(10);
        textField.setFont(font);

        button.addActionListener(e -> {
            String text = textField.getText();
            int key = Integer.parseInt(text);
            operate(key);
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(textField);
        frame.setVisible(true);
    }
}*/
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class hhh {

    private static void operate(int key, boolean encrypt) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[fis.available()];
                fis.read(data);
                fis.close();
                for (int i = 0; i < data.length; i++) {
                    if (encrypt) {
                        data[i] = (byte) (data[i] ^ key);
                    } else {
                        data[i] = (byte) (data[i] ^ key);
                    }
                }
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(data);
                fos.close();
                JOptionPane.showMessageDialog(null, "Operation completed.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Operation");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Roboto", Font.BOLD, 25);
        JButton encryptButton = new JButton("Encrypt");
        encryptButton.setFont(font);

        JButton decryptButton = new JButton("Decrypt");
        decryptButton.setFont(font);

        JTextField keyField = new JTextField(10);
        keyField.setFont(font);

        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = keyField.getText();
                int key = Integer.parseInt(text);
                operate(key, true);
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = keyField.getText();
                int key = Integer.parseInt(text);
                operate(key, false);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(encryptButton);
        frame.add(decryptButton);
        frame.add(keyField);
        frame.setVisible(true);
    }
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.Font;


public class hhh {

    private static void operate(int key, boolean encrypt) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[fis.available()];
                fis.read(data);
                fis.close();
                for (int i = 0; i < data.length; i++) {
                    data[i] = (byte) (data[i] ^ key);
                }
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(data);
                fos.close();
                JOptionPane.showMessageDialog(null, "Operation completed.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Operation");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        Font font = new Font("Roboto", Font.BOLD, 18);
        JLabel label = new JLabel("Enter Key:");
        label.setFont(font);
        panel.add(label);

        JTextField keyField = new JTextField(10);
        keyField.setFont(font);
        panel.add(keyField);

        JButton encryptButton = new JButton("Encrypt");
        encryptButton.setFont(font);
        panel.add(encryptButton);

        JButton decryptButton = new JButton("Decrypt");
        decryptButton.setFont(font);
        panel.add(decryptButton);

        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = keyField.getText();
                int key = Integer.parseInt(text);
                operate(key, true);
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = keyField.getText();
                int key = Integer.parseInt(text);
                operate(key, false);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
