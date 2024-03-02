/**
 * CISC 380
 *
 * Starter code for Assignment 2
 * @author Jack Lewis and Lennart Buhl
 * Due Date: xx/xx/xx
 */


public class Assignment2 {


    /**
     * STARTER CODE FOR PROBLEM 2: Dominating Entry
     *
     * @param array the array which will be evaluated for containing a dominant entry
     * @return the dominating entry, will return null if there is no dominating entry (return type Integer)
     */

    // we simply iterate through the array and count the occurences of "value"
    // This is O(n) time
    private static int countOccurrences(int[] array, int start, int end, int value) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    // we split the array in half -> O(log_2(n)) time
    // Generally great stuff
    private static Integer findDominantElement(int[] array, int start, int end) {
        if (start == end) {
            return array[start];
        }

        int mid = (start + end) / 2;
        Integer leftDominant = findDominantElement(array, start, mid);
        Integer rightDominant = findDominantElement(array, mid + 1, end);

        // immediate checker if both have same outcome
        if (leftDominant != null && leftDominant.equals(rightDominant)) {
            return leftDominant;
        }

        // gives a little buffer so we get zero when findDominantElement returns null
        int leftCount = leftDominant == null ? 0 : countOccurrences(array, start, end, leftDominant);
        int rightCount = rightDominant == null ? 0 : countOccurrences(array, start, end, rightDominant);
        int half = (end - start + 1) / 2;

        // check which one has majority
        if (leftCount > half) {
            return leftDominant;
        } else if (rightCount > half) {
            return rightDominant;
        } else {
            // if neither have majority
            return null;
        }
    }

    public static Integer dominant(int[] array) {
        // ADD CODE TO COMPLETE THIS METHOD
        // HINT: you will need to create a private recursive method (similar to maxSubArray())

        if (array.length == 0) {
            return null;
        }
        // call the recursive function
        return findDominantElement(array, 0, array.length - 1);
    }

    /**
     * STARTER CODE FOR PROBLEM 3: Maximum Subarray
     *
     * @param array the array where the maximum subarray will be found
     * @return the sum of the subarray with the maximum sum
     */
    public static int maxSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        else if (array == null) {
            return 0;
        }
        else {
            return maxSubArrayRecursive(array, 0, array.length-1);
        }
    }

    /**
     * STARTER CODE FOR PROBLEM 3: Maximum Subarray
     *
     * @param array the array where the maximum subarray will be found
     * @param start the starting index where the recursive method will check
     * @param end the ending index where the recursive method will check
     * @return the sum of the subarray with the maximum sum.
     * Note: this method will return 0 if the length of the array is 0 and will be negative if the
     * array contains only negative numbers
     */

    // calculates the max sum of a subarary that crosses the midpoint
    private static int crossSum(int[] array, int start, int mid, int end) {
        if (start == end) {
            return array[start];
        }
        // initialize the leftSum/rightSum + sum varibale
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;

        // count backwards
        for (int i = mid; i >= start; i--) {
            sum += array[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0; // reset
        // count forwards
        for (int i = mid + 1; i <= end; i++) {
            sum += array[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        // return their sum
        return leftSum + rightSum;
    }

    private static int maxSubArrayRecursive(int[] array, int start, int end) {
        // ADD CODE TO COMPLETE THIS METHOD
        // HINT: you will need to add a base case and change the return value

        // Got rid of variables here

        // simple base case - if start equals end return the only element in array
        if (start == end) {
            return array[start];
        }

        int mid = (start + end) / 2;
        int maxLeft = maxSubArrayRecursive(array, start, mid);
        int maxRight = maxSubArrayRecursive(array, mid + 1, end);
        int maxCross = crossSum(array, start, mid, end);

        // simply retunr the max of the three values
        return Math.max(Math.max(maxLeft, maxRight), maxCross);

    }


    /**
     * STARTER CODE FOR PROBLEM 5a: Brute Force Hill
     *
     * Implements a brute force approach to finding a hill in an array
     * @param arr - an array of integers
     * @return - the index of a hill within the array
     */
    public static int bruteHill(int[] arr){
        // Check if the arr is more than 1 element
        if (arr.length < 2) {
            return -1;
        }

        // Check if there is a hill at index 0
        if (arr[0] >= arr[1]) {
            return 0;
        }

        // Check all other indexes
        for (int i = 1; i < arr.length - 1; i++) {
            int prev = arr[i - 1];
            int curr = arr[i];
            int next = arr[i + 1];
            if (curr >= prev && curr >= next){
                return i;
            }
        }

        // Check if there is a hill at index n
        if (arr[arr.length - 1] >= arr[arr.length - 2]) {
            return arr.length - 1;
        }

        // There is no hill
        return -1;
    }


    /**
     * STARTER CODE FOR PROBLEM 5b: Divide and Conquer Hill
     *
     * Implements a divide and conquer approach to finding a hill in an array
     * @param arr - an array of integers
     * @return - the index of a hill within the array
     */
    public static int divideAndConquerHill(int[] arr){

        // ADD CODE TO COMPLETE THIS METHOD

        return -1;
    }

}