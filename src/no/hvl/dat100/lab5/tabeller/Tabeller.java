package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
        for (int i = 0; i<tabell.length; i++) {
            System.out.print(tabell[i]);
        }
            System.out.print("]");
    }

	// b)
	public static String tilStreng(int[] tabell) {

		String txt = "[";
        for (int i = 0; i<tabell.length; i++) {
            if (i<tabell.length-1) {
            txt += tabell[i] + ",";
            } else {
                txt += tabell[i];
            }
        }
        txt += "]";
        return txt;

}

	// c) 
	public static int summer(int[] tabell) {

		int sum = 0;
        for(int i=0; i<tabell.length; i++) {
        	int t = tabell[i];
            sum += t;
        }
        System.out.println(sum);
    

	
	sum = 0;
	int i = 0;
	while ( i <tabell.length ) {
		int t = tabell [i];
		sum += t;
		i++;
	}
	System.out.println(sum);

	
	
	
	sum = 0;
	for ( int tabellSum : tabell ) {
		sum += tabellSum;
	}
	return sum;
}
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell [i] == tall) 
				return true;
			}
		
		return false;

}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int t = 0; t < tabell.length; t++) {
		if(tabell[t] == tall) {
			return t;
		
			}
		
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		 int[] reverser = new int[tabell.length];

	        for(int i = tabell.length -1; i>= 0; i--) {
	            reverser[(tabell.length-1)-i] = tabell[i];
	        }
	        return reverser;
	    }

	// g)
	public static boolean erSortert(int[] tabell) { 
		for(int i = 0; i < tabell.length - 1; i++) {
			if(tabell[i] > tabell[i+1])
				return false;
		
		}
		return true;
		
	}
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		
		int lengde = tabell1.length + tabell2.length;
		
		int[] result = new int[lengde];
		int pos = 0;
		for (int element : tabell1) {
			result[pos] = element;
			pos++;
	}
		
		for(int element : tabell2) {
			result[pos] = element;
			pos++;
		}
			return result;

	}
	
}
