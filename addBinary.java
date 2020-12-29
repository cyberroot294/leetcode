public class addBinary {
    public static void main(String[] args) {
        System.out.println(add("11", "1"));
        System.out.println(add2("11", "1"));
    }

    // one liner solution
    public static String add(String one, String two) {
        return Integer.toBinaryString(Integer.parseInt(one, 2) + Integer.parseInt(two, 2));
    }

    // others solution
    public static String add2(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = ((i < 0) ? 0 : (a.charAt(i--) - '0')) + ((j < 0) ? 0 : (b.charAt(j--) - '0')) + carry;

            sb.append(Integer.toString(sum & 1));
            carry = (sum >> 1) & 1;
        }

        return sb.reverse().toString();
    }
}
