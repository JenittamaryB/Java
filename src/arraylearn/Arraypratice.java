package arraylearn;

import java.util.Arrays;

public class Arraypratice {
	private void printArray()
		{
			int[] number=new int[6];
			number[0]=80;
			number[1]=75;
			number[2]=85;
			number[3]=90;
			number[4]=80;
			number[5]=80;
	
			for(int i:number)//for each condition to print array
				
			//for(int i=0;i<number.length-1;i+=2) //this loop for print one number  after another number
		//for(int i=number.length-1;i>=0;i--)//this loop for print reverse the number
			{
				//System.out.println(number[i]);//this for loop
				System.out.println(i);//this for print for each
			}
		}	
		
		public static void main(String[] args) {
			Arraypratice da=new Arraypratice();
			da.printArray();
	}
}
