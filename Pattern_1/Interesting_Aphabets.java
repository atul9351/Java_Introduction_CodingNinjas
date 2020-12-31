import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        int val=0;
        while(i<=N){
            int j=1;
            val=N-i;
            while(j<=i){
                System.out.print((char)('A'+val));
                j++;
                val++;
            }
            System.out.println();
            i++;
        }

		
	}

}