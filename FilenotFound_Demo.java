import java.io.*;

public class FilenotFound_Demo {

    public static void main(String args[]) throws FileNotFoundException {
      // File file = new File("c://file.txt");
       // FileReader fr = new FileReader(file);
        tryReadFile();

    }
    public static int tryReadFile(){
        FileInputStream file;
        try {
            file=new FileInputStream("c://java.txt");
           int c;

            while ((c = file.read()) != -1 )  ;
                   return c;
        }  catch (IOException i) {
            System.out.println("File not found inside catch block");
            i.printStackTrace();
            return -1;

    }
}
}

