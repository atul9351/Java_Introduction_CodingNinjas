public class Solution {

	public static String removeAllOccurrencesOfChar(String str,char c) {
		
		String x="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				x+=str.charAt(i);
			}
		}
		return x;
	}

}