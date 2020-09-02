package com.abc.DataStructure;

import java.util.Scanner;

public class program1 //Addition of two numbers
{
public static void main(String[] args) {
	Addition ad = new Addition();
	ad.input();
	ad.add();
	ad.display();
}
}
class Addition{
	int a;
	int b;
	int c;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a and b value:");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
	}
		void add() {
			c=a+b;
		}
		void display() {
			System.out.println("the additon of two numbers are:"+c);
		}

	}
