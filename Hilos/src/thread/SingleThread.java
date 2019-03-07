package thread;

public class SingleThread {

	private String description;

	public SingleThread(int i) {
		description = "single thread " + i;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			new SingleThread (i).run();
		}

	}

	private void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + description);
		}
		System.out.println("------------------------");
	}

}
