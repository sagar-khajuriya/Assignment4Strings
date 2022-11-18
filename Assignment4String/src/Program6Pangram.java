
public class Program6Pangram {

	public static void main(String[] args) {
		
		String str1="The Quick Brown Fox Jumps Over The Lazy Dog";
		String str2="";
		
		//To remove space between the strings
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=' ') {
				str2=str2+str1.charAt(i);
			}
		}	
		
		//to convert string either in lower case or in upper case
		//for this we have to convert the string into char array
		int len=str2.length();
		char[] ch=new char[len];
		for(int i=0;i<len;i++) {
			ch[i]=str2.charAt(i);
		}
		for(int i=0;i<len;i++) {
			if(ch[i]>=65 && ch[i]<=92) {
				ch[i]=(char) (ch[i]+32);
			}
		}
//		for(char c:ch) {
//			System.out.print(c);
//		}
		
		boolean flag=false;
		
			int[] ar=new int[26];
			for(int i=0;i<ch.length;i++) {
				int index=ch[i]-97;
					ar[index]++;
			}
			for(int i=0;i<ar.length;i++) {
				if(ar[i]==0) {
					System.out.println("NOT Pangram");
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("String is Pangram");
			}
	}
}
