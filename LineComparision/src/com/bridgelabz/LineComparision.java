package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Values for Line one ");
        System.out.println("Enter value for x1 : ");
        int x1 = obj.nextInt();
        System.out.println("Enter value for y1 : ");
        int y1 = obj.nextInt();
        System.out.println("Enter value for x2 : ");
        int x2 = obj.nextInt();
        System.out.println("Enter value for y2 : ");
        int y2 = obj.nextInt();
        
		System.out.println("Values for Line two ");
        System.out.println("Enter value for x3 : ");
        int x3 = obj.nextInt();
        System.out.println("Enter value for y3 : ");
        int y3 = obj.nextInt();
        System.out.println("Enter value for x4 : ");
        int x4 = obj.nextInt();
        System.out.println("Enter value for y4 : ");
        int y4 = obj.nextInt();
        
        obj.close();

        Double LengthOfLine1 = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));
        System.out.println(" Length of Line is one : "+LengthOfLine1);
        
        Double LengthOfLine2 = Math.sqrt( ( x4 - x3 ) * ( x4 - x3 ) + ( y4 - y3 ) * ( y4 - y3 ));
        System.out.println(" Length of Line is two : "+LengthOfLine2);
        
        if(LengthOfLine1.equals(LengthOfLine2)) {
        	System.out.println("Both the lines are equal");
        }else
        	System.out.println("Both the lines are not equal");
	}
}

