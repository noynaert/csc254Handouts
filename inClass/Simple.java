public class Simple{
	public static void main(String[] args){
	   System.out.println("Starting!");

       //System.out.println ( args[0] );
	   //System.out.println ( args[1] );
       //System.out.println ( args[2] );

       System.out.printf( "There are %d arguments.\n" , args.length );

	   for(int i = 0; i < args.length; i++){
		  System.out.printf ("[%d] is %s\n", i, args[i]);
	   }

	   //double number = args[3] + args[4];  //error because args[3] and args[4] are strings

	   System.out.println("Done!");

	}
}
