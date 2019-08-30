package day2;
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		 double temp,f,c;
		 int n;
		 
		 
		 System.out.print("Enter the temp in fahrenheit");
		 temp=sc.nextDouble();
		 System.out.println("Enter the choice");
		 System.out.println("1.celsius to fahrenheit");
		 System.out.println("2. fahrenheit to celsius");
		 n=sc.nextInt();
		 switch(n)
		 {
		 case 1:
			 f=(temp*9/5)+32;
			 System.out.println(f);
			 break;
			 
		 case 2:
			 c=(temp-32)*5/9;
			 System.out.println(c);
			 break;
			 
		 
			 
		 }
		 
		 
		
	}

}
