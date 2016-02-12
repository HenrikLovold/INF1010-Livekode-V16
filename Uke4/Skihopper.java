
class Skihopper extends Utover {

	private int lengde;
	
	public Skihopper(int startnr, String navn, int lengde) {
		super(startnr, navn);
		this.lengde = lengde;
	}
	
	public String toString() {
		return ("#" + startnr + " " + navn + " lengde: " + lengde);
	}
	
	public void hopp() {
		System.out.println("Det er helt utrolig");
	}
}
