public class numOfOcc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};  // Sample array

        // Call the function to print occurrences without repeats
        numOfOcc(arr);
    }

    public static void numOfOcc(int[] arr) {
        boolean[] visited = new boolean[arr.length];  // To track if an element has been counted

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {  // If the element has not been counted yet
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;  // Mark this element as counted
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}
