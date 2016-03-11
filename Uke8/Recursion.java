
class Recursion {
	public static void main(String[] arneBergersen) {
		System.out.println(fib(95));
	}
	
	public static int sum(int n) {
		if(n > 1) {
			return n + sum(n-1);
		}
		return 1;
	}
	
	public static int fib(int n) {
		if(n > 2) {
			return fib(n-1) + fib(n-2);
		}
		return 1;
	}
}
