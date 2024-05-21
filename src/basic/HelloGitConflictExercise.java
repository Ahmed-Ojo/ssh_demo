package basic;

public class HelloGitConflictExercise {

	public static void main(String[] args) {
		System.out.println("This is Git Conflict Exercise");

		 // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

	}
    
	//Dev_2 branch code
	public void test() {
		System.out.println("from test method");

	//Dev_3 branch code Changes
	public static void test() {
		System.out.println("The code changes from Dev_3");

	}
}
