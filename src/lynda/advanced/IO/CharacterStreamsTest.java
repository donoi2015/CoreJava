package lynda.advanced.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//copying character based files.
public class CharacterStreamsTest {
    public static void main(String[] args) {
        try (FileReader in = new FileReader("io/textfile.txt");
             FileWriter out = new FileWriter("io/new2.txt");) {
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
