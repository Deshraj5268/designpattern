package behavioral.command.filesystemexample.filesystemcommand;

import behavioral.command.filesystemexample.receiver.FileSystemReceiver;

public class WriteCommand implements FileSystemICommand {

    FileSystemReceiver fileSystemReceiver;
    public WriteCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;
    }
    @Override
    public void execute() {
        fileSystemReceiver.write();
    }
}
