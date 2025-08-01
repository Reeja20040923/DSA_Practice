package ArraySorting;


import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		int a[] = {1,9,3,8,5,7,7,4};
		System.out.println("before sorting");
		for(int value:a)
		{
			System.out.println(value);     //Syso(Arrays.toString(a));
		}
		//to sort:Arrays.sort()
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		String b[] = {"apple","jackfruit","zebra","banana","hi","mango"};
		System.out.println("before sorting:" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting :" + Arrays.toString(b));
		
		
		//printing elements in reverse order
		int c[] = {100,200,300,400,500};
		
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
		
		//input from user
		System.out.println("enter a num:" );
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num);
		
		System.out.println("enter a city");
		String city = sc.next();
		System.out.println("ur city is:" + city);
		
		//to take multiple inputs
		 int d[]=new int[5];
		 Scanner sc1 = new Scanner(System.in);
		 
		 for(int i=0;i<d.length;i++)
		 {
			 System.out.println("enter a value" +i);
			 d[i]=sc1.nextInt();
		 }
		 System.out.println(Arrays.toString(d));
			
	}
	
}
