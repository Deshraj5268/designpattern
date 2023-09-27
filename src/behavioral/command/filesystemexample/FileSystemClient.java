package behavioral.command.filesystemexample;

import behavioral.command.filesystemexample.fileinvoker.FileInvoker;
import behavioral.command.filesystemexample.filesystemcommand.CloseCommand;
import behavioral.command.filesystemexample.filesystemcommand.FileSystemICommand;
import behavioral.command.filesystemexample.filesystemcommand.OpenCommand;
import behavioral.command.filesystemexample.filesystemcommand.WriteCommand;
import behavioral.command.filesystemexample.receiver.FileSystemReceiver;
import behavioral.command.filesystemexample.receiver.UnixFileReceiver;
import behavioral.command.filesystemexample.receiver.WindowsFileReceiver;

public class FileSystemClient {

    public static void main(String[] args) {

        // setting receiver
        FileSystemReceiver windows = getFileReceiverBaseOnSystemType("WINDOWS");

        //command
        FileSystemICommand open = new OpenCommand(windows);
        // invoker
        FileInvoker fileInvokerForOpenCommand = new FileInvoker(open);
        fileInvokerForOpenCommand.execute();

        //write command
        FileSystemICommand write = new WriteCommand(windows);
        FileInvoker fileInvokerForWrite = new FileInvoker(write);
        fileInvokerForWrite.execute();


        //close command
        FileSystemICommand close = new CloseCommand(windows);
        FileInvoker fileInvokerForClose = new FileInvoker(close);
        fileInvokerForClose.execute();




    }

    public static FileSystemReceiver getFileReceiverBaseOnSystemType(String type){ // factory pattern can we used
       FileSystemReceiver fileSystemReceiver = null;
        if("UNIX".equals(type)){
            fileSystemReceiver =  new UnixFileReceiver();
        }else if("WINDOWS".equals(type)){
            fileSystemReceiver = new WindowsFileReceiver();
        }else {
            System.out.println("no appropriate file System defined");
            throw new RuntimeException("no appropriate file System defined");
        }
        return fileSystemReceiver;
    }
}
