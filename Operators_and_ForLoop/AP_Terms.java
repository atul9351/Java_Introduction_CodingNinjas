import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        int counter =x;
        while(counter>0){
            for(int i=1;i<=x;i++){
                y=3*i+2;
                if(y%4==0){
                    x++;
                    continue;
            }
            else{
                System.out.print(y+ " ");
                counter--;
            }
            }
            
        }
	}
}