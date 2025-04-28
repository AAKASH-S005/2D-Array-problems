Java code to print the Zig-Zag sum in 2D Array
Input : r = 3 , c = 3
       [1,2,3
        4,5,6
        7,8,9]
Output : Zig-Zag sum is : 35

CODE :
import java.util.*;
public class ZigZagSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        if(r==c){
            int sum = 0;
            for(int j=0;j<c;j++){
                sum += a[0][j];
            }
            for(int i=1;i<r-1;i++){
                sum += a[i][i];
            }
            for(int j=0;j<c;j++){
                sum += a[r-1][j];
            }
            System.out.print("Zig-Zag sum is : "+sum);
        }
        else{
            System.out.print("Zig-Zag sum only possible in Square matrix");
        }
    }
}
