package tr.org.kamp.linux.random;
import java.util.Random;
public class DiceGame {
	public static Random rgen=new Random();
	public static void main(String[] args) {
		String player1,player2;
		int num1=roll(),num2=roll();
		System.out.println("player1:  "+num2);
		System.out.println("player2:  "+num1);
		
		if(num2>num1) {
			System.out.println("player1 kazandi");
			
		}
		
		else if(num1>num2)
			
		
			System.out.println("player2 kazandi");
		else
			System.out.println("Berabere");
	}
	
	
	
	public static int roll() {
		int num=rgen.nextInt(6)+1;
		if(num>=1 && num<=6)
		return num;
		else
			return 0;
		
		
	}
}
