/**
 * CISC 380
 *
 * Starter code for Assignment 2
 * @author YOUR NAME HERE
 * Due Date: xx/xx/xx
 */


public class Assignment2 {


    /**
     * STARTER CODE FOR PROBLEM 2: Dominating Entry
     *
     * @param array the array which will be evaluated for containing a dominant entry
     * @return the dominating entry, will return null if there is no dominating entry (return type Integer)
     */
    public static Integer dominant(int[] array) {
        // ADD CODE TO COMPLETE THIS METHOD
        // HINT: you will need to create a private recursive method (similar to maxSubArray())

        if (array.length == 0) {
            return null;
        }
        else if (array == null) {
            return null;
        }
        return 0;
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
    private static int maxSubArrayRecursive(int[] array, int start, int end) {
        // ADD CODE TO COMPLETE THIS METHOD
        // HINT: you will need to add a base case and change the return value
        int mid;
        int maxLeft;
        int maxRight;

        mid = (start + end) / 2;

        //HINT: you will need to use maxLeft and maxRight in your solution
        //maxLeft = maxSubArrayRecursive(array, start, mid);
        //maxRight = maxSubArrayRecursive(array, mid+1, end);



        return -1;  // You will want to change this return value
    }


    /**
     * STARTER CODE FOR PROBLEM 5a: Brute Force Hill
     *
     * Implements a brute force approach to finding a hill in an array
     * @param arr - an array of integers
     * @return - the index of a hill within the array
     */
    public static int bruteHill(int[] arr){

        // ADD CODE TO COMPLETE THIS METHOD

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