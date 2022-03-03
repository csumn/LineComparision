package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
        System.out.println("Enter value for x1 : ");
        int x1 = obj.nextInt();
        System.out.println("Enter value for y1 : ");
        int y1 = obj.nextInt();
        System.out.println("Enter value for x2 : ");
        int x2 = obj.nextInt();
        System.out.println("Enter value for y2 : ");
        int y2 = obj.nextInt();
        obj.close();

        double LengthOfLine = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));

        System.out.println(" Length of Line is : "+LengthOfLine);
	}

}
