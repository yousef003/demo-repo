public class LinearSearch implements SearchingBehavior {

    public int search(int [] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }
}