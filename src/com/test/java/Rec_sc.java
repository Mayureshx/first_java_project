package com.test.java;
import java.util.*;

public class Rec_sc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int l = sc.nextInt();
		System.out.println("Enter width");
		int w = sc.nextInt();
		
		
		int area;
		area = l*w;
		System.out.println("area "+area);
		int peri;
		peri=2*(l+w);
		System.out.println("Perimeter "+peri);

	}

}
