public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        if(arr.length<=1){
            return Integer.MIN_VALUE;
        }
        int max=arr[0];
		int secondLargest=Integer.MIN_VALUE;
        
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i] ) {
				secondLargest=max;
				max=arr[i];
			}
			else if(arr[i] <max && arr[i] >secondLargest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;     
    }

}