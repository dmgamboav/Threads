package thread;

public class MultThreadingRunnable implements Runnable {

	private static final String DESCRIPTION = "multithreading ";

	private String description;

	private MultThreadingRunnable(int i) {
		description = DESCRIPTION + i ;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			MultiThreading mt = new MultiThreading(i);
			mt.start();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + description);
		}
		System.out.println("------------------------");
	}

}
