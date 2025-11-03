import java.util.Arrays;

public class FindSecondLargestSmallest {

    public static void findSecondLargestSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
        
        // Sort the array to easily find the second smallest and largest
        Arrays.sort(arr);
        
        // FIX: Access the second smallest element using index 1
        int secondSmallest = arr[1]; 
        
        // Access the second largest element using index [length - 2]
        int secondLargest = arr[arr.length - 2];

        System.out.println("Second smallest: " + secondSmallest);
        System.out.println("Second largest: " + secondLargest);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 2, 8};
        System.out.println("Original array: " + Arrays.toString(numbers));
        findSecondLargestSmallest(numbers);
    }
}
