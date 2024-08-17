import java.util.InputMismatchException;
import java.util.Scanner;

public class Day12P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Press 1 to continue or 0 to exit:");
                int choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting the program.");
                    break;
                } else if (choice != 1) {
                    System.out.println("Invalid choice. Please enter 1 to continue or 0 to exit.");
                    continue;
                }

                System.out.println("Enter the size of the array:");
                int n = sc.nextInt();

                if (n <= 0 || n > 1000) {
                    System.out.println("Invalid size. The size must be between 1 and 1000.");
                    continue;
                }

                int[] arr = new int[n];
                System.out.println("Enter " + n + " array elements (each between 1 and 1000):");

                for (int i = 0; i < n; i++) {
                    while (true) {
                        try {
                            arr[i] = sc.nextInt();

                            if (arr[i] <= 0 || arr[i] > 1000) {
                                System.out.println("Invalid value. Enter a value between 1 and 1000:");
                            } else {
                                break; // valid input, break the inner loop
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter an integer value:");
                            sc.next(); // discard the invalid input
                        }
                    }
                }

                // Check for duplicates
                boolean hasDuplicates = false;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            System.out.println(arr[i] + " is a duplicate.");
                            hasDuplicates = true;
                            break; // no need to check further for this element
                        }
                    }
                }

                if (!hasDuplicates) {
                    System.out.println("There are no duplicate elements in the array.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer values.");
                sc.next(); // discard the invalid input
            }
        }
        sc.close();
    }
}
