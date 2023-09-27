package behavioral.command.filesystemexample.fileinvoker;

import behavioral.command.filesystemexample.filesystemcommand.FileSystemICommand;

public class FileInvoker {

    FileSystemICommand fileSystemICommand;

    public FileInvoker(FileSystemICommand command){
        this.fileSystemICommand = command;
    }

    public void execute(){
        fileSystemICommand.execute();
    }

}
