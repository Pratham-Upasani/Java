import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Task{
    public static void main(String[] args){
        try{
            String filename="tasks.txt";
            File c = new File(filename);

            if(c.createNewFile()){
                System.out.println("File successfully created!");
            }

            FileWriter w = new FileWriter(filename); //use true and dont use for loop to manual append
            FileReader l = new FileReader(filename);  
            BufferedReader r = new BufferedReader(l);
            
            String[] tasks = {"1. Complete String\n","2. Complete OOPS\n","3. Complete File Handling\n",
                                "4. Complete Basic Cryptography\n"};
            int i=0;

            for(i=0; i<tasks.length; i++){
                w.write(tasks[i]);
            }
            w.close();
            i=0;

            Boolean[] b = {true,true,true,false};
            String s;
            String[] s1 = new String[b.length];


            while((s=r.readLine())!=null){
                if(b[i]){
                    s1[i]=s+"   Done\n";
                }
                else{
                    s1[i]=s+"  Not Done\n";
                }
                i++;
            }
            r.close();

            w=new FileWriter(filename);
            for(i=0; i<s1.length; i++){
                w.write(s1[i]);
            }
            w.close();
        
        }
        catch(Exception e){
            System.out.println("Error message: "+(e.getMessage()));
        }
    }
}