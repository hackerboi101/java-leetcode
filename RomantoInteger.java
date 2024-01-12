public class RomantoInteger {
    public int romanToInt(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'I') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            } else if (ch == 'V') {
                sum += 5;
            } else if (ch == 'X') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            } else if (ch == 'L') {
                sum += 50;
            } else if (ch == 'C') {
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            } else if (ch == 'D') {
                sum += 500;
            } else if (ch == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomantoInteger rti = new RomantoInteger();
        System.out.println(rti.romanToInt("MCMXCIV"));
    }
}