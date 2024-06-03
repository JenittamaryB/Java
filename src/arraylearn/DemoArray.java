package arraylearn;
import java.util.Scanner;
public class DemoArray {
		public static void main(String args[]) {
	    DemoArray da=new DemoArray();
	    //int result=da.add();
	   // System.out.println(result);
		String z=da.test();
		System.out.println("welcome:"+z);
	}
	public int add()
	{
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);	
		int a=sc.nextInt();
		int b=sc.nextInt();
		return a+b;//return means take value  to where the  method calling
	}
	public String test()//here why string means to return string
	{
		System.out.println("enter name: ");
		Scanner sc=new Scanner(System.in);
		String e=sc.nextLine();
		System.out.println("enter age: ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("eligible for vote..");
		}
		else
		{
			System.out.println("not eligible..");
		}	
		return e;		
	}

}
