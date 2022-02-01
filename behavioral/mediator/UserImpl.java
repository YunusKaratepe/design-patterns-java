package behavioral.mediator;

public class UserImpl extends User {

    public UserImpl(IChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending=" + msg);
        this.mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received=" + msg);
    }
    
}
