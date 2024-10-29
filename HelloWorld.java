public final class HelloWorld {

	private static final String AUTHOR = "Danilo Pianini";

	public static void main(final String[] args) {
		System.out.println("This program has been realised by " + AUTHOR);
		System.out.println("This program is running in a PC with " + procNumber() + " logic processors!");
	}

	public static int procNumber() {
		return Runtime.getRuntime().availableProcessors();
	}

}
