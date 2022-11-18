
public class Program5Anagram {

	public static void main(String[] args) {
		String str1="race";
		String str2="care";
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1==len2) {	
		char[] ch1=new char[len1];
		char[] ch2=new char[len2];
			//converting String to character array
			for(int i=0;i<len1;i++) {
				ch1[i]=str1.charAt(i);
				ch2[i]=str2.charAt(i);
			}
			//sorting the char array (ch1[]) using Bubble Sort Technique
			for(int i=0;i<len1;i++) {
				for(int j=1;j<len1;j++) {
					if(ch1[j]<ch1[j-1]) {
							char temp=ch1[j];
								 ch1[j]=ch1[j-1];
								 ch1[j-1]=temp;
					}
				}
			}
			//sorting the char array (ch2[]) using Selection Sort Technique
			for(int i=0;i<len1;i++) {
				 	int min=i;
				for(int j=i+1;j<len1;j++) {
					if(ch2[j]<ch2[min]) {
						min=j;
					}
				}
			char temp=ch2[i];
				 ch2[i]=ch2[min];
				 ch2[min]=temp;
			}
			//converting char array to String
			String strr=new String(ch1);
			String stri=new String(ch2);
				if(strr.equals(stri)) {
					System.out.println("String is Anagram");
				}else {
					System.out.println("String is NOT Anagram");
				}
		
		}else {
			System.out.println("String is NOT Anagram");
		}
	}

}
