package lynda.advanced.filesanddirectories;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest {
    //Path is in new input output (nio)
//Path replaces file.Path can represent either dir or file. 
    public static void main(String[] args) {
        Path path = Paths.get("/temp/loremipsum.txt"); //either URI object or string that points to the location or name of the file
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(0));
        System.out.println(path.getName(1));
        System.out.println(path.getName(path.getNameCount() - 1));

        try {
            Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
            System.out.println(realPath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
