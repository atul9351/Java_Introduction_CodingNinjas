import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1;
        int val=N;
        while(i<=N){
            int j=1;
            while(j<=N-i+1){
                System.out.print(val);
                j++;
            }
            
        System.out.println();
            i++;
            val=val-1;
        }
		
		
	}

}
