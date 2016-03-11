
class Main {
	public static void main(String[] args) {
		try {
			metode1();
		} catch (MyException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nMain ferdig");
		}
	}
	
	public static void metode1() throws MyException {
		metode2();
	}
	
	public static void metode2() throws MyException {
		metode3();
	}
	
	public static void metode3() throws MyException {
		throw new MyException();
	}
}
