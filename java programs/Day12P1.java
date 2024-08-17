
import java.util.*;

class Electricity {

    private Map<String, Double> accounts = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private int count = 0;

    public void payBill(String sno) {
        System.out.println("Enter the number of units:");
        double units = sc.nextDouble();
        double totamt;

        if (units < 100) {
            System.out.println("Cost of each unit is 3/-");
            totamt = units * 3;
        } else if (units >= 100 && units < 300) {
            System.out.println("Cost of each unit is 4/-");
            totamt = units * 4;
        } else if (units >= 300 && units < 500) {
            System.out.println("Cost of each unit is 5/-");
            totamt = units * 5;
        } else {
            System.out.println("Cost of each unit is 7/-");
            totamt = units * 7;
        }

        System.out.printf("Total bill amount: %.2f\n", totamt);
        accounts.put(sno, totamt);
        count++;
        viewTaxes(sno);
    }

    public void viewHistory(String sno) {
        if (accounts.isEmpty()) {
            System.out.println("You did not perform any transactions till now.");
        } else {
            System.out.println("Your history:");
            int count = 0;
            for (Map.Entry<String, Double> entry : accounts.entrySet()) {
                count++;
                System.out.println("Count: " + count);
                System.out.println("Serial number: " + entry.getKey());
                System.out.println("Total bill amount: " + entry.getValue());
            }
        }
    }

    public void viewTaxes(String sno) {
        double tax = 0;
        double taxable = accounts.get(sno);

        if (taxable <= 1000) {
            System.out.println("You are charged with 5% tax.");
            tax = taxable * 0.05;
        } else if (taxable > 1000 && taxable < 2000) {
            System.out.println("You are charged with 8% tax.");
            tax = taxable * 0.08;
        } else if (taxable >= 2000 && taxable < 3000) {
            System.out.println("You are charged with 10% tax.");
            tax = taxable * 0.10;
        } else {
            System.out.println("You are charged with 15% tax.");
            tax = taxable * 0.15;
        }

        System.out.printf("Tax amount: %.2f\n", tax);
        System.out.printf("Total bill amount along with taxes: %.2f\n", (taxable + tax));
    }

    public void information(String sno) {
        System.out.println("Your serial number is: " + sno);
        System.out.println("Total number of transactions done so far: " + count);

        double totalBillWithTaxes = accounts.values().stream().mapToDouble(billAmount -> {
            double tax;
            if (billAmount <= 1000) {
                tax = billAmount * 0.05;
            } else if (billAmount > 1000 && billAmount < 2000) {
                tax = billAmount * 0.08;
            } else if (billAmount >= 2000 && billAmount < 3000) {
                tax = billAmount * 0.10;
            } else {
                tax = billAmount * 0.15;
            }
            return billAmount + tax;
        }).sum();

        System.out.printf("Total bill amount paid so far (including taxes): %.2f\n", totalBillWithTaxes);
    }

}

public class Day12P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Electricity electricity = new Electricity();

        System.out.println("Welcome to online electricity bill system");
        while (true) {
            System.out.println("Enter your 13-digit serial number:");
            String sno = sc.nextLine();

            if (!sno.matches("\\d{13}")) {
                System.out.println("Invalid serial number. Please try again.");
                continue;
            }

            System.out.println("Welcome dear user");
            System.out.println("-----------------------");

            while (true) {
                System.out.println("1. Pay bill\n2. View history\n3. View taxes\n4. Your information\n5. Exit");
                System.out.print("Choose an option: ");
                int ch = sc.nextInt();

                if (ch == 5) {
                    System.out.println("Thank you for using this system.");
                    return;
                }

                switch (ch) {
                    case 1 ->
                        electricity.payBill(sno);
                    case 2 ->
                        electricity.viewHistory(sno);
                    case 3 ->
                        electricity.viewTaxes(sno);
                    case 4 ->
                        electricity.information(sno);
                    default ->
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        }
    }
}
