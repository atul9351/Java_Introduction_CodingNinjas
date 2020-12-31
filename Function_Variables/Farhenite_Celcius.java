public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
        for(int i=start;i<=end;i=i+step){
            System.out.print(i + " " + (5*(i-32))/9);
            System.out.println();
        }
	}
}