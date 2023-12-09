import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Calculator_1 implements ActionListener {
    JFrame frame = new JFrame();
    JTextField inputDisplay = new JTextField();
    JButton one = new JButton("1");
    JButton Two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton addition = new JButton("+");
    JButton subtraction = new JButton("-");
    JButton sum = new JButton("=");
    JTextField output = new JTextField();

    public Calculator_1() {
        //button creat
        inputDisplay.setBounds(80, 40, 230, 50);
        one.setBounds(80, 100, 50, 50);
        three.setBounds(80, 160, 50, 50);
        addition.setBounds(80, 220, 50, 50);
        Two.setBounds(257, 100, 50, 50);
        four.setBounds(257, 160, 50, 50);
        subtraction.setBounds(257, 220, 50, 50);
        sum.setBounds(170, 280, 50, 50);
        output.setBounds(145, 350, 100, 40);
        inputDisplay.setEditable(false);
        output.setEditable(false);
        //frame set
        frame.setBounds(50, 50, 400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //add to frame
        frame.add(inputDisplay);
        frame.add(one);
        frame.add(Two);
        frame.add(three);
        frame.add(four);
        frame.add(addition);
        frame.add(subtraction);
        frame.add(sum);
        frame.add(output);
        // action call
        one.addActionListener(this);
        Two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        addition.addActionListener(this);
        subtraction.addActionListener(this);
        sum.addActionListener(this);

    }

    public static void main(String[] args) {
        new Calculator_1();
    }

    String str ="";

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sum) {
            calculate_sum();
        } else {
            str = str + ((JButton)e.getSource()).getText();
            inputDisplay.setText(str);
        }
    }

    void calculate_sum() {
        String string = inputDisplay.getText();
        String[] s = string.split("[+-]");
        int x = Integer.parseInt(s[0]);
        int Sum = x;


        for (int i = 0, j = 1; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '+') {
                int y = Integer.parseInt(s[j]);
                j++;
                Sum += y;

            } else if (c == '-') {
                int y = Integer.parseInt(s[j]);
                j++;
                Sum -= y;
            }
        }
        output.setText(String.valueOf(Sum));

    }
}