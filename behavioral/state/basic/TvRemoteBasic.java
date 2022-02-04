package behavioral.state.basic;

public class TvRemoteBasic {

    private String state = "";
    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if(state.equalsIgnoreCase("ON")) {
            System.out.println("Tv is turned ON");
        }else {
            System.out.println("Tv is turned OFF");
        }
    }

    public static void main(String[] args) {
        TvRemoteBasic remote = new TvRemoteBasic();

        remote.setState("ON");
        remote.doAction();
        
        remote.setState("OFF");
        remote.doAction();

    }

    /*
    Notice that client code should know the specific values to 
    use for setting the state of remote. Further more if number 
    of states increase then the tight coupling between implementation 
    and the client code will be very hard to maintain and extend.
    */
}
