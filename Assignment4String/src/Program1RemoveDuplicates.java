
public class Program1RemoveDuplicates {

	public static void main(String[] args) {
		String str="Saagar Khajuriya";
		int len=str.length();
		char ch[]=new char[len];
		//converting String to character array
		for(int i=0;i<len;i++) {
			ch[i]=str.charAt(i);
		}
		//inserting 0 at the repeating characters 
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='0';
				}
			}// printing the array 
			if(ch[i]!='0') {
				System.out.print(ch[i]);
			}
		}
		//Output : Sagr Khjuiy 
		

	}

}
