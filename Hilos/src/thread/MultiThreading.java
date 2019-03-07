package thread;

public class MultiThreading extends Thread {

	private String description;

	public MultiThreading(int i) {
		description = "multithreading " + i;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			MultiThreading mt = new MultiThreading(i);
			mt.start();
		}
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + description);
		}
		System.out.println("------------------------");
	}

}
