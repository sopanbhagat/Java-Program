package javaprograms;

import java.util.Scanner;

public class Doubleopt {

	public static void main(String[] args) {
		
		Double a,b,c,sum;
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the value of a");
		 a=s.nextDouble();
		 
		 System.out.println("Enter the value of b");
		 b=s.nextDouble();
		 
		 System.out.println("Enter the value of c");
		 c=s.nextDouble();
		 sum=a+b*c;
		 System.out.println("a+b*c:"+sum);
		 
		 sum=a*b+c;
		 System.out.println("a*b+c:"+sum);
		 
		 sum=c+a/b;
		 System.out.println("c+a/b:"+sum);
		 
		 sum=a%b+c;
		 System.out.println("a%b+c:"+sum);
	}

}
