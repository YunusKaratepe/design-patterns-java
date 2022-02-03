package behavioral.command;


public class Test {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        

        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();


        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();


    }
}
