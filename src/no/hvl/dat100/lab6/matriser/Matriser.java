package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;
		
		int row1 = a.length;
		int col1 = a[0].length;
		
		int row2 = b.length;
		int col2 = b[0].length;
		
			if(row1 != row2 || col1 != col2) {
				erLik = false;
			}
			else {
				for(int i = 0; i < row1; i++) {
					for(int j = 0; j < col1; j++) {
						if(a[i][j] != b[i][j]) {
							erLik = false;
						}
					}
				}
				
			if(erLik)
				return true;
			else
				return false;
			}
		
		return erLik;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
