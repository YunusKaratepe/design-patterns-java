package behavioral.mediator;

public interface IChatMediator {
    
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}
