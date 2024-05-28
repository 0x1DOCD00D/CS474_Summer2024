package ExceptionalCode;

import java.io.IOException;
import java.io.*;

public class Ex1Exception {
    public static void main(String[] args) {
        try {
//            throw new Exception("Rushi made it happen");
//            BufferedReader fileIn = new BufferedReader(new FileReader("fileName"));

            System.out.println("Hello world");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
