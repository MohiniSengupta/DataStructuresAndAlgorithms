/* Check if String has all unique characters */

package ArraysAndStrings;

public class UniqueCharacterString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean uniq = checkUniqueString("tes");
		System.out.println(" unique ?? + \t" + uniq);
		
	}
	
	/*assuming ascii character set - 128 chars */
	public static boolean checkUniqueString(String str){
		
		if(str.length() > 128)
			return false;
		
		boolean[] charArray = new boolean[128];
		for(int i = 0; i <str.length(); i++){
			int index = str.charAt(i);
			if(charArray[index])
				return false;
			
			charArray[index]= true;
		}
		return true;
	}

}


