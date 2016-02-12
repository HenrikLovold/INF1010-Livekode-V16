/**
 * Klasse for å beskrive en skøyteløper.
 * @author Henrik H. Løvold
 */
public class Skoyteloper implements Utover{
	private String navn;
	private String nasjonalitet;
	
	/**
	 * Konstruktør til Skoteloper.
	 *
	 * @param navn Løpers navn
	 * @param nasjonalitet Løpers nasjonalitet
	 */
	public Skoyteloper (String navn, String nasjonalitet){
		this.navn = navn;
		this.nasjonalitet = nasjonalitet;
	}
	
	/**
	 * Syng nasjonalsangen din
	 */
	public void syngNasjonalsang(){
		System.out.println("Watskebed");
	}
	
	/**
	 * Hent løpers nasjonalitet
	 * @return Nasjonaliteten til løperen
	 */
	public String hentNasjonalitet(){
		return nasjonalitet;
	}
	
	/**
	 * Hent løpers navn
	 * @return Løpers navn
	 */
	public String hentNavn(){
		return navn;
	}
	
	/**
	 * Her skal det løpes
	 */
	public void skoyt(){
		System.out.prinln("Jeg skoyteloper! Whee!");
	}
	
}
