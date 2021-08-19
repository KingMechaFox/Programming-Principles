package csci1302.intro;

import java.util.Scanner;

public class SimpleMath {
	public static void main(String[] arg)
{
int a,b;
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
}
while(a--!=0)
{
b++;
}
System.out.println("Addition of two numbers is : "+b);
}
}
