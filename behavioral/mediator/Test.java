package behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        IChatMediator mediator = new ChatMediator();

        User user1 = new UserImpl(mediator, "Yunus");
        User user2 = new UserImpl(mediator, "Ahmet");
        User user3 = new UserImpl(mediator, "Zeynep");
        User user4 = new UserImpl(mediator, "Recep");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Selamlar");
        user2.send("Selam Yunus.");
    }
}
