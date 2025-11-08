import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileHandling{
    public static void main(String[] args){
        try{
            File c = new File("test.txt");
            FileWriter w = new FileWriter("test.txt",true);
            BufferedReader r = new BufferedReader(new FileReader("test.txt"));
            
            if(c.createNewFile()){
                System.out.println("File created successfully!");
            }
            else{
                System.out.println("File already exists!");
            }

            w.write("Hello!\nToday I am Learning Java File Handling!"); //Run again and text will append
            w.close();

            String s;
            while((s=r.readLine())!=null){
                System.out.println(s);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println("Error message: "+(e.getMessage()));
        }
    }
}