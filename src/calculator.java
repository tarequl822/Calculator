import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarOutputStream;

public class calculator implements ActionListener {

    JFrame jframe=new JFrame();
    JLabel input1=new JLabel("Input 1");
    JLabel input2=new JLabel("Input 2");
    JTextField Input1box= new JTextField();
    JTextField Input2box= new JTextField();
    JButton addition =new JButton("+");
    JButton substitution =new JButton("-");
    JButton multiplication =new JButton("*");
    JButton deviation =new JButton("/");
    JLabel answer=new JLabel("Answer");
    JTextField answerBOX= new JTextField();

    public calculator(){
        //input box
        input1.setBounds(50,50,100,30);
        input2.setBounds(450,50,100,30);
        Input1box.setBounds(170,50,100,30);
        Input2box.setBounds(330,50,100,30);
        addition.setBounds(110,150,50,30);
        substitution.setBounds(440,150,50,30);
        multiplication.setBounds(110,250,50,30);
        deviation.setBounds(440,250,50,30);
        answer.setBounds(150,350,100,30);
        answerBOX.setBounds(250,350,150,30);
        answerBOX.setEditable(false);


        //add to frame
        jframe.add(input1);
        jframe.add(input2);
        jframe.add(Input1box);
        jframe.add(Input2box);
        jframe.add(addition);
        jframe.add(substitution);
        jframe.add(multiplication);
        jframe.add(deviation);
        jframe.add(answer);
        jframe.add(answerBOX);

        addition.addActionListener(this);
        substitution.addActionListener(this);
        multiplication.addActionListener(this);
        deviation.addActionListener(this);
        // frame set
        jframe.setBounds(50,50,600,600);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }
    public static void main(String[] args) {

        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addition){
            double a= (Double.parseDouble(Input1box.getText()))+(
                    Double.parseDouble(Input2box.getText()));
            answerBOX.setText(String.valueOf(a));
        }
        else if(e.getSource()==substitution){
            double a= (Double.parseDouble(Input1box.getText()))-(
                    Double.parseDouble(Input2box.getText()));
            answerBOX.setText(String.valueOf(a));
        }
        else if(e.getSource()==multiplication){
           double a= (Double.parseDouble(Input1box.getText()))*(
                    Double.parseDouble(Input2box.getText()));
            answerBOX.setText(String.valueOf(a));
        }
       else if(e.getSource()==deviation){
           double a= (Double.parseDouble(Input1box.getText()))/(
                    Double.parseDouble(Input2box.getText()));
            answerBOX.setText(String.valueOf(a));
        }
    }

}
