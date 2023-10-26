import java.util.ArrayList;
import java.util.List;

class PaymentTransaction {
    private String paymentMethod;
    private double amount;
    private String transactionInfo;

    public PaymentTransaction(String paymentMethod, double amount, String transactionInfo) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.transactionInfo = transactionInfo;
    }

    public PaymentTransactionMemento createMemento() {
        return new PaymentTransactionMemento(paymentMethod, amount, transactionInfo);
    }

    public void restore(PaymentTransactionMemento memento) {
        this.paymentMethod = memento.getPaymentMethod();
        this.amount = memento.getAmount();
        this.transactionInfo = memento.getTransactionInfo();
    }

    @Override
    public String toString() {
        return "Payment Method: " + paymentMethod + ", Amount: $" + amount + ", Transaction Info: " + transactionInfo;
    }
}