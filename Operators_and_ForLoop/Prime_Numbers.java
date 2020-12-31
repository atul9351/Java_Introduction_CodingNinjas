import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
      //define limit
        int limit = N;

//        System.out.println("Prime numbers between 1 and " + limit);

        //loop through the numbers one by one
        for(int i=2; i <= N; i++){

                boolean isPrime = true;

                //check to see if the number is prime
                for(int j=2; j <i ; j++){

                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.println(i);
        }
			
      	
	}
}