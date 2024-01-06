
public class CatchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            int[] a = {10, 20, 30, 40, 50};
		            int result = a[5] / 5; // This will throw ArrayIndexOutOfBoundsException
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		        } catch (ArithmeticException e) {
		            System.out.println("Caught ArithmeticException: " + e.getMessage());
		        }
		    }
		

	}


