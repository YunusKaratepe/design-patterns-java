package structural.proxy;

public class CommandExecutorProxy implements ICommandExecutor{

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {
        if("yunus-pc".equals(user) && "yunuspw".equals(password)) isAdmin = true;
        else isAdmin = false;
        executor = new CommandExecutor();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (this.isAdmin) {
            executor.runCommand(cmd);
        }
        else {
            if (cmd.trim().startsWith("rm"))
                throw new Exception("rm command is not allowed for non-admin users.");
            else executor.runCommand(cmd);
        }
        
    }
    
}
