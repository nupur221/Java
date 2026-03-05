import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SudokuGame extends JFrame {
    private JTextField[][] grid;

    public SudokuGame() {
        super("Sudoku Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(9, 9));

        grid = new JTextField[9][9];

        // Initialize the Sudoku grid with empty text fields
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new JTextField();
                grid[i][j].setHorizontalAlignment(JTextField.CENTER);
                add(grid[i][j]);
            }
        }

        // Button to check the solution
        JButton checkButton = new JButton("Check Solution");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isSudokuSolved()) {
                    JOptionPane.showMessageDialog(SudokuGame.this, "Congratulations! Sudoku Solved!");
                } else {
                    JOptionPane.showMessageDialog(SudokuGame.this, "Solution is incorrect. Keep trying!");
                }
            }
        });

        // Button to reset the grid
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetSudokuGrid();
            }
        });

        // Panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(checkButton);
        buttonPanel.add(resetButton);

        // Add components to the frame
        add(buttonPanel);

        setVisible(true);
    }

    private boolean isSudokuSolved() {
        // Implement your Sudoku solving logic here
        // For simplicity, we are assuming the solution is correct if all cells are filled
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetSudokuGrid() {
        // Clear all text fields in the grid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j].setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SudokuGame();
            }
        });
    }
}
