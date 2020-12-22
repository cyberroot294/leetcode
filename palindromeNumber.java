
public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(7777));
    }

    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            int y = 0;
            int temp = x;
            while (x > 0) {
                y = (y * 10) + (x % 10);
                x /= 10;
            }
            return y == temp;
        }
        return false;
    }
}
