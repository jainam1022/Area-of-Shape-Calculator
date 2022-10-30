package abc;
 import java.util.Scanner;
 
public class Area_of_Shape_Calculator {

	public static void main (String []args) {
		
	System.out.println("Enter: 1 for circle, 2 for square, 3 for triangle, 4 for rectangle.");
	Scanner input = new Scanner (System.in);
		int shape = input.nextInt();
		 
	if (shape == 1){
		System.out.println("Please enter the radius of the cirlce: ");
		double radius = input.nextDouble();
		double circle_area = 3.14 * (radius*radius);
		System.out.println("The area of the circle is:" +circle_area);

}
	else if (shape == 2) {
		System.out.println("Please enter the value of one side: ");
		double one_side = input.nextDouble();
		double square_area = one_side*one_side;
		System.out.println("The area of the square is:" +square_area);

	}
	else if (shape == 3) {
		System.out.println("Please enter the value of the height: ");
		double height = input.nextDouble();
		System.out.println("Please enter the value of one base: ");
		double base = input.nextDouble();
		System.out.println("Please enter the value of one height: ");
		double traingle_area = ((base * height)/2);
		System.out.println("The area of the traingle is:" +traingle_area);
	}
	else if (shape == 4) {
		System.out.println("Please enter the value of length: ");
		double rectangle_length = input.nextDouble();
		System.out.println("Please enter the value of width: ");
		double rectangle_width = input.nextDouble();
		double rectangle_area = rectangle_length * rectangle_width;
		System.out.println("The area of the rectangle is:" + rectangle_area);
	
}
	}
}
	