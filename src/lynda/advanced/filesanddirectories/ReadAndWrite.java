package lynda.advanced.filesanddirectories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadAndWrite {

    public static void main(String[] args) {
        Path source = Paths.get("files/newdir/loremipsum.txt");
        System.out.println(source.getFileName());
        Path target = Paths.get("files/empty.txt");
        System.out.println(target.getFileName());

        Charset charset = Charset.defaultCharset();
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(source, charset)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bw = Files.newBufferedWriter(target, charset)) {
            Iterator<String> iterator = lines.iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                bw.append(s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
