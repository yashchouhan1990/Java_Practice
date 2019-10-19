package stringPrograms;

import java.util.Scanner;

public class Swap_FirstandLastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String = ");
		str=sc.nextLine();
		String arr[]=str.split(" ");
		
		String temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
/*
Output-
Enter any String = 
My name is Yash Chouhan
Chouhan name is Yash My 
*/