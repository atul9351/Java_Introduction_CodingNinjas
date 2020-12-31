import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1;
        int val=1;
        while(i<=N){
            int j=1;
            val=i;
            while(j<=i){
                System.out.print(val);
                j++;
                val--;
            }
            System.out.println();
            i++;
        }

		
	}

}
