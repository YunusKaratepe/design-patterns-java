package behavioral.state.stateDesignPattern;

public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("Tv is turned OFF");
    }    
}
