import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        double avg = (m1+m2+m3)/3;
        int n = (int) avg;
        System.out.println(str);
        System.out.println(n);
	}

}
