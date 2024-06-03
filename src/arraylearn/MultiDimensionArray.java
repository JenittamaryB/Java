package arraylearn;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray {
		public static void main(String args[]){ 
			MultiDimensionArray m=new MultiDimensionArray ();
			//m.calc();
			//declaring and initializing 2D array  
			int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
			//printing 2D array  
			for(int i=0;i<3;i++)//0<3		                        
				               //1<3
			{  
			 for(int j=0;j<3;j++)//0<3				                 
			 {  
			   System.out.print(arr[i][j]+" ");//1 2 3  
			 }  
			 System.out.println();  
			}  	
	}
		public void calc() {
			int c=0;
			Scanner d=new Scanner(System.in);
			System.out.println("enter number: ");
			int n=d.nextInt();
			int arr[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.println("enter value:");
					arr[i][j]=d.nextInt();					
				}	
			}			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
			    c+=arr[i][j];
				}
		}
			System.out.println("addition is: "+c);
}
}
