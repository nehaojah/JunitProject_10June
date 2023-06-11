package junits;



public class StringFunction {
	
	 public static boolean isPalindrome(String name) {
	        int len = name.length();
	        boolean isPalindrome = true;

	        for (int i = 0; i < len / 2; i++) {
	            if (name.charAt(i) != name.charAt(len - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	            return true;
	        } else {
	            System.out.println("The string is not a palindrome.");
	            return false;
	        }
	    }
	 
	 
	 
	 public static boolean ispallindrom(String str) {
			String reversestring="";
			for(int i=str.length()-1;i>=0;i--) {
			reversestring=reversestring+str.charAt(i);
			}
			if(reversestring.equalsIgnoreCase(str)) {
				System.out.println("given String is pallindrome");
		        return true;
			}else {
				System.out.println("given String is not a pallindrome");
				return false;
			}
	 }
}
