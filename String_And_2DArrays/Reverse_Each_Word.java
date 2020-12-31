public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        str+=" ";
        String out="";
        String s = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                
                out+= s+" ";
                s="";
            }
            else{
                s =  str.charAt(i)+ s;
            }
        }
		return out;
	}

}