package Test.com;

public class StringAlpaNumericSC {
public static void main(String[] args) {
	String s="HELLo hi123@hi65%%";
	int n=0,a=0,sc=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
			a++;
		}
		else if(ch>='0'&&ch<='9') {
			n++;
		}
		else {
			sc++;
		}
	}
	System.out.println("alpha: "+a);
	System.out.println("numerics: "+n);
	System.out.println("special char: "+sc);
}
}
