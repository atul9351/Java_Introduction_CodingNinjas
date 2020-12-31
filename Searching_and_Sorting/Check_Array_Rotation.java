public class Solution {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
        if(arr.length<1){
            return 0;
        }
        int min=Integer.MAX_VALUE;
		int minIndex=Integer.MAX_VALUE;
		for(int  i=0;i<arr.length;i++) {
			if(arr[i] < min) {
			min=arr[i];
			minIndex=i;
			}
		}
		return minIndex;
		

}
}