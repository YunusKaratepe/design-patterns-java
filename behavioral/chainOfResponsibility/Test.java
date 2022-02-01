package behavioral.chainOfResponsibility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ATMDispanseChain atmDispanser = new ATMDispanseChain();

        while(true) {
            
            System.out.println("Enter the amount of dispanse: ");
            try {
                int amount = 0;
                Scanner input = new Scanner(System.in);
                amount = input.nextInt();
                if (amount % 10 != 0) {
                    System.out.println("Amount should be in multiple of 10s.");
                }else {
                    atmDispanser.c1.dispense(new Currency(amount));
                }
            }catch(InputMismatchException e) {
                System.out.println("Currency amount is not valid.");
            }
        }
    }
}
