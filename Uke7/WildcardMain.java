
class WildcardMain {
	
	public static void leggSammen(ToObjekter<? extends Number> obj) {
		System.out.println(obj.hentForste().doubleValue() + obj.hentAndre().doubleValue());
	}
	
	public static void printToObj(ToObjekter to) {
		System.out.println(to.hentForste());
		System.out.println(to.hentAndre());
	}

	public static void main(String[] arne) {
		ToObjekter<Integer> toObj = new ToObjekter<Integer>(1, 2);
		leggSammen(toObj);
	
	}
}

