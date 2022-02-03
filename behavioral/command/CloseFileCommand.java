package behavioral.command;

public class CloseFileCommand implements Command {
    
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystem = fileSystemReceiver;
    }
    
    @Override
    public void execute() {
        this.fileSystem.closeFile();    
    }
}
