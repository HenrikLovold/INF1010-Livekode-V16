class Resultat<T> {
	private T forste;
	private T andre;
	private T tredje;
	
	public Resultat(T forst, T and, T tre) {
		this.forste = forst;
		this.andre = and;
		this.tredje = tre;
	}
	
	public void skrivListe() {
		System.out.println("1: " + forste);
		System.out.println("2: " + andre);
		System.out.println("3: " + tredje);
	}
}
