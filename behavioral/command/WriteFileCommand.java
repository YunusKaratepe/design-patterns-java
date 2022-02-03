package behavioral.command;

public class WriteFileCommand implements Command {
    
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystem = fileSystemReceiver;
    }
    
    @Override
    public void execute() {
        this.fileSystem.writeFile();    
    }
}
