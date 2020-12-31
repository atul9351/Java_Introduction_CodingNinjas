public class Solution {

	public static void leaders(int[] input) {
		for(int i=0;i<input.length;i++) {
			boolean allSmaller=true;
			for(int j=i+1;j<input.length;j++) {
				if(input[i] < input[j]) {
					allSmaller=false;
					break;
				}
			}
			if(allSmaller) {
				System.out.print(input[i]+" ");
			}
		}
		
	}
	
}