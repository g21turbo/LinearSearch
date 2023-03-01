public class LinearSearchExample {
    public static int linearSearch(int[] arr, int key) {

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {

            // Check if the current element equals the key
            if (arr[i] == key) {

                // Return the index where the key was found
                return i;
            }
        }
        // Key not found in the array
        return -1;
    }

    public static void main(String[] args) {

        // Create an integer array
        int[] arr = { 3, 7, 1, 9, 4 };

        // Specify the key value to search for
        int key = 7;

        // Call the linearSearch method to search for the key in the array
        int index = linearSearch(arr, key);

        // If the key was found, print a message with its index
        if (index != -1) {
            System.out.println("Found key " + key + " at index " + index);
        }
        // If the key was not found, print a message indicating that it was not found
        else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}
