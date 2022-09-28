package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
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
