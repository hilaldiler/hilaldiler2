package tr.org.kamp.linux.random;

import java.util.Random;

public class MonteCarlo {
	private static Random rgen = new Random();

	public static void main(String[] args) {
		int dartCount=1000;
		int insideCount=0;
		for(int i=0; i<dartCount;i++) {
			if(isInCircle(getPoint(),getPoint())) {
				insideCount++;
			}
		}
		double pi=4*(insideCount);

	}

	public static double getPoint() { //-1 ile 1 arasinda sayi vericek//
		return (2 *rgen.nextDouble())-1;
	}
	public static boolean isInCircle(double x,double y) {// true or false//
		return Math.pow(x, 2)+Math.pow(y, 2)<1	;
		
		}
	}
