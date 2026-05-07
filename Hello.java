public class Hello{
	public static void main(String[] args){
		//the main method is an entry point to your code
		System.out.println("Hello everyone, i am learning java");
		System.out.print("Oh wow, Learning Java is fun. ");
		System.out.print("Hurray, I am Happy. ");
		System.out.printf("Java was created in %d%n",1992);
		System.out.printf("Java was made free for %c%.2f", '$',0.0008);
		System.out.printf(" Do you love Java%c %b%n",'?',true);
		System.out.printf("Yes learning %s is fun","Java");
	}
}



//the System.out.println() prints and moves to a new line 
// the System.out.print() prints the specified contenet and remains on that same line it is best used with when ur expecting an input from the user
// the System.out.printf() this method allows for formatted output and must be used with format specifier and it will remain on the same 
// %d integer for whole numbers
// %f floating-point with 6 decimals
// %.2f floating-point with 2 decimals
// %s string when writinga string use a double qoute ""
// %c character when writing a character use a single qoute ''
// %b boolean
// %n forces a courser to move to a new line
// git add -A
// git commit -m "Hello program"
// git push