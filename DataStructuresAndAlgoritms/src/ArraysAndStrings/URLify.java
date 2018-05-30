/* Replace space with %20. assume string has extra buffer space at the end and you are provided with the true length of the string*/


package ArraysAndStrings;

public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String replacedStr = replaceSpace("I am testing it",15);
		System.out.println("????"+replacedStr);	

	}
	
	public static String replaceSpace(String s, int trueLen){
		char[] str1 = s.toCharArray();
		
			
		int spaceCount = 0;
		for(int i = 0; i < trueLen; i++){
			if(str1[i] == ' ')
				spaceCount++;
		}
	
		int index = trueLen + spaceCount * 2;
		char[] str = new char[index];
		
		for(int j = trueLen - 1; j >= 0; j--){
			if(str1[j] != ' '){
				str[index - 1]=str1[j];
				index--;
			}else{
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3]  = '%';
				index -=3;
			}
			
		}
		
		String newstr = new String(str);
		return newstr;
	}

}
