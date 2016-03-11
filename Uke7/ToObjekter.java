
public class ToObjekter<T> {

	private T forsteObj;
	private T andreObj;
	
	public ToObjekter(T forst, T andre) {
		this.forsteObj = forst;
		this.andreObj = andre;
	}
	
	public T hentForste() {
		return forsteObj;
	}
	
	public T hentAndre() {
		return andreObj;
	}

}
