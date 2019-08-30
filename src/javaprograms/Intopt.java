package javaprograms;

import java.util.Scanner;

public class Intopt {

	public static void main(String[] args) {
		 int a,b,c,sum;
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Enter the value of a");
		 a=s.nextInt();
		 
		 System.out.println("Enter the value of b");
		 b=s.nextInt();
		 
		 System.out.println("Enter the value of c");
		 c=s.nextInt();
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
