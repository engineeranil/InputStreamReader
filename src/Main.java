import javax.swing.*;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("test.txt");
            InputStreamReader inputReader = new InputStreamReader(input, Charset.forName("MacTurkish"));
            System.out.println(inputReader.getEncoding());

            int i = inputReader.read();

            while (i!=-1){
                System.out.print((char) i);
                i=inputReader.read();
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }



    }
}
