import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1;
        while(i<=N){
            int j=1;
            int vals=N;
            while(j<=N){
                if(j==(N-i+1)){
                    System.out.print("*");
                    vals--;
                    j++;
                }
                else{
                   System.out.print(vals);
                   vals--;
                   j++; 
                }
                
            }
            System.out.println();
            i++;
        }

	}
}