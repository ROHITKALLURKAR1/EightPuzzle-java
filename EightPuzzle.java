import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EightPuzzle extends  JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;



    EightPuzzle(){
        setTitle("8 PUZZLE ");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3, 5, 5));

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


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b9);
        add(b8);


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
    public void actionPerformed(ActionEvent e){


       if (e.getSource() == b5) {

    if (b2.getText().equals(" ")) {
        move(b5, b2);
    }
    else if (b4.getText().equals(" ")) {
        move(b5, b4);
    }
    else if (b6.getText().equals(" ")) {
        move(b5, b6);
    }
    else if (b9.getText().equals(" ")) {
        move(b5, b9);
    }
}

    if (e.getSource() == b2) {

    if (b1.getText().equals(" ")) {
        move(b2, b1);
    }
    else if (b3.getText().equals(" ")) {
        move(b2, b3);
    }
    else if (b5.getText().equals(" ")) {
        move(b2, b5);
    }
    
}
 if (e.getSource() == b1) {

    if (b2.getText().equals(" ")) {
        move(b1, b2);
    }
    else if (b4.getText().equals(" ")) {
        move(b1, b4);
    }
     
}

 if (e.getSource() == b4) {

    if (b1.getText().equals(" ")) {
        move(b4, b1);
    }
    else if (b5.getText().equals(" ")) {
        move(b4, b5);
    }

    else if (b7.getText().equals(" ")) {
        move(b4, b7);
    }

     
}

if (e.getSource() == b6) {

    if (b3.getText().equals(" ")) {
        move(b6, b3);
    }
    else if (b5.getText().equals(" ")) {
        move(b6, b5);
    }

    else if (b8.getText().equals(" ")) {
        move(b6, b8);
    }

     
}

if (e.getSource() == b7) {

    if (b9.getText().equals(" ")) {
        move(b7, b9);
    }
    else if (b4.getText().equals(" ")) {
        move(b7, b4);
    }

     
}

if (e.getSource() == b8) {

    if (b6.getText().equals(" ")) {
        move(b8, b6);
    }
    else if (b9.getText().equals(" ")) {
        move(b8, b9);
    }

     
}

if (e.getSource() == b9) {

    if (b7.getText().equals(" ")) {
        move(b9, b7);
    }
    else if (b5.getText().equals(" ")) {
        move(b9, b5);
    }

     else if (b8.getText().equals(" ")) {
        move(b9, b8);
    }

     
 }

 if (e.getSource() == b3) {

    if (b2.getText().equals(" ")) {
        move(b3, b2);
    }
    else if (b6.getText().equals(" ")) {
        move(b3, b6);
    }

     
}

}


    public void move(JButton clicked, JButton empty) {

    if (empty.getText().equals(" ")) {
        empty.setText(clicked.getText());
        clicked.setText(" ");
        checkwin();
    }
}

public void checkwin(){
     if (
        b1.getText().equals("1") &&
        b2.getText().equals("2") &&
        b3.getText().equals("3") &&
        b4.getText().equals("4") &&
        b5.getText().equals("5") &&
        b6.getText().equals("6") &&
        b7.getText().equals("7") &&
        b9.getText().equals("8") &&
        b8.getText().equals(" ")
        ) {
            JOptionPane.showMessageDialog(this, "You Win!");
        }
}
    
    public static void main(String[] args) {
       new EightPuzzle(); 
    }
}
