import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = sc.next().charAt(0);
        double T=0;
        int total =0;
        
        if(ch =='A'){
            T = (N*1.0 + (20.0*N)/100 + (50.0*N)/100 + 1700.0 - (11.0*N)/100);
        }
        else if(ch == 'B'){
           T = (N + (20.0*N)/100 + (50.0*N)/100 + 1500.0 - (11.0*N)/100);
        }
        else{
           T = (N*1.0 + (20.0*N)/100 + (50.0*N)/100 + 1300.0 - (11.0*N)/100);
        }
        System.out.println(Math.round(T));

	}
}
