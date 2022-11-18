
public class Program2PrintDuplicatChar {

	public static void main(String[] args) {
		String str="saagar khajuriya";
		int len=str.length();
		char ch[]=new char[len];
		System.out.println(str);
		//converting String to character array
		for(int i=0;i<len;i++) {
			ch[i]=str.charAt(i);
		}
		//inserting 0 at the repeating characters and increasing the count value
		for(int i=0;i<len;i++) {
			int count=1;
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='0';
					count++;
				}
			}
			if(count>1 && ch[i]!='0') {
				System.out.print(ch[i]);
			}
		}

	}

}
