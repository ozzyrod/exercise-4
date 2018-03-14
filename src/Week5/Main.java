/*
 * @project Week5
 * @author  Osbardo Rodriguez
 * Date:    3/6/18
 */
package Week5;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

    public static void main( String[] args ) {

	    // Instantiate the Scanner
	    Scanner input = new Scanner( System.in );

	    /*
	     * Declare the variables needed
	     */
	    int    product_number;
	    int    product_quantity;
	    int    one_quantity = 0; // Product 1 quantity
	    int    two_quantity = 0; // Product 2 quantity
	    int    three_quantity = 0; // Product 3 quantity
	    int    four_quantity = 0; // Product 4 quantity
	    int    five_quantity = 0; // Product 5 quantity

		System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "*                       Sales Calculator                              *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product Number                                      Number to enter *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product 1                                                   1       *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product 2                                                   2       *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product 3                                                   3       *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product 4                                                   4       *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product 5                                                   5       *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "Enter 6 to exit and print out total sales                              " );

	    do {

		    /*
		     * Get the product number
		     */
		    System.out.print( "Please enter a product number: " );
		    product_number = input.nextInt();

		    if ( product_number < 1 || product_number > 5 ) {
			    returnAllProducts( one_quantity, two_quantity, three_quantity, four_quantity, five_quantity );
			    break;
		    }

		    /*
		     * Get the product quantity
		     */
		    System.out.print( "Enter the quantity: " );
		    product_quantity = input.nextInt();

		    switch ( product_number ) {

			    case 1:
				    one_quantity += product_quantity;
				    break;
			    case 2:
				    two_quantity += product_quantity;
				    break;
			    case 3:
				    three_quantity += product_quantity;
				    break;
			    case 4:
				    four_quantity += product_quantity;
				    break;
			    case 5:
				    five_quantity += product_quantity;
				    break;
			    default:
				    break;
		    }
	    } while ( product_number <= 5 && product_number >= 1 );
    }

    /*
     * Calculates and outputs all products
     *  @param int one The number of product1.
     *  @param int two The number of product2.
     *  @param int three The number of product3.
     *  @param int four The number of product4.
     *  @param int five The number of product5.
     */
    public static void returnAllProducts( int one, int two, int three, int four, int five ) {

	    /*
	     * Declare and assign the variables needed
	     */
	    double product_one = 2.98;
	    double product_two = 4.50;
	    double product_three = 9.98;
	    double product_four = 4.49;
	    double product_five = 6.87;
    	double product_one_revenue = one * product_one;
    	double product_two_revenue = two * product_two;
	    double product_three_revenue = three * product_three;
	    double product_four_revenue = four * product_four;
	    double product_five_revenue = five * product_five;
	    double total = product_one_revenue + product_two_revenue + product_three_revenue + product_four_revenue + product_five_revenue;

	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "*                       Sales Calculator                              *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.println( "* Product             *  Quantity Sold  *             *   Total Sales *" );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.printf( "* Product 1           *%12d     *             *     $%-4.2f    *\n", one, product_one_revenue );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.printf( "* Product 2           *%12d     *             *     $%-4.2f    *\n", two, product_two_revenue );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.printf( "* Product 3           *%12d     *             *     $%-4.2f    *\n", three, product_three_revenue );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.printf( "* Product 4           *%12d     *             *     $%-4.2f    *\n", four, product_four_revenue );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.printf( "* Product 5           *%12d     *             *     $%-4.2f    *\n", five, product_five_revenue );
	    System.out.println( "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" );
	    System.out.printf( "Your total revenue is $%.2f\n", total );
    }
}
