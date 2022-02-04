package behavioral.state.stateDesignPattern;

public class Test {
    public static void main(String[] args) {
        TVContext context = new TVContext();

        State tvStartState = new TvStartState();
        State tvStopState = new TVStopState();

        context.setTvState(tvStartState);
        context.doAction();

        context.setTvState(tvStopState);
        context.doAction();
    }
}
