public class ModifyString {
        public String modifyString(String s) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '?') {
                    for (char c = 'a'; c <= 'z'; c++) {
                        if ((i > 0 && chars[i - 1] == c) || (i < chars.length - 1 && chars[i + 1] == c)) {
                            continue;
                        }
                        chars[i] = c;
                        break;
                    }
                }
            }
            return new String(chars);
        }
    }
