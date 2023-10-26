class PaymentTransactionMemento {
    private String paymentMethod;
    private double amount;
    private String transactionInfo;

    public PaymentTransactionMemento(String paymentMethod, double amount, String transactionInfo) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.transactionInfo = transactionInfo;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionInfo() {
        return transactionInfo;
    }
}
