package tr.org.kamp.linux.random;
import java.util.*;
public class Sphere {
	private static double r;
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Yaricap giriniz");
	double r=input.nextDouble();
	System.out.println(Hacim( r));
}



public static double Hacim(double r) {
	return (4/3)*Math.PI*Math.pow(r, 3);
}
}
