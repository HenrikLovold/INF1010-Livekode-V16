import java.util.Random;
class MinTraad implements Runnable {
	private int nr;
	public static int count = 0;
	
	public MinTraad(int nr) {
		this.nr = nr;
	}
	
	public static synchronized void update() {
		count++;
	}

	@Override
	public void run() {
		update();
	}
}
