import java.util.ArrayList;

class GeneriskeMetoder {
	public static <T> void printObj(T t) {
		System.out.println(t);
	}
	
	public static <T> ArrayList<T> arrayTilArrayList(T[] arrayen) {
		ArrayList<T> liste = new ArrayList<T>();
		
		for(T t : arrayen) {
			liste.add(t);
		}
		
		return liste;
	}
	
	public static void main(String[] argumenteneMine) {
		Integer[] array = {1, 2, 3, 1334};
		ArrayList<Integer> liste = arrayTilArrayList(array);
		
		for(Integer s : liste) {
			System.out.println(s);
		}
		
		
	}
	
}






