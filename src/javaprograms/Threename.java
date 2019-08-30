package javaprograms;

import java.util.Scanner;

public class Threename
{ 
	public static void main(String args[])
	{
	 String name1;
	 String name2;
	 String name3;
	 
	 Scanner S=new Scanner(System.in);
	 System.out.println("Enter first name : ");
     name1=S.nextLine();
     
	 System.out.println("Enter seceond name ");
	 name2=S.nextLine();
	 
	 System.out.println("Enter third name : ");
	 name3=S.nextLine();
	 
	 System.out.println("hi "+name3+"," +name2+","+ name1 );
	 
	
	}
}