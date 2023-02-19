package Test.com;

public class UpperToLowerLowerToUpper {
	public static void main(String[] args) {
		String s="HelLo";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				ch-=32;
				s1=s1+ch;
			}
			else if(ch>='A'&&ch<='Z') {
				ch+=32;
				s1=s1+ch;
			}
			else {
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}
}
