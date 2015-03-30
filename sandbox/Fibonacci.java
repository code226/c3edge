public class Fibonacci {

	public static void main( String[] args ) {
	
		Fibonacci fib = new Fibonacci();
		
		int n = Integer.parseInt(args[0]);
		
		for ( int i = 0; i <= n; i++ ) {
			int a = fib.getNthFibR(i);
		
			System.out.print(a);
			
			if (i != n) {
				System.out.print(", ");
			}
		}		
	}
	
	public Fibonacci() {
	}
	
	public int getNthFib( int n ) {
		
		if (n == 0)
			return 0;
			
		if (n == 1)
			return 1;

		int a = 0;
		int b = 1;
		int c = 0;
		int i = 1;
		
		while (i < n) {
			c = b;
			b = a + b;
			a = c;
			
			i++;
		}
		
		return b;
	}
	
	public int getNthFibR( int n ) {
	
		if (n == 0)
			return 0;
			
		if (n == 1)
			return 1;
			
		if (n == 2)
			return 1;
			
		if (n > 2) {
		
			return getNthFibR(n-2) + getNthFibR(n-1);
		}
		
		return 0;
	}
}