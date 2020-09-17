import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("The purpose of this program is to calculate the volume of a sphere.");
		double diameter, radius, volume;
		System.out.println("Enter the diameter of the sphere: ");
		diameter = in.nextDouble();
		radius = diameter / 2.0;
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
		System.out.println("The volume of the sphere is " + volume + " units cubed.");
	}

}
