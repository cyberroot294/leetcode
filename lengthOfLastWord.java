public class lengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(solve("woi apa lo hah!!!"));
    }

    public static int solve(String sentence) {
            int len = 0;
            sentence = sentence.trim();
            for(int i = sentence.length()-1; i >= 0; i--) {
                if(sentence.charAt(i) == ' ') {
                    break;
                }
                len++;
            }
            return len;
    }
}
