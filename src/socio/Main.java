package socio;

import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		Socio[] listaSocios = new Socio[] { 
				new Socio(2, "Ana", "07-12-1995"), 
				new Socio(5, "Jorge", "20-01-2002"),
				new Socio(1, "Juan", "06-05-2004") 
			};
		System.out.println("Lista Ordenada por Edad");
		Comparator<Socio> comparadorA = (sa,sb)->sa.edad().compareTo(sb.edad());
		Arrays.sort(listaSocios,comparadorA);
		
		System.out.println(Arrays.deepToString(listaSocios));
		
		
	}

}
