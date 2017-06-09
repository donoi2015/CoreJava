package lynda.advanced.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//copying images byte by byte
public class ByteStreamsTest {

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("io/flower.jpg");
             FileOutputStream out = new FileOutputStream("io/newflower.jpg");) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
