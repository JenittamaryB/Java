package arraylearn;

public class EquilibriumIndex//sum of number to left index is equal to sum of numbers to right index 
{                               
	public static void main(String[] args) {
		EquilibriumIndex e =new EquilibriumIndex ();
		e.equilibrium();
	}
public void equilibrium()
{
	int[] arr = {-7, 1, 5, 2, -4, 3, 0};
    int totalSum = 0;
    int leftSum = 0;
    for (int num : arr) 
    {
        totalSum =totalSum+num;//0-7 -7+1 -6+5  -1+2  1+-4 -3+3 =0
    }
    for (int i = 0; i < arr.length; i++) 
    {
        totalSum -= arr[i];//0-(-7)  7-1  6-5  1-2=-1
        if (leftSum == totalSum)//arr[0]+arr[1]+arr[2]=arr[4]+arr[5]+arr[6]
        {
            System.out.println("Equilibrium index: " + i);
            break;
        }
        leftSum += arr[i];//0+-7 -7+1  -6+5 -1+2=1 
    }
}
}
