public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int left=0,right=n-1,counter=1;
		while(left<=right) {
			if(counter%2==1) {
				arr[left++]=counter;
                counter++;
			}else {
				arr[right--]=counter;
                counter++;
			}
			
		}
    }
}