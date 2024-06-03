package arraylearn;

public class MaxMinNumber {
public static void main(String[] args) {
	MaxMinNumber m=new MaxMinNumber();
	m.minSecondMin();
	m.maxSecondMax();
	}
public void maxSecondMax()
{
	int[] arr1 = {4,3,8,9,2,10,5,6};//Sample array
    int max = 0;
    int smax = 0;

    for (int i=0; i<arr1.length-1; i++)//0<4
    {
        if (arr1[i] > max) //5>0
        {
            smax = max;//smax=2
           max = arr1[i];//5
        }
        else if (arr1[i] > smax )//4>5
        {
            smax = arr1[i];//4
        }
    }
    System.out.println("maximum: "+max);
    System.out.println("The second largest element is: " + smax);
}
public void minSecondMin()
{
	int[] arr1 = {4,2,3,6,5,7}; // Sample array

    int min = arr1[0];
    int smin = arr1[0];

    for (int i = 0; i < arr1.length; i++)
    {
        if (arr1[i] < min) 
        {
        	smin = min;
           min = arr1[i];
        }
        else if (arr1[i] < smin ) 
        {
            smin = arr1[i];
        }
    }
    System.out.println("minimum: "+min);
    System.out.println("The second smallest element is: " + smin);
}
}

	