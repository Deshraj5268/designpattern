package behavioral.command.filesystemexample.filesystemcommand;

import behavioral.command.filesystemexample.receiver.FileSystemReceiver;

public class OpenCommand implements FileSystemICommand {

    FileSystemReceiver fileSystemReceiver;
    public OpenCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }
    @Override
    public void execute() {
        fileSystemReceiver.open();
    }
}
