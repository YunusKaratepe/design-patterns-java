package behavioral.command;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystem = fileSystemReceiver;
    }
    
    @Override
    public void execute() {
        this.fileSystem.openFile();    
    }
    
}
