package tr.org.kamp.linux.statics;

public class StaticExample {
	public static String myStaticString="Bu Bir Static String";
			public static String myStaticStringMethod() {
		return "Bu Bir Static String";
	}
	static {
		System.out.println("Bu Bir Static Blok");
	}
	static {
		System.out.println("Bu da bir static Blok");
	}
	static {
		System.out.println("Bu da ucuncu Static Bok");
	}
	static {
		int x=5;
		System.out.println(x);
		System.out.println("Bu da ucuncu Static Blok");
	}

}
