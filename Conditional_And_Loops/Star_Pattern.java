import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int i =1;
        int k=0;
        while(i<=N){
        	int spaces=1;
        	while(spaces<=N-i) {
        		System.out.print(" ");
        		spaces=spaces+1;
        		}
            int j=1;
            while(j<=i+k){
                System.out.print("*");
                j = j + 1;
            }

            k=k+1;
            System.out.println();
            i = i + 1;
        }

		
	}

}
