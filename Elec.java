import java.util.Scanner;
public class Elec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total units consumed: ");
        int unitsConsumed = input.nextInt();

        double electricityBill = calculateBill(unitsConsumed);

        System.out.println("Total electricity bill: Rs. " + electricityBill);

        input.close();
    }

    public static double calculateBill(int unitsConsumed) {
        double electricityBill = 0;

        if (unitsConsumed >= 1 && unitsConsumed <= 100) {
            electricityBill = unitsConsumed * 5;
        } else if (unitsConsumed >= 101 && unitsConsumed <= 200) {
            electricityBill = 100 * 5 + (unitsConsumed - 100) * 7;
        } else if (unitsConsumed >= 201 && unitsConsumed <= 300) {
            electricityBill = 100 * 5 + 100 * 7 + (unitsConsumed - 200) * 10;
        } else if (unitsConsumed > 300) {
            electricityBill = 100 * 5 + 100 * 7 + 100 * 10 + (unitsConsumed - 300) * 15;
        } else if (unitsConsumed < 0) {
            System.out.println("Invalid input: Units consumed cannot be negative.");
            System.exit(1);
        }
        return electricityBill;
    }
}
        


