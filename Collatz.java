// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
	    String mode = args[1];
		int counter = 0;
		int seeder;
		int finishedSeq= 0;
		
		if (mode.indexOf("v")!=-1) {
			
			for (int i=1; i <= seed; i++) {
				seeder = i;	
				counter = 1;
				System.out.print(seeder+ " ");
					while (seeder != 1) {
						
						if (seeder%2==0) {
							seeder = seeder/2;
							System.out.print(" "+seeder);
							counter++;
						}
						else {
							seeder = (3*seeder)+1;
							System.out.print(" "+seeder);
							counter++;
						}
					} 
					System.out.print(" ("+counter+")");
					System.out.println("");
					finishedSeq++;
					}
				System.out.println("Every one of the first "+finishedSeq +" hailstone sequences reached 1.");	
			}
			else {
				for (int i=1; i <= seed; i++) {
				seeder = i;	
				counter = 1;
				
					while (seeder != 1) {
						
						if (seeder%2==0) {
							seeder = seeder/2;
							counter++;
						}
						else {
							seeder = (3*seeder)+1;
							counter++;
						}
					} 
					finishedSeq++;
					}
				System.out.println("Every one of the first "+finishedSeq +" hailstone sequences reached 1.");	










			}

				



	}}

