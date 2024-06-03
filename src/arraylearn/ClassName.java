package arraylearn;

public class ClassName {
	public static void main(String[] args) {
			//declaration and initialization of array  
			int arr[]={4,4,5};  
			//getting the class name of Java array  
			Class c=arr.getClass();  
			String name=c.getName(); 
			int s=c.hashCode();
			//printing the class name of Java array   
			System.out.println(name);
			System.out.println(s);
	}
}
