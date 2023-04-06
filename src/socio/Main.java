package socio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Socio[] listaSocios = new Socio[] { 
				new Socio(2, "Ana", "07-12-1995"), 
				new Socio(1, "Juan", "20-09-2002"),
				new Socio(4, "Manu", "06-05-2002") };
		
		System.out.println("Lista Ordenada por Nombre (A-Z)");
		Comparator<Socio> comparadorA=(s1,s2)->s1.getNombre().compareTo(s2.getNombre());
		Arrays.sort(listaSocios,comparadorA);
		System.out.println(Arrays.deepToString(listaSocios));
	}

}
