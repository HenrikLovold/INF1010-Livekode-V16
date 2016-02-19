class Lenkehistorie {

	private Node forste;
	
	public void nyttKapittel(String kap) {
		Node ny = new Node(kap);
		Node midl = forste;
		
		if(midl == null) {
			forste = ny;
		} else {
			while(midl.neste != null) {
				midl = midl.neste;
			}
			midl.neste = ny;
		}
		
	}
	
	public void skrivHistorie() {
		Node midl = forste;
		if(forste == null) {
			System.out.println("=== Historien er tom ===");
		} else {
			while(midl != null) {
				System.out.println(midl.kapittel);
				midl = midl.neste;
			}
		}
		
	}
	
	private class Node {
		String kapittel;
		Node neste;
		
		public Node(String kapittel) {
			this.kapittel = kapittel;
		}
	}
}
