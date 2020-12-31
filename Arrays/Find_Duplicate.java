public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
        
    }
}