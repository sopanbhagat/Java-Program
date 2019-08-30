package day2;
import java.util.Scanner;
public class Windchill {

	public static void main(String[] args) {
		double t,v;
		
		Scanner sc=new Scanner(System.in);
		//Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of t(in Fahrenheit)");
		t=sc.nextDouble();
		
		System.out.println("Enter the value of v (in mile per hour)");
		v=sc.nextDouble();
		
		if(t<=50)
		{
			if(v<=120 || v>3)
			{
				double w =35.74+(0.6215*t)+(0.4275*t-35.75)*(Math.pow(v, 0.16));
				System.out.println("Wind chill:"+w);
				
			}
			else
			{
				System.out.println("Wind chill");
			}
		}
		else
		{
			System.out.println("invalid input");
		}
		
		
		
	}

}
