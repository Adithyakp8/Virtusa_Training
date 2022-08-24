package com.sample;

import java.util.Scanner;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd b1 = new EvenOdd();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		b1.setNum(sc.nextInt());
		b1.setEvenOdd(b1.checkEvenOdd(b1.getNum()));
		
		System.out.println(b1.getNum()+"\t"+b1.isEvenOdd());

	}

}
