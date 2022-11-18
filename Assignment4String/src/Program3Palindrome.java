
public class Program3Palindrome {

	public static void main(String[] args) {
		String str1="2552";
		String str2="";
		//storing the str1 in str2 in reverse order
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}//here checking content of string is matching or not
		if(str1.equals(str2)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is NOT Palindrome");
		}

	}

}
