package arraylearn;

public class EvenOddArray {

	public static void main(String[] args) {
		EvenOddArray e=new EvenOddArray();
		e.oddEvenAverage();
	}
public void oddEvenAverage()
{
	        int[] arr = {5, 10, 3, 8, 15};
	        double evenSum = 0;
	        double  oddSum = 0;
	        int evenCount = 0;
	        int oddCount = 0;
	        for (int num : arr)// num : 5 10 3 8 15
	        {
	            if (num % 2 == 0) 
	            {
	                evenSum = evenSum+num;//0+10 10+8=18
	                evenCount++;//2
	            } 
	            else 
	            {
	                oddSum += num;//0+5 5+3 8+15=23
	                oddCount++;
	            }
	        }
	        System.out.println("even number count :"+evenCount);//2
	        System.out.println("odd number count :"+oddCount);//3

	        double evenAverage = evenSum / evenCount;//18/2
	        double oddAverage = oddSum / oddCount;//23/3

	        System.out.println("Average of even numbers: " + evenAverage);
	        System.out.println("Average of odd numbers: " + oddAverage);
	}
}

