public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
        for(int i=0;i<input.length;i++) {
			
			for(int k=0;k<(input.length-i);k++) {
				for(int j=0;j<input[i].length;j++) {
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
				
			}
			
		}

	}
}