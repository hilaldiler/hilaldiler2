package tr.org.kamp.linux.random;

import java.util.Random;

public class rnd {
	public static void main(String[] args) {
		Random rgen=new Random(4);
		System.out.println("Rgen random newxt Int    :"+rgen.nextInt());
		//System.out.println("Rgen random              : "+Math.random());
		//System.out.println("Rgen random next boolean :"+rgen.nextBoolean());
		//System.out.println("Rgen random next double  :"+rgen.nextDouble()); 
		//Random rgen2=new Random();
		//System.out.println("Rgen random next Int       :"+rgen2.nextInt() );
		int result =rgen.nextInt(3)%8;
		System.out.println("Rgen random next int between 8-10:  "+result);
	}

}
