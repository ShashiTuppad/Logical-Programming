package Arrays;

import java.util.Scanner;public class Demo {public static void main(String[] args)
{Scanner ip=new Scanner(System.in);
while(true) {int a=ip.nextInt();int b=ip.nextInt();
int c=ip.nextInt();if(a>b&&a>c) {System.out.println(a);}
else if(b>c) {System.out.println(b);}else {System.out.println(c);}}}}
