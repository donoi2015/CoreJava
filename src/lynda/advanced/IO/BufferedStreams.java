package lynda.advanced.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreams {

    public static void main(String[] args) {
        //Buffering the read'n'write operations is a good way of automatically managing memory
        //you get improved mem management, more efficient use of system resources.
        try (
                BufferedReader in = new BufferedReader(new FileReader("io/hamlet.xml"));
                BufferedWriter out = new BufferedWriter(new FileWriter("io/newHamlet.txt"));
        ) {
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
