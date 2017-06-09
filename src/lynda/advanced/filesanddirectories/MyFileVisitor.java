package lynda.advanced.filesanddirectories;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path aDir,
                                             BasicFileAttributes aAttrs) throws IOException {
        System.out.println("About to visit: " + aDir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path aFile, BasicFileAttributes aAttrs)
            throws IOException {
        if (aAttrs.isRegularFile()) {
            System.out.println("Regular file: ");
        }
        System.out.println(aFile);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path aFile, IOException aExc)
            throws IOException {
        System.err.println(aExc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path aDir, IOException aExc)
            throws IOException {
        System.out.println("Just visited: " + aDir);
        return FileVisitResult.CONTINUE;
    }

}
