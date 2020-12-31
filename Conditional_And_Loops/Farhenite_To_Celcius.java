import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S =sc.nextInt();
        int E =sc.nextInt();
        int W =sc.nextInt();
        int i =S;
        int C=0;
        while(i<=E){
            C = (int)((5*(i-32))/9);
            System.out.println(i + "\t" + C);
            // System.out.println(C);
            i=i+W;
        }
		
				
	}

}

