public class Hopper implements Utover{
	private String navn;
	private String nasjonalitet;
	
	public Hopper (String navn, String nasjonalitet){
		this.navn = navn;
		this.nasjonalitet = nasjonalitet;
	}
	
	public void syngNasjonalsang(){
		System.out.println(nasjonalitet + " sin nasjonalsang");
	}
	
	public String hentNasjonalitet(){
		return nasjonalitet;
	}
	
	
	public String hentNavn(){
		return navn;
	}
	
	public void hopp(){
		System.out.prinln("Jeg hopper! Whee!");
	}
	
}
