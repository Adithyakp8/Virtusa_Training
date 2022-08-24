package com.sample;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book b2 = new Book();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book id");
		b1.setBookId(sc.nextInt());
		System.out.println("Enter Book Name");
		b1.setBookName(sc.next());
		
		System.out.println("Enter Book id");
		b2.setBookId(sc.nextInt());
		System.out.println("Enter Book Name");
		b2.setBookName(sc.next());
		
		System.out.println(b1.getBookId()+"\t"+b1.getBookName());
		System.out.println(b2.getBookId()+"\t"+b2.getBookName());

	}

}
