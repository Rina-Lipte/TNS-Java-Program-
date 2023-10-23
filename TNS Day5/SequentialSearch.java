
public class SequentialSearch {
	public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;

        int result = sequentialSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

	}

}
