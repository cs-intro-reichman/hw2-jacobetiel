// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		int counter = 0;
		int deno = 3;
		double approx = 1;
		
		if (num == 1) {
			approx = approx = approx - (1.0/deno); 
			System.out.println ("pi according to Java: "+ Math.PI);
			System.out.println ("pi, approximated:     "+ (approx*4));
			return;
		}



		for(int i=1; i<=num-1;i++ ) {
			
			if (i%2 != 0)
				approx = approx - (1.0/deno);
			else
				approx = approx + (1.0/deno);
			
				
				deno = deno+2;
				System.out.println ("pi according to Java: "+ Math.PI);
				System.out.println ("pi, approximated:     "+ (approx*4));
			}

	}
}
