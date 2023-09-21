// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyDate hireDate = new MyDate(2023, 8, 17);

        Faculty faculty = new Faculty("John Doe", "Board Bazar,Gazipur", "01700000000", "doe@gmail.com",
                "Office A", 60000, hireDate, "9 AM - 5 PM", "Professor");

        PartTime partTimeStaff = new PartTime("John Peter", "Board Bazar,Gazipur", "01700000000", "peter@gmail.com",
                "Office B", 15, hireDate, "Assistant");

        partTimeStaff.recordHoursWorked(20);
        double partTimeSalary = partTimeStaff.calculateSalary();

        System.out.println(faculty);
        System.out.println("FullTime Staff Salary: $" + faculty);

        System.out.println(partTimeStaff);
        System.out.println("PartTime Staff Salary: $" + partTimeStaff.calculateSalary());



        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
    }
}