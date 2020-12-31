public class Solution {  

    public static void bubbleSort(int[] arr){
    	//Your code goes here
        for(int i=0;i<arr.length-1;i++) {
			boolean swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				return;
			}
		}
    }  

}