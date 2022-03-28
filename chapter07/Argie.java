public class Argie {
    public static void main (String[] args){
	     System.out.println("Hello.");
         System.out.printf("There are %d command line arguments\n", args.length);

		 //print the command line arguments
		 for(int i = 0; i<args.length; i++){
		    String arg = args[i];
		    System.out.printf("[%d] %s \n", i, arg);
		 }
    }   
}
