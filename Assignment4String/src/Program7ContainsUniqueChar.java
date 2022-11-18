
public class Program7ContainsUniqueChar {

	public static void main(String[] args) {
		String str1="ineuro";
		boolean flag=false;
		int len=str1.length();
		char[] ch=new char[len];
		//converting string into char array
		for(int i=0;i<len;i++) {
			ch[i]=str1.charAt(i);
		}
		//inserting 0 at the repeating characters
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='0';
				}
			}
		}
		//checking the array if it contains 0 it means it contains duplicates 
		//and if not it means String contains all unique characters
		for(int i=0;i<len;i++) {
			if(ch[i]=='0') {
				System.out.println("String does not contain unique character");
				flag=true;
				break;
			}	
		}
		
		if(flag==false) {
			System.out.println("String contains UNIQUE character");
		}
		
	}

}
