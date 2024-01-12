public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        boolean nothing = true;
        int i;
        int count = 0;
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                nothing = false;
                count++;
            }
            if (s.charAt(i) == ' ' && nothing == false) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LengthofLastWord llw = new LengthofLastWord();
        System.out.println(llw.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
