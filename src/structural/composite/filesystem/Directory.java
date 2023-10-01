package structural.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private List<FileSystem> directories;
    private String directoryName;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.directories = new ArrayList<>();
    }

    public void add(FileSystem directory){
        directories.add(directory);
    }

    @Override
    public void ls() {
        System.out.println("listing all directory of "+directoryName);
        for (FileSystem directory : directories){
            directory.ls();
        }
    }
}
