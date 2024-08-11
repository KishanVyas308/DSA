package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 3;
        int left = 0;
        int right= arr.length - 1;
        while(left <= right) {
            int mid = left + (right -left)/2;
            if(arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                break;
            }
            else if(arr[mid] < key) {
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
    }
}
