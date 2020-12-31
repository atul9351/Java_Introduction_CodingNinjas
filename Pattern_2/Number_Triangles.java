import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1;
        int val=1;
        int value=1;
        while(i<=N){
            int spaces=1;
            while(spaces<=N-i){
                System.out.print(" ");
                spaces++;
            }
            int j=1;
            val=i;
            while(j<=i){
                System.out.print(val);
                j++;
                val++;
            }
            value =val-2;
            int k=1;
            while(k<=i-1){
                System.out.print(value);
                k++;
                value--;
            }
        System.out.println();
            i++;
        }
		
		
	}

}