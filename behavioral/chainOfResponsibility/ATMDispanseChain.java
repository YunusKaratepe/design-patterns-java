package behavioral.chainOfResponsibility;

public class ATMDispanseChain {

    public DispenseChain c1;

    public ATMDispanseChain() {
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispanser();
        DispenseChain c3 = new Dollar10Dispanser();

        // setting the chain of responsibilities
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
}
