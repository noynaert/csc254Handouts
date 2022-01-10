package misc_notes;


public class AreaOfSquare {
    public static void main(String[] args){
        double length;   //The length of one side of the square
        double area;     //The area of the square

        // Get the input
        length = 5.2;

        // Computer the area
        area = length * length;

        //Display the results
        System.out.println("A square which has a side " + length 
                        +  " units has an area of " + area + " square units."
        );
    }
}