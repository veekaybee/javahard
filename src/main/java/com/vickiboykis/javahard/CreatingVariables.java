public class CreatingVariables {
	public static void main( String[] args) {
		int x,y,age, height;
		double seconds, e, checking, rainfall;
		String firstName, lastName, title;

		x = 10;
		y = 400;
		age = 39;
		height = 63;


		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		rainfall = 23;

		firstName = "Vicki";
		lastName = "Boykis";
		title = "Ms.";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "And my height is " + height);
		System.out.println( "There were " + rainfall + " " + "inches of rain this year." );
	}
}