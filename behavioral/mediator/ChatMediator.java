package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            
            // message should not be received by the user whos sending.
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
    
}
