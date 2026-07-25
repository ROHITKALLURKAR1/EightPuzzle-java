import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class EightPuzzle extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    JButton shuffle;
    boolean shuffling = false;

    EightPuzzle() {
        setTitle("8 PUZZLE ");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        shuffle = new JButton("Shuffle");

        add(shuffle, BorderLayout.SOUTH);

        shuffle.addActionListener(this);
        shuffle.setFont(new Font("Arial", Font.PLAIN, 30));

        JPanel puzzlePanel = new JPanel();

        puzzlePanel.setLayout(new GridLayout(3, 3, 5, 5));
        // setLayout(new GridLayout(3, 3, 5, 5));

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b9 = new JButton(" ");
        b8 = new JButton("8");

        b1.setFont(new Font("Arial", Font.PLAIN, 60));
        b2.setFont(new Font("Arial", Font.PLAIN, 60));
        b3.setFont(new Font("Arial", Font.PLAIN, 60));
        b4.setFont(new Font("Arial", Font.PLAIN, 60));
        b5.setFont(new Font("Arial", Font.PLAIN, 60));
        b6.setFont(new Font("Arial", Font.PLAIN, 60));
        b7.setFont(new Font("Arial", Font.PLAIN, 60));
        b8.setFont(new Font("Arial", Font.PLAIN, 60));
        b9.setFont(new Font("Arial", Font.PLAIN, 60));

        b1.setForeground(Color.RED);
        b2.setForeground(Color.RED);
        b3.setForeground(Color.RED);
        b4.setForeground(Color.RED);
        b5.setForeground(Color.RED);
        b6.setForeground(Color.RED);
        b7.setForeground(Color.RED);
        b8.setForeground(Color.RED);
        b9.setForeground(Color.RED);

        b1.setBackground(new Color(10, 41, 71));
        b2.setBackground(new Color(10, 41, 71));
        b3.setBackground(new Color(10, 41, 71));
        b4.setBackground(new Color(10, 41, 71));
        b5.setBackground(new Color(10, 41, 71));
        b6.setBackground(new Color(10, 41, 71));
        b7.setBackground(new Color(10, 41, 71));
        b8.setBackground(new Color(10, 41, 71));
        b9.setBackground(new Color(10, 41, 71));

        puzzlePanel.add(b1);
        puzzlePanel.add(b2);
        puzzlePanel.add(b3);
        puzzlePanel.add(b4);
        puzzlePanel.add(b5);
        puzzlePanel.add(b6);
        puzzlePanel.add(b7);
        puzzlePanel.add(b9);
        puzzlePanel.add(b8);
        add(puzzlePanel, BorderLayout.CENTER);
        // add(b1);
        // add(b2);
        // add(b3);
        // add(b4);
        // add(b5);
        // add(b6);
        // add(b7);
        // add(b9);
        // add(b8);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == shuffle) {
            shufflePuzzle();
            return;
        }

        if (e.getSource() == b5) {

            if (b2.getText().equals(" ")) {
                move(b5, b2);
            } else if (b4.getText().equals(" ")) {
                move(b5, b4);
            } else if (b6.getText().equals(" ")) {
                move(b5, b6);
            } else if (b9.getText().equals(" ")) {
                move(b5, b9);
            }
        }

        if (e.getSource() == b2) {

            if (b1.getText().equals(" ")) {
                move(b2, b1);
            } else if (b3.getText().equals(" ")) {
                move(b2, b3);
            } else if (b5.getText().equals(" ")) {
                move(b2, b5);
            }

        }
        if (e.getSource() == b1) {

            if (b2.getText().equals(" ")) {
                move(b1, b2);
            } else if (b4.getText().equals(" ")) {
                move(b1, b4);
            }

        }

        if (e.getSource() == b4) {

            if (b1.getText().equals(" ")) {
                move(b4, b1);
            } else if (b5.getText().equals(" ")) {
                move(b4, b5);
            }

            else if (b7.getText().equals(" ")) {
                move(b4, b7);
            }

        }

        if (e.getSource() == b6) {

            if (b3.getText().equals(" ")) {
                move(b6, b3);
            } else if (b5.getText().equals(" ")) {
                move(b6, b5);
            }

            else if (b8.getText().equals(" ")) {
                move(b6, b8);
            }

        }

        if (e.getSource() == b7) {

            if (b9.getText().equals(" ")) {
                move(b7, b9);
            } else if (b4.getText().equals(" ")) {
                move(b7, b4);
            }

        }

        if (e.getSource() == b8) {

            if (b6.getText().equals(" ")) {
                move(b8, b6);
            } else if (b9.getText().equals(" ")) {
                move(b8, b9);
            }

        }

        if (e.getSource() == b9) {

            if (b7.getText().equals(" ")) {
                move(b9, b7);
            } else if (b5.getText().equals(" ")) {
                move(b9, b5);
            }

            else if (b8.getText().equals(" ")) {
                move(b9, b8);
            }

        }

        if (e.getSource() == b3) {

            if (b2.getText().equals(" ")) {
                move(b3, b2);
            } else if (b6.getText().equals(" ")) {
                move(b3, b6);
            }

        }

    }

    public void shufflePuzzle() {

        shuffling = true;

        // Enable buttons again in case player already won
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            if (b1.getText().equals(" ")) {
                JButton[] moves = { b2, b4 };
                move(moves[random.nextInt(moves.length)], b1);
            }

            else if (b2.getText().equals(" ")) {
                JButton[] moves = { b1, b3, b5 };
                move(moves[random.nextInt(moves.length)], b2);
            }

            else if (b3.getText().equals(" ")) {
                JButton[] moves = { b2, b6 };
                move(moves[random.nextInt(moves.length)], b3);
            }

            else if (b4.getText().equals(" ")) {
                JButton[] moves = { b1, b5, b7 };
                move(moves[random.nextInt(moves.length)], b4);
            }

            else if (b5.getText().equals(" ")) {
                JButton[] moves = { b2, b4, b6, b9 };
                move(moves[random.nextInt(moves.length)], b5);
            }

            else if (b6.getText().equals(" ")) {
                JButton[] moves = { b3, b5, b8 };
                move(moves[random.nextInt(moves.length)], b6);
            }

            else if (b7.getText().equals(" ")) {
                JButton[] moves = { b4, b9 };
                move(moves[random.nextInt(moves.length)], b7);
            }

            else if (b9.getText().equals(" ")) {
                JButton[] moves = { b7, b5, b8 };
                move(moves[random.nextInt(moves.length)], b9);
            }

            else if (b8.getText().equals(" ")) {
                JButton[] moves = { b6, b9 };
                move(moves[random.nextInt(moves.length)], b8);
            }
        }

        shuffling = false;
    }

    public void move(JButton clicked, JButton empty) {

        if (empty.getText().equals(" ")) {

            empty.setText(clicked.getText());
            clicked.setText(" ");

            if (!shuffling) {
                checkwin();
            }
        }
    }

    public void checkwin() {
        if (b1.getText().equals("1") &&
                b2.getText().equals("2") &&
                b3.getText().equals("3") &&
                b4.getText().equals("4") &&
                b5.getText().equals("5") &&
                b6.getText().equals("6") &&
                b7.getText().equals("7") &&
                b9.getText().equals("8") &&
                b8.getText().equals(" ")) {
            b1.setBackground(new Color(254, 127, 45));
            b2.setBackground(new Color(254, 127, 45));
            b3.setBackground(new Color(254, 127, 45));
            b4.setBackground(new Color(254, 127, 45));
            b5.setBackground(new Color(254, 127, 45));
            b6.setBackground(new Color(254, 127, 45));
            b7.setBackground(new Color(254, 127, 45));
            b8.setBackground(new Color(254, 127, 45));
            b9.setBackground(new Color(254, 127, 45));

            JOptionPane.showMessageDialog(this, "You Win! ");
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }
    }

    public static void main(String[] args) {
        new EightPuzzle();
    }
}
