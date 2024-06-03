package arraylearn;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayProgram {
public static void main(String[]args)
	{		
ArrayProgram a=new ArrayProgram();
//a.reverseoder();
//a.linearsearching();
//a.binarySearch();
//a.findDuplicateNumber();
a.findUniqueNumber();
//a.calculate();
//a.calculate1();
//a.addParticularNumber();
//a.sortingArray();
//a.rigthShift();
//a.leftShift();
//a.prime();
//a.missingnum();
	
}
private void findDuplicateNumber()
{
	int[] b= {2,3,4,2,4,6,6,9,9};
	//       0 1 2 3 4 5 6 7 8
	System.out.println("duplicate number is: ");
	for(int i=0;i<b.length-1;i++)//0<8
	{
		for(int j=i+1;j<b.length;j++)//2=3 2=2 2=4
		{
			if(b[i]==b[j])
			{
				System.out.print( b[i]+" ");
			}		
		}
	}
}
private void findUniqueNumber()
{
    int[] b = {2,3,4,2,4,6,6,9};
    boolean Unique;
    System.out.print("Unique numbers are: ");
    for(int i=0;i<b.length;i++)//0<8
    {
    	Unique=true;
           for(int j=0;j<b.length;j++)//0<8
        {
            if(i!=j && b[i]==b[j])//0=0 && 2==3
            {
                Unique=false;
                break;
            }
        }
       if(Unique)
        {
            System.out.print(b[i]+ " ");
        }
    }
}
public void calculate()
{
	int[]add1= {23,45,55,66,76};
	int totalmark=0;
	for(int i=0;i<add1.length;i++)
	{
		totalmark+=add1[i];	
	}
	System.out.println("addtion :"+totalmark);
}


public void calculate1()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	int i=s.nextInt();
	int []arr1=new int[i];
	for(int k=0;k<i;k++)
	{
		arr1[k]=s.nextInt();
	}
	System.out.println(Arrays.toString(arr1));//to write number in array format
	int totalmark=0;
	for(int k=0;k<i;k++)
	{
		totalmark+=arr1[k];//b=b+arr1[k]
	}
	System.out.println("addition of array :"+totalmark);
}


public void addParticularNumber()
{
	int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	int i=s.nextInt();
	int []arr1=new int[i];
	for(int k=0;k<i;k++)
	{
		System.out.println("enter value:");
		arr1[k]=s.nextInt();
	}
	System.out.println(Arrays.toString(arr1));//to write number in array format
	System.out.println("enter particular number:");
	int t=s.nextInt();
	for(int k=0;k<i;k++)
	{
		if(arr1[k]==t)
		{
			count++;
		}
	}
	System.out.println("number of time is: "+count);
		
	}


public void linearsearching() 
{
	String name[]= {"ram","muthu","ravi"};
	//              0       1       2
	String find="muthu";
	for(int k=0;k<name.length;k++)//0<3
	{
		if(find.equals(name[k]))//this to check the find equal to name are not
		{
			System.out.println("yes..."+find);
		}
	}
}


public void binarySearch()
{
	int number[]= {2,4,5,6,7,8,10,20,30};// give in order only
	//             0 1 2 3 4 5 6  7  8 
	int key=20;
	int min=0;
	int max=number.length;
	while(min<=max)//0<=8
	{
		int mid=(min+max)/2;//(0+8)/2 =4 
		if(key==number[mid])//20==4	                
		{
			System.out.println("yes present ..."+key);
			break;
		}
		else if(key<number[mid])
		{
			max=mid-1;
		}
		else if(key>number[mid])
		{
			min=mid+1;
		}
	}
	if(min>max)
	{
		System.out.println("not present..");
	}	
}


public void reverseoder()
{
	int arr[]= {20,40,50,60,70,30};
   //           0  1  2  3  4  5
	System.out.println("orginal order ");
	for(int j=0;j<arr.length;j++)//0<6
	{
		System.out.print(arr[j]+" ");
	}
	System.out.println();
	System.out.println("reverse order");
	for(int i=arr.length-1;i>=0;i--)//6-1=5>=0
	{
		System.out.print(arr[i]+" ");
	}
	
	}
public void sortingArray()
{
	int ar[]= {2,3,4,2,68,44,33,-1,-2};
	System.out.println("orginal Array ");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	for(int i=0;i<ar.length;i++)//0<8
	{
		for(int j=i+1;j<ar.length;j++)//1<8
		{
			if(ar[i]>ar[j])//2<3  2<4  2<2  for descending order
				//if(ar[i]<ar[j]) //for ascending
			{
				int temp=ar[i];//temp=2
				ar[i]=ar[j];
				ar[j]=temp;
			}
	}
	}
	System.out.println();
	System.out.println("sorted  Array desecding order: ");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
public void rigthShift()
{
	String temp;
	String name[]= {"muthu","raman","ravi"};//output:ravi muthu raman
	System.out.println("array: ");
	for(int i=0;i<name.length;i++)//0<3
	{
		System.out.println(i+" " +name[i]);
	}
	for(int i=name.length-1;i>0;i--)
	{
		temp=name[i];
		name[i]=name[i-1];
		name[i-1]=temp;
	}
	
	System.out.println("rigth shift:");
	for(int i=0;i<name.length;i++)
	{
		System.out.print(name[i]+" ");
	}
}
public void leftShift()
{
	String temp;
	String name[]= {"muthu","raman","ravi"};
	System.out.println("array: ");
	for(int i=0;i<name.length;i++)//0<3
	{
		System.out.println(i+" " +name[i]);
	}
	for(int i=0;i<name.length-1;i++)//0<2
		                            //1<2
	{
		temp=name[i];//temp=muthu
		name[i]=name[i+1];//name[i]=raman
		name[i+1]=temp;//name[i+1]=muthu
	}
	
	System.out.println("left shift:");
	for(int j=0;j<name.length;j++)
	{
		System.out.print(name[j]+" ");
	}
}
public void missingnum() 
{
    int arr[] = {1,2,3,4,5,7};  
    int n = arr.length; //array of length = 5
    int sum = (n + 1)*(n + 2) / 2; //(5+1)(5+2)/2 = 21 
    
    for (int i = 0; i < arr.length; i++)
    { 
        sum = sum - arr[i]; //sum = 21 - 1, 20 - 2, 18 - 3, 15 - 4, 11 - 6 = 5
    }
    System.out.println("missing number: " + sum); //missing number is 5
}


public void prime()
{
	int arr[]= {3,2,4,7,9,5};
	int div=2;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%div==0)
		{
			System.out.println("it not prime...");
		}
	else 
	{
		System.out.println("it prime..");
	}
	}
}
}