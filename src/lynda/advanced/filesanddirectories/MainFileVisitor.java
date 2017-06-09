package lynda.advanced.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainFileVisitor {

    public static void main(String[] args) throws IOException {
        Path fileDir = Paths.get("filevisitor");
        MyFileVisitor visitor = new MyFileVisitor();
        Files.walkFileTree(fileDir, visitor);
    }

}
