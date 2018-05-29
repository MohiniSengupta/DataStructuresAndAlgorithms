/* Check if one string is the permutation of other */
package ArraysAndStrings;

import java.util.Arrays;

public class OneStringPermuteOfOther {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean equal = checkPermutationWithSort("testa","tasta");
		System.out.println("Equal ?? \t" + equal);
		

		boolean same = cheackCharCount("testa","teste");
		System.out.println("Same ?? \t" + same);
		
	}
	
	public static boolean checkPermutationWithSort(String s, String t){
		
		if(s.length() != t.length())
			return false;
		
		char[] sArray = s.toCharArray();
		Arrays.sort(sArray);
		String sString= new String(sArray);
		
		char[] tArray = t.toCharArray();
		Arrays.sort(tArray);
		String tString = new String(tArray);
	
		
		return sString.equals(tString);
		
		
	}
	
	public static boolean cheackCharCount(String s , String t){
		
		if(s.length() != t.length())
			return false;
		
		int[] charCount = new int[128];
		for(int i = 0; i < s.length(); i++){
			charCount[s.charAt(i)]++;
		}
		
		for(int j = 0; j < t.length(); j++){
			int ind = t.charAt(j);
			charCount[ind]--;
			if(charCount[ind] < 0)
				return false;
		}
		
		return true;
	}
	

}
