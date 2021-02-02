/**
 * removeElement
 */
public class removeElement {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 7, 8, 9 };
        int elem = 1;
        int res = remove(arr, elem);
        System.out.println(res);
    }

    private static int remove(int[] arr, int elem) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == elem) {
                arr[i] = arr[n - 1];
                n--;
            } else
                i++;
        }
        return n;
    }
}