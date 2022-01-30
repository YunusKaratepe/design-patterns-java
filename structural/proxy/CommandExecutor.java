package structural.proxy;

import java.io.IOException;

public class CommandExecutor implements ICommandExecutor{

    @Override
    public void runCommand(String cmd) throws IOException {
        // some heavy implementation. 
        Runtime.getRuntime().exec("cmd.exe /c" + cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

    
}