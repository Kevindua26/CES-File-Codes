import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Q67 {
    //Write a java program to demonstrate input stream.
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            // Open the input stream to the file "input.txt"
            inputStream = new FileInputStream("input.txt");

            int data;
            // Read data from the file until the end of the stream
            while ((data = inputStream.read()) != -1) {
                // Print each character read from the file
                System.out.print((char) data);
            }
        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        } finally {
            // Close the input stream
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
