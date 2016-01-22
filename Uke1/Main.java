class Main {
	public static void main(String[] args) {
		Hopper espen = new Hopper("Espen Bredesen", 210);
		Hopper anette = new Hopper("Anette Sagen", 130);
		Hopper tommy = new Hopper("Wirkola", 155);
		
		LangLoper bjorn = new LangLoper("Bjorn Daehlie", 1.46);
		LangLoper thomas = new LangLoper("Thomas Alsgaard", 1.43);
		LangLoper petter = new LangLoper("Petter Fjontug", 1.39);
		
		Resultat<Hopper> hopp = new Resultat<Hopper>(espen, anette, tommy);
		Resultat<LangLoper> loep = new Resultat<LangLoper>(bjorn, thomas, petter);
		
		hopp.skrivListe();
		System.out.println();
		loep.skrivListe();
		
		// Datastrukturtegning her
	}
}
