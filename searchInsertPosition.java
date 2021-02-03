public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
        int res = searchInsert(arr, 3);
        System.out.println(res);
    }

    private static int searchInsert(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);

    }

    public static int search(int[] arr, int target, int start, int end) {
        if (end >= start) {
            int mid = ((end - start) / 2) + start;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target)
                return search(arr, target, mid + 1, end);
            else
                return search(arr, target, start, mid - 1);
        } else {
            return start;
        }
    }
}
