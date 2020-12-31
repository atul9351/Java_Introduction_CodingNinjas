public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int i=0,j=0;
		while(i<arr.length) {
			
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
			
		}
    }

}