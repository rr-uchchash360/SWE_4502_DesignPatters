import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PaymentTransaction initialPayment = new PaymentTransaction("Credit Card", 100.0, "Order #123");
        System.out.println("Initial Payment Transaction:");
        System.out.println(initialPayment);

        PaymentTransactionCaretaker caretaker = new PaymentTransactionCaretaker();

        caretaker.saveMemento(initialPayment.createMemento());

        initialPayment = new PaymentTransaction("PayPal", 50.0, "Order #456");
        System.out.println("\nModified Payment Transaction:");
        System.out.println(initialPayment);

        PaymentTransactionMemento restoredMemento = caretaker.restoreMemento();
        if (restoredMemento != null) {
            initialPayment.restore(restoredMemento);
            System.out.println("\nRestored Payment Transaction:");
            System.out.println(initialPayment);
        } else {
            System.out.println("\nNo mementos to restore.");
        }
    }
}