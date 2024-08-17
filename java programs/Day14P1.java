import java.util.*;
class matrixopeartions{
    public void print(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

}
    public void addition(int[][] a,int[][] b){
        int[][] c=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        print(c);
}
    public void subtraction(int[][] a,int[][] b){
        int[][] c=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        print(c);
    }
}

public class Day14P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and colums of martx1");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter rows and colums of martx2");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        if(!(m==m1&&n==n1)){
            System.out.println("Opeartions are only performed for equl rows and columns");
            System.out.println("exiting the program");
            sc.close();
            return;

        }
        int[][] a=new int[m][n];
        int[][] b=new int[m1][n1];
        matrixopeartions o=new matrixopeartions();
        System.out.println("Enter elements of martx1");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of martx2");
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing the elments of matrix 1");
        o.print(a);
        System.out.println("printing the elments of matrix 2");
        o.print(b);
        System.out.println("sum of elemnets is");
        o.addition(a,b);
        System.out.println("differrenc of elements is");
        o.subtraction(a,b);

        
        sc.close();
    }
    
    
    }
