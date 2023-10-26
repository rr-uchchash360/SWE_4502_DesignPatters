import java.util.ArrayList;
import java.util.List;

class PaymentTransactionCaretaker {
    private List<PaymentTransactionMemento> mementos = new ArrayList<>();

    public void saveMemento(PaymentTransactionMemento memento) {
        mementos.add(memento);
    }

    public PaymentTransactionMemento restoreMemento() {
        if (!mementos.isEmpty()) {
            return mementos.remove(mementos.size() - 1);
        }
        return null;
    }
}