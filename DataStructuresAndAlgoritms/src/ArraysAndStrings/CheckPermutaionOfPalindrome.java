/* Check if given string is permutaion of a palindrome */

package ArraysAndStrings;

public class CheckPermutaionOfPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPerm = isPermOfPalindrom("tact coa");
		System.out.println("Is Permutation Of Palindrome = " + isPerm);

	}
	
	public static boolean isPermOfPalindrom(String str){
	
		str = str.toLowerCase();
		int[] count = new int[26];
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i ++){
			if(Character.isLetter(charArray[i])){
				int ind = charArray[i];
				System.out.println("******"+ind);
				count[charArray[i]-97]++;
			}
		}
		
		boolean onlyOdd = false;
		for(int j = 0; j < count.length; j++){
			System.out.print(count[j]);
			if(count[j] % 2 == 1){
				if(onlyOdd)
					return false;
				onlyOdd = true;
			}
			
			
		}
		
		
		return true;
	}

}
