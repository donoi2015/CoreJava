package lynda.advanced.filesanddirectories;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class FileFinder extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;
    public ArrayList<Path> foundPaths = new ArrayList<>();

    //hold references to found files
    public FileFinder(String pattern) { //pattern = name of the file i'm looking for, or the pattern
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
        //regular exppression = regex; glob is simpler
    }

    @Override
    public FileVisitResult preVisitDirectory(Path aDir,
                                             BasicFileAttributes aAttrs) throws IOException {
        return super.preVisitDirectory(aDir, aAttrs);
    }

    @Override
    public FileVisitResult visitFile(Path aFile, BasicFileAttributes aAttrs)
            throws IOException {
        Path name = aFile.getFileName();
        System.out.println("Examining " + name);
        if (matcher.matches(name)) {
            foundPaths.add(aFile);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path aFile, IOException aExc)
            throws IOException {
        return super.visitFileFailed(aFile, aExc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path aDir, IOException aExc)
            throws IOException {
        return super.postVisitDirectory(aDir, aExc);
    }

}
