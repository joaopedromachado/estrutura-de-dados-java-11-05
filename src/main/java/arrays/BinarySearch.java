package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArr = {1, 5, 7, 9, 11, 15, 16, 22, 24, 31};
        System.out.println(binarySearch(myArr, 31));
    }
    public static Integer binarySearch(int[] arr, int item){
        int low, high, mid, guess;

        low = 0;
        high = arr.length - 1;

        while(low <= high){
            mid = (low + high) / 2;
            guess = arr[mid];
            if(guess == item){
                return mid;
            }
            if (guess > item){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}
