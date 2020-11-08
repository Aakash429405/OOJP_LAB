/*Develop a Java program to create an abstract class named Shape that contains two integers and
an empty method named printArea( ). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes extends the class Shape. Each one of the classes contain
only the method printArea( ) that prints the area of the given shape.*/

import java.util.*;

abstract class Shape {
	int l, b, r;
	Scanner input = new Scanner(System.in);
	abstract void printArea();
}
class Rectangle extends Shape {
	void printArea() {
                System.out.println("FOR RECTANGLE");
		System.out.print("Enter length and breadth: ");
		l = input.nextInt();
		b= input.nextInt();
		System.out.println("The area of Rectangle is: " + l*b);
	}
}

class Triangle extends Shape {
	void printArea() {
                System.out.println("FOR TRIANGLE");
		System.out.print("Enter Base And Height: ");
		l = input.nextInt();
		b = input.nextInt();
		System.out.println("The area of Triangle is: " + (l*b) / 2);
	}
}

class Cricle extends Shape {
         	void printArea() {
	 	System.out.println("FOR CIRCLE");
                System.out.print("Enter Radius: ");
		r = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f *r*r);
	}
}

public class AreaRunner {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.printArea();
		Triangle t = new Triangle();
		t.printArea();
		Cricle c= new Cricle();
		c.printArea();
	}
}
