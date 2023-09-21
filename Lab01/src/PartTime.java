class PartTime extends Staff {
    private double hourlyPay;
    private double hoursWorked;

    public PartTime(String name, String address, String phoneNumber, String emailAddress,
                    String office, double hourlyPay, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, 0, dateHired, title);
        this.hourlyPay = hourlyPay;
        this.hoursWorked = 0;
    }

    public void recordHoursWorked(double hours) {
        hoursWorked += hours;
    }

    @Override
    public String toString() {
        return "PartTime Staff: " + super.toString();
    }

    public double calculateSalary() {
        return hourlyPay * hoursWorked;
    }
}