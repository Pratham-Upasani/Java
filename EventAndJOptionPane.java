import javax.swing.*;
import java.awt.event.*; //Compulsory to import for ActionListener and events to work

public class EventAndJOptionPane{
    public static void main(String[] args){
        JFrame frame = new JFrame("My First App");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);


        JPanel panel = new JPanel();

        JButton jb1 = new JButton("Show a message!");
        panel.add(jb1);

        JButton jb2 = new JButton("Show an error message!");
        panel.add(jb2);

        JButton jb3 = new JButton("Input a value!");
        panel.add(jb3);

        //Using Anonymous class
        jb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"This is a Message popup box!");
            }
        });

        //Using lambda expression
        jb2.addActionListener((e) -> JOptionPane.showMessageDialog(null,"Error popup!","ERROR",
        JOptionPane.ERROR_MESSAGE));

        jb3.addActionListener((e) -> 
        {String Name=JOptionPane.showInputDialog(null,"Input a value: ");
            JOptionPane.showMessageDialog(null,"You entered "+Name);
         });    

        frame.add(panel);
        frame.setVisible(true);
    }
}