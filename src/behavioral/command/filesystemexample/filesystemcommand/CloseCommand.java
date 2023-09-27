package behavioral.command.filesystemexample.filesystemcommand;

import behavioral.command.filesystemexample.receiver.FileSystemReceiver;

public class CloseCommand implements FileSystemICommand {

    FileSystemReceiver fileSystemReceiver;
    public CloseCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }
    @Override
    public void execute() {
        fileSystemReceiver.close();
    }
}
