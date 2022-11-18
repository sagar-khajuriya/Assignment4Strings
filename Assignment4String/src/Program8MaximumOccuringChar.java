
public class Program8MaximumOccuringChar {

	public static void main(String[] args) {
		String str1="Hello World Java World";
		String str2="";
		//removing space between the String
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=' ') {
			str2=str2+str1.charAt(i);
			}
		}
		
		int len=str2.length();
		char ch[]=new char[len];
		//converting string to char array
			for(int i=0;i<len;i++) {
				ch[i]=str2.charAt(i);
			}
		//converting all characters in lower case 
			for(int i=0;i<len;i++) {
				if(ch[i]>=65 && ch[i]<=92) {
					ch[i]=(char) (ch[i]+32);
				}
			}
		//counting characters and store the count in integer array
		int ar[]=new int[26];
			for(int i=0;i<len;i++) {
				int index=ch[i]-97;
					ar[index]++;
			}
		int max=ar[0];
		int ind=0;
		//getting the maximum count value from integer array with index
			for(int i=0;i<ar.length;i++) {
				if(max<ar[i]&&ar[i]!=0) {
					max=ar[i];
					ind=i;
				}
		}
		//here we are adding index with char 'a'
		char c=(char)('a'+ind);
		System.out.println(c+" occuring "+max+" times");
		
	}

}
