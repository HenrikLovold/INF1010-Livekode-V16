class Hopper {
	private String navn;
	private int besteLengde;
	
	public Hopper(String navn, int besteLengde) {
		this.navn = navn;
		this.besteLengde = besteLengde;
	}
	
	public String toString() {
		return navn + " rekord: " + besteLengde + " meter";
	}
}
