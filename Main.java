import javax.swing.*; 
import java.awt.*;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("My app");
        frame.setSize(400,300);              
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); //Default layout for panel

        JButton jb = new JButton("This is a Button!");
        panel.add(jb);

        JLabel jl = new JLabel("This is a label!");
        panel.add(jl);

        JTextField jt = new JTextField(20);
        panel.add(jt);

        //JTextArea
        JTextArea jta = new JTextArea(10,19);  //20 rows, each 19 pixels wide
        JScrollPane jsp = new JScrollPane(jta);  //Adding scrollbar 
        panel.add(jsp);

        //Common methods for JTextArea
        jta.setText("This is line number 1");  //Replace existing text
        jta.append("This is line number 2!");  //Append more text
        jta.getText(); //Used to return existing text as string
        jta.setLineWrap(true); //Wrap to next line when no space left
        jta.setWrapStyleWord(true);  //Wrap whole word instead of broken alphabets

        frame.add(panel);
        frame.setVisible(true);    
    }
}