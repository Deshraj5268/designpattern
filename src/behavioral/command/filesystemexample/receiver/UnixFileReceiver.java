package behavioral.command.filesystemexample.receiver;

public class UnixFileReceiver implements FileSystemReceiver {
    @Override
    public void open() {
        System.out.println("opening Unix system file");
    }

    @Override
    public void write() {
        System.out.println("writing into Unix system file");
    }

    @Override
    public void close() {
        System.out.println("closing Unix system file");
    }
}
