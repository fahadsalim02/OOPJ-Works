//DATE    : 06/12/2021
//AUTHOUR : FAHAD SALIM
//AIM     : TO FIND THE AREA OF THE TRIANGLE,RECTANGLE & CIRCLE.

package oopj061221;
import java.util.Scanner;
class Area{
	void area(double a,double b) {
	double at=(a*b)/2;
	System.out.println("The area of the triangle is: "+at);
	}
void area(int a,int b) {
	int ar=a*b;
	System.out.println("The area of the rectangle is: "+ar);
}
void area(double a) {
	double ac=3.14*a*a;
	System.out.println("The area of the circle is: "+ac);
}

}
public class AreaOfShapes {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Area ob=new Area();
	System.out.println("Enter the height and width of the triangle: ");
	double he=sc.nextDouble();double wd=sc.nextDouble();
	ob.area(wd,he);
	System.out.println("Enter the length and breadth of the rectangle: ");
	int len=sc.nextInt();int br=sc.nextInt();
	ob.area(len,br);
	System.out.println("Enter the radius of the circle: ");
	double ra=sc.nextDouble();
	ob.area(ra);
}

}
