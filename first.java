package interviews;

import java.util.Arrays;
import java.util.stream.*;
public class first {
	char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public boolean isPalindrome(String str){
		boolean[] existIn = new boolean[26];
		Arrays.fill(existIn,true);
		for (int x= 0 ; x <str.length(); x++){
			existIn[str.charAt(x)-'a']= !existIn[str.charAt(x)-'a'];
			
		}
		boolean once= false;
		for (int i= 0 ; i < existIn.length; i++){
			if(!existIn[i] && !once ){
				once = true ;
			}
			else if (once && !existIn[i]){
				return false;
			}
		}
		
	return true;
	}
	public static void main (String[] args){
		first fir=  new first();
		String s = "qxytyxq";
		String w = "abbxxxqa";
		System.out.println(fir.isPalindrome(w));
		System.out.println(fir.isPalindrome(s));
		
	}
}
