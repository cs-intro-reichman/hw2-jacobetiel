public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
            cheer = cheer.toUpperCase();
            int num = Integer.parseInt(args[1]);
            char c;    
            String test;               
            int length = cheer.length(); 
            String vowels = "AEFHILMNORSX";
                for (int i=0; i<length;i++) {
                        c = cheer.charAt(i);
                        if (vowels.indexOf(c) != -1)
                                System.out.println("Give me an "+cheer.charAt(i)+": " +cheer.charAt(i)+"!" );
                        else
                                System.out.println("Give me a  "+cheer.charAt(i)+": " +cheer.charAt(i)+"!" );
                }
        System.out.println("What does that spell?");
        
        
        for (int i=0;i<num;i++){
                System.out.println(cheer+"!!!");
        }

        }}
