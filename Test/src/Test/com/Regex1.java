package Test.com;
package Test.com;
import java.util.regex.*;
import java.util.regex.Pattern;
public class Regex1 {
		public static void main(String[] args) {
			String s="ASabcdfghjkJHg";
			Pattern p=Pattern.compile("[6-9]{}");
			Matcher m=p.matcher(s);
			boolean ans=m.matches();
			System.out.println(ans);
		}

	}


