package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {
	
	public static void main(String[] args) {
		
		//Variables & Printing:
		int num = 5;
		String s = "RahulShettyAcademy";
		char letter = 'r';
		double dec = 5.99;
		Boolean b = true;
		
		System.out.println(num);
		System.out.print(s);
		System.out.print(" " + b + "\n");
		
		//Arrays:
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//Loops:
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//For each loop:
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		//Conditional Statements:
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};
		
		for(int i : arr3)
		{
			if(i % 2 == 0)
				System.out.println(i);
			else
				System.out.println("Skip.");
		}
		
		//Array lists:
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Test");
		a.remove(2);
		a.get(1);
		
		for(String str : a) //or a.size() if using regular for loop
		{
			System.out.println(str);
		}
		
		//Contains is a boolean to check whether an item exists in an array list
		System.out.println(a.contains("Academy"));
		System.out.println(a.contains("Shetty"));
		
		//Converting an array to a list:
		Integer[] arr4 = {1, 2, 3, 4, 5};
		List<Integer> a2 = Arrays.asList(arr4);
		System.out.println(a2.contains(3));
		
		//Strings:
		
		//String is an object that represents a sequence of characters
		
		//No matter how many you make, Java will only have one back end object get created
		//if the values are the same when creating a literal
		String s1 = "test";
		String s2 = "test";
		
		//Allocating memory with the new keyword creates objects
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		String s5 = "Rahul Shetty Academy";
		String[] splitString = s5.split(" ");
		//Array will split based on white space, this breaks the string into 3 values.
		
		String[] splitString2 = s5.split("Shetty");
		splitString2[1].trim(); //gets rid of white space on the sides of the string " Academy" -> "Academy".
		s1.length(); //Gives length of a string.
		s1.charAt(0); //Gives character present a an index.
		
		//Print string in reverse order
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.println(s1.charAt(i));
		}
		
		CoreJavaBrushUp1 c = new CoreJavaBrushUp1();
		String name = c.getData();
		System.out.println(name);
		
		MethodsDemo m = new MethodsDemo();
		String name2 = m.getUserData();
		System.out.println(name2);
		
		String name3 = staticData();
		System.out.println(name3);
	}
	
	//Methods:
	public String getData()
	{
		System.out.println("Hello World!");
		return "rahul shetty";
	}
	
	public static String staticData()
	{
		System.out.println("Hello World 2!");
		return "John Doe";
	}

}
