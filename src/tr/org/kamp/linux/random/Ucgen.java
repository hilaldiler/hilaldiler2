package tr.org.kamp.linux.random;

import java.util.*;

public class Ucgen {
	private static int a;
	private static int b;

	private static Random rgen = new Random();

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("İki kenar giriniz: \t");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println(Hypo(a,b));
		System.out.println(Alan(a,b));
		System.out.println(Cevre(a,b));
	}

	public static int Hypo(int a,int b) {
		return (int) Math.hypot(a, b);

	}
	public static int Alan(int a,int b) {
	return (a*b)/2;
	}
	

	public static int Cevre(int a,int b) {
		return a + b + Hypo(a,b);

	}

}
