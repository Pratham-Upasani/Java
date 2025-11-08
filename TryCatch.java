public class TryCatch{
    public static void main(String[] args){
        try{
            int x=10/0; //You cannot divide a number by zero so arithmetic error
            System.out.println(x);
        }
        catch(ArithmeticException a){   //This looks for only Arithmetic errors
            System.out.println("Number cannot be divided by zero! \nError message: "+(a.getMessage()));
        }
        catch(ArrayIndexOutOfBoundsException q){ //Checking for only one error
            System.out.println("Array Index out of Bounds! \nError message: "+(q.getMessage()));
        }
        catch(Exception e){ //Exception includes almost all errors
            System.out.println("Error message: "+(e.getMessage()));   
            
            //The e,a,q are called exception objects / can be anything
            //They all hold some info about what went wrong
            //getMessage() returns that info as a string
        }
    }
}