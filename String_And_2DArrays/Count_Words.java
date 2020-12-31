public class Solution {

	public static int countWords(String str) {	
		//Your code goes here
        if(str.length() ==0){
            return 0;
        }
        int noOfWords = 1;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == ' ')
				noOfWords++;
		}
		return noOfWords;
	}

}