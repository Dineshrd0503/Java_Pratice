import java.util.*;
public class Day13P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rowsof the array: ");
        int m = sc.nextInt();
        System.out.print("Enter the column of the array: ");
        int n = sc.nextInt();
        if(m==n){
            System.out.println("rows and columns are same size,cant fomr 2d array");
            sc.close();
            return;
           
        }
        int[][] a = new int[m][n];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("elemets of array are ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        
    
}
sc.close();
}
}