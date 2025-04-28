Java code to check whether a Matrix is a Uniformity matrix or Not -> (All elements of a matrix is either Even or Odd)
Input : n=3
       [1,1,1
        1,1,1
        1,1,1]
Output : Uniformity Matrix

CODE :
import java.util.*;
public class CheckUniformityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int a = 0,b = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2==0){
                    a++;
                }
                else if(matrix[i][j]%2 == 1){
                    b++;
                }
                else{
                    break;
                }
            }
        }
        if(a==(n*n)){
            System.out.print("Uniformity Matrix");
        }
        else if(b==(n*n)){
            System.out.print("Uniformity Matrix");
        }
        else{
            System.out.print("Not an Uniformity Matrix");
        }
    }
}

     
