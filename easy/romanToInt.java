class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && (Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1))).equals("IV")) {
                sum += 4;
                i++;
            }

            else if (i < s.length() - 1 && (Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1))).equals("IX")) {
                sum += 9;
                i++;
            }

            else if (i < s.length() - 1 && (Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1))).equals("XL")) {
                sum += 40;
                i++;
            }

            else if (i < s.length() - 1 && (Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1))).equals("XC")) {
                sum += 90;
                i++;
            }

            else if (i < s.length() - 1 && (Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1))).equals("CD")) {
                sum += 400;
                i++;
            }

            else if (i < s.length() - 1 && (Character.toString(s.charAt(i)) + Character.toString(s.charAt(i + 1))).equals("CM")) {
                sum += 900;
                i++;
            }

            else {

                switch(s.charAt(i)) {
                    case 'I': sum += 1;
                              break;
                    case 'V': sum += 5;
                              break;
                    case 'X': sum += 10;
                              break;
                    case 'L': sum += 50;
                              break;
                    case 'C': sum += 100;
                              break;
                    case 'D': sum += 500;
                              break;
                    case 'M': sum += 1000;
                              break;
                }
            }

        }
        return sum;
    }
}
