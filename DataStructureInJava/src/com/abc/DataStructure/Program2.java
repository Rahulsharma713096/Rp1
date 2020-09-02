package com.abc.DataStructure;

import java.util.Scanner;

public class Program2 //swapping of two number using object oriented approach
{
public static void main(String[] args) {
	swap s = new swap();
	s.input();
	s.swapp();
	s.Display();
}
}
class swap{
	int a;
	int b;
	int c;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a and b value:");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		System.out.println("Before Swaping ----->  First value:"+a+",Second value:"+b);
	}
	void swapp() {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Swaping Done");
	}
	void Display() {
		System.out.println("After Swaping --->  First value:"+a+",Second value:"+b);
	}
}