import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumEven=0;
        int sumOdd=0;
        int x=0;
        while(N!=0){
           x =N%10;
            if(x%2==0){
                sumEven=sumEven+x;
            }
            else{
                sumOdd = sumOdd + x;
            }
            N=N/10;
            x=0;
        }
        System.out.print(sumEven + " " + sumOdd);
		

	}
}
