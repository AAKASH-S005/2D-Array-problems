Java code to print Sum of Even and Odd elements in a 2D Array
Input : r = 3,c = 3
        [1,2,3
         4,5,6
         7,8,9]
Output : Sum of even elements : 20
         Sum of odd elements : 25

CODE :
import java.util.*;
public class SumOfEvenAndOdd{
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
        int OddSum = 0,EvenSum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]%2==0){
                    EvenSum += a[i][j];
                }
                else if(a[i][j]%2==1){
                    OddSum += a[i][j];
                }
            }
        }
        System.out.println("Sum of Odd elements : "+OddSum);
        System.out.println("Sum of Even elements : "+EvenSum);
    }
}
