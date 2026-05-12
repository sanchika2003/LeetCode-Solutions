import java.util.Arrays;

public class GFG {

    public static void updateBIT(int BITree[], int n, int index, int val) {
        index = index + 1; // Convert 0-indexed to 1-indexed

        while (index <= n) {
            BITree[index] += val;
            index += index & (-index); // Move to next ancestor
        }
    }

    public static int getSum(int BITree[], int index) {
        int sum = 0;
        index = index + 1; // Convert 0-indexed to 1-indexed

        while (index > 0) {
            sum += BITree[index];
            index -= index & (-index); // Move to parent node
        }
        return sum;
    }

    public static int[] constructBITree(int arr[], int n) {
        int[] BITree = new int[n + 1];
        Arrays.fill(BITree, 0);

        for (int i = 0; i < n; i++) {
            updateBIT(BITree, n, i, arr[i]);
        }

        return BITree;
    }

    public static void main(String[] args) {
        int freq[] = {2, 1, 1, 3, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = freq.length;

        // Build the BIT
        int[] BITree = constructBITree(freq, n);
        System.out.println("Sum of elements in arr[0..5] is: " + getSum(BITree, 5));

        // Update operation: add 6 to freq[3]
        int delta = 6;
        updateBIT(BITree, n, 3, delta);
        
        System.out.println("Sum of elements in arr[0..5] after update is: " + getSum(BITree, 5));
    }
}