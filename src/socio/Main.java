package socio;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Socio[] listaSocios = new Socio[] { 
				new Socio(2, "Ana", "07-12-1995"), 
				new Socio(1, "Jorge", "20-09-2002"),
				new Socio(4, "Juan", "06-05-2002") };
		
		System.out.println("Lista Ordenada por Edad e ID");
		Comparator<Socio> comparadorA = (s1, s2) -> s1.edad().compareTo(s2.edad());
		Comparator<Socio> comparadorB = comparadorA.thenComparing((s1, s2) -> s1.getId().compareTo(s2.getId()));
		
		Arrays.sort(listaSocios, comparadorB);
		System.out.println(Arrays.deepToString(listaSocios));
	}

}