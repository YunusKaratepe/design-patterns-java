package structural.proxy;

public class Main {
    public static void main(String[] args) {

        String cmd = "echo selam";

        ICommandExecutor executor = new CommandExecutorProxy("yunus-pc", "yunuspw");
        try {
            executor.runCommand(cmd);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
