import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Q68 {
    //Write a java program to demonstrate output stream.
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try {
            // Open the output stream to the file "output.txt"
            outputStream = new FileOutputStream("output.txt");

            // Sample text to write to the file
            String sampleText = "Hello there, I am Kaivalaya Dua of BCA 2nd Year.\nCurrently I am in my 3rd semester and...\nI am loving the java programming subject the most";

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
