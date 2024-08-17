
import java.util.*;

public class Day15P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columsn of matrix1");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the rows and columsn of matrix2");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        if (m1 != n1) {
            System.out.println("colums of matrix1 is not equal to rows of matrix2");
            System.out.println("cant perform multipcation of matrices");
            sc.close();
            return;
        }
        int[][] a = new int[m][n];
        int[][] b = new int[m1][n1];
        System.out.println("enter elments of matrix 1:");
        a = inputmatrix(a);
        System.out.println("dipalying matrix 1");
        printmatrix(a);
        System.out.println("enter elments of matrix 2:");
        b = inputmatrix(b);
        System.out.println("dipalying matrix 2");
        printmatrix(b);
        int[][] multiplied_matrix = multiplymatrix(a, b);
        System.out.println("The multiplied matrix is:");
        printmatrix(multiplied_matrix);
        System.out.println("The transpose matrix is:");
        int[][] transpose_matrix = transposematrix(multiplied_matrix);
        printmatrix(transpose_matrix);
        sc.close();

    }

    public static int[][] multiplymatrix(int[][] a, int[][] b) {
        int c[][] = new int[a[0].length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;

    }

    public static void printmatrix(int[][] a) {
        for (int[] a1 : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a1[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposematrix(int[][] a) {
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;

    }

    public static int[][] inputmatrix(int[][] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        return a;

    }
}
