package ArraysAndStrings;

public class CheckOneEditaway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isOneEditAway = chkRepalceOrAddRem("pale","deale");
		System.out.println("isOneEditAway =" + isOneEditAway);
	}
	
	public static boolean chkRepalceOrAddRem(String s1, String s2){
		boolean chk = false;
		if(s1.length() == s2.length())
			chk = checkReplace(s1,s2);
		if(s1.length()+1 == s2.length())
			chk = checkReplace(s1,s2);
		if(s1.length()-1 == s2.length())
			chk = checkaAddRem(s2,s1);
		
		return chk;
	}
	
	public static boolean checkaAddRem(String str1, String str2){
		
		int ind1 = 0;
		int ind2 = 0;
		while(ind1 < str1.length() && ind2 < str2.length()){
			if(str1.charAt(ind1) != str2.charAt(ind2))
			{
				if(ind1 == ind2)
					ind2++;
				else 
					return false;
			}
			else{
				ind1++;
				ind2++;
			}
		}
		
		return true;
	}
	
	public static boolean checkReplace(String s1, String s2){
		boolean markDiff =  false;
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) != s2.charAt(i))
			{
				if(markDiff)
					return false;
				markDiff =true;
			}
		}
		return true;
	}

}
