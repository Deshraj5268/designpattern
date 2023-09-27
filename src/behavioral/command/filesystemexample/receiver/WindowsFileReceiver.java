package behavioral.command.filesystemexample.receiver;

public class WindowsFileReceiver implements FileSystemReceiver {
    @Override
    public void open() {
        System.out.println("opening Windows system file");
    }

    @Override
    public void write() {
        System.out.println("writing into Windows system file");
    }

    @Override
    public void close() {
        System.out.println("closing Windows system file");
    }
}
