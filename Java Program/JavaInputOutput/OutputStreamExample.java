import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            // Open the output stream to the file "output.txt"
            outputStream = new FileOutputStream("output.txt");
            
            // Sample text to write to the file
            String sampleText = "Hello, this is a sample text written to the file.\n"
                              + "This file is used for demonstrating OutputStream in Java.\n"
			      + "We found Fule Handling is Easy in Java.\n"
;
            
            // Convert the string to bytes
            byte[] data = sampleText.getBytes();
            
            // Write data to the file
            outputStream.write(data);
            
            // Flush the output stream to ensure all data is written
            outputStream.flush();
            
            System.out.println("Data successfully written to output.txt");
        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        } finally {
            // Close the output stream
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
