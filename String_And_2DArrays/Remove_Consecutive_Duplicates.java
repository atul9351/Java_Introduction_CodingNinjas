public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String x="";
		x=x+str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=x.charAt(x.length()-1)) {
				x=x+str.charAt(i);
			}
		}
		return x;
	}

}