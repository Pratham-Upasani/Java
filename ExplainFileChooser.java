import javax.swing.*;
import java.io.File;
import java.awt.event.*;

public class ExplainFileChooser{
    public static void main(String[] args){
        JFrame frame = new JFrame("My First App");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JButton jb = new JButton("Click to select a file");
        panel.add(jb);
        
        JFileChooser jfc = new JFileChooser();
        
        jb.addActionListener((e) -> {
            int result = jfc.showOpenDialog(null);
            
            if(result == JFileChooser.APPROVE_OPTION){
                File f = jfc.getSelectedFile();
                JOptionPane.showMessageDialog(null,"File Path: "+f.getAbsolutePath()+", File name: "+f.getName());
                
                if(f.getName().toLowerCase().endsWith("txt")){
                    JOptionPane.showMessageDialog(null,"File you selected is a .txt File!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"File you selected is not a .txt File!");
                }
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
}