package tr.org.kamp.linux.random;

import java.util.Random;

public class RandomCard {
	private static Random rgen = new Random();// bu sinifa ozgu tum sinifan
												// biri bunu kullanabilir.

	public static void main(String[] args) {
		System.out.println("Card:  " + chooseRandomCard());
		System.out.println("Suit:  " + chooseRandomSuit());

	}

	public static String chooseRandomCard() {
		return chooseRandomRank() + "  of  " + chooseRandomSuit();
	}

	public static String chooseRandomRank() {
		int num = rgen.nextInt(13) + 1;
		if(num>1 && num<=10) {
			return " " +num;
		}
		else {
		switch (num) {
		case 1:
			return "As";
		case 11:
			return "Vale";
		case 12:
			return "Kız";
		case 13:
			return "Papaz";
		default:
			return "error";
		}

	}
	}

	public static String chooseRandomSuit() {// kupa-sinek-maca-karo//
		int RandomNum = rgen.nextInt(4);

		switch (RandomNum) {
		case 0:
			return "maca";
		case 1:
			return "kupa";
		case 2:
			return "sinek";
		case 3:
			return "karo";
		default:
			return "error";

		}

	}
}
