package Algorithms;

class RotatedArray {


    RotatedArray(String scannedInput) {
        //remove whitespace and split the string on the comma to get an array
        String[] items = scannedInput.replaceAll("\\s", "").split(",");
        //iterate through the String array, convert to integer and place in the results array
        int[] results = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.err.println("This array element is not an Integer: " + items[i]);
                return;
            }
        }
        int answer = positionsRotated(results);    //here is the call to your method
        System.out.println(answer);
    }

    // TODO write the positionsRotated method to accept an array of integers and return the number of positions rotated
    static int positionsRotated(int[] arr) {
        return countRotations_helper(arr, 0, arr.length - 1);
    }

    static int countRotations_helper(int arr[], int low, int high) {

        if (high < low)
            return 0;
        // If there is only one element left
        if (high == low)
            return low;
        int mid = low + (high - low) / 2;
        if (mid < high && arr[mid + 1] < arr[mid])
            return (mid + 1);
        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;

        // Decide whether we need to go to left
        // half or right half
        if (arr[high] > arr[mid])
            return countRotations_helper(arr, low, mid - 1);

        return countRotations_helper(arr, mid + 1, high);

    }


    public static void main(String[] args) { //grab input from STDIN, must be comma-separated like "1,2,3,4"
        /*Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) new RotatedArray(scan.nextLine());
        scan.close();*/
        int[] arr={81, 92, 5, 12, 26, 34, 42, 55, 64, 79};
        System.out.println(positionsRotated(arr));
    }
}