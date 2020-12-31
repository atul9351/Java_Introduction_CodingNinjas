public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int[] temp=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<arr.length;i++) {
			arr[i-d]=arr[i];
		}
		int k=0;
		for(int i=arr.length-d;i<arr.length;i++) {
			arr[i]=temp[k++];
		}
    }

}