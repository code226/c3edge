public class Sorter {

	public static void main( String[] args ) {
	
		Sorter sorter = new Sorter();
		
		Integer[] a = new Integer[6];
		Integer[] b = new Integer[2];
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = null;
		a[5] = null;
		b[0] = 1;
		b[1] = 5;
		
		sorter.sort(a,b);
		
		for (Integer i : a) {
			System.out.print(i);
			System.out.print(",");
		}
	}
	
	public Sorter() {
	}
	
	public void sort( Integer[] a, Integer[] b ) {
	
		int l = a.length - 1;
		int m = b.length - 1;
		
		int j = sizeFilled(a) - 1;		
		int k = b.length - 1;

		System.out.println(l);
		System.out.println(m);
		System.out.println(j);
		System.out.println(k);
		
		while ( k >= 0 && j >= 0 ) {

			System.out.print(j);
			System.out.print(",");
			System.out.println(k);
		
			switch(compare(a[j],b[k])) {
				case 0: break;
				case 1: a[l] = a[j];
					if ( j == 0 )
						a[j] = b[k];
					j--;					
					l--;
					break;
				case -1: a[l] = b[k];
					k--;
					l--;
					break;					
			}
		}
	}
	
	private int compare( Integer x, Integer y ) {
				
		if ( x < y )
			return -1;
			
		if ( x > y ) 
			return 1;
			
		return 0;
	}
	
	private int sizeFilled( Integer[] a ) {
	
		for ( int i = 0; i < a.length; i++ ) {
			if ( a[i] == null )
				return i;
		}
		
		return -1;
	}
}