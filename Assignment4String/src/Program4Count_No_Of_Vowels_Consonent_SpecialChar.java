
public class Program4Count_No_Of_Vowels_Consonent_SpecialChar {

	public static void main(String[] args) {
		
	    String str="sagarkhajuriya@gmail.com";
	    int len=str.length();
	    char[] ch=new char[len];
	    int count1=0;
	    int count2=0;
	    int consonent=0;
	    
	    for(int i=0;i<len;i++){
	        ch[i]=str.charAt(i);
	        
	        //for Vowels
	        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||
	           ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
	             count1++;
	         }
	         //for Special Characters
	         if(ch[i]>=33 && ch[i]<=64){
	             count2++;
	         }
	        
	    }
	    
	     //for consonant
	        consonent=len-(count1+count2);
	        System.out.println("Total no of Vowels is : "+count1);
	        System.out.println("Total no of Consonent is : "+consonent);
	        System.out.println("Total no of Special character is : "+count2);


	}

}
