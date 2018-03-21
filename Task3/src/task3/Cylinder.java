package task3;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		System.out.println(" please entre the radius of the cylinder :");
		Scanner s= new Scanner(System.in);
		int radius=s.nextInt();
		System.out.println("\n please entre the height of the cylinder :");
		int height=s.nextInt();
		
		
       Circle a1 = new Circle(radius);
      double lenght= a1.circumference();
       Shape a2=new Rectangle(lenght, height);
       
       System.out.println("\n Area of circle is :"+a1.area());
       System.out.println("\n Circumference of circle is :"+a1.circumference());
       System.out.println("\n Area of the cylinder :"+((2*a1.area())+a2.area()));

	}

}
