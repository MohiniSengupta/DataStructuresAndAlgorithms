/* Compress string with repeated character count. If the orih=ginal string was shorter, return original */

package ArraysAndStrings;

public class CompessedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String compressedString = compress("abbbbcccccddddd");
		System.out.println("Compressed String = " + compressedString );

	}
	
	public static String compress(String str){
		 
		int count = 0;
		StringBuilder compStr = new StringBuilder();
		for(int i = 0; i < str.length(); i ++){
			count++;
			if(i+1>= str.length() || str.charAt(i) != str.charAt(i+1)){
				compStr.append(str.charAt(i));
				compStr.append(count);
				count = 0;
			}
			
		}
		
		
		return compStr.length() < str.length()? compStr.toString():str;
	}

}
