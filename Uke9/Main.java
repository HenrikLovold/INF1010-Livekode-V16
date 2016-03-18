
class Main {
	public static void main(String[] args) {
		MinTraad[] traader = new MinTraad[10000];
		Thread[] threads = new Thread[10000];
		
		for(int i = 0; i < 10000; i++) {
			traader[i] = new MinTraad(i);
			threads[i] = new Thread(traader[i]);
			threads[i].start();
		}
		
		for(int i = 0; i < 10000; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(MinTraad.count);
	}
}
