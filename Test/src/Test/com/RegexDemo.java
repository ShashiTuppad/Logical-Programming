package Test.com;
import java.util.regex.*;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String s="avds456698";
		Pattern p=Pattern.compile("[a-z]{4}[0-9]{6}");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
	}

}
