class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        // Apply the shifts using the difference array
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;
            diff[start] += direction;
            if (end + 1 < n) {
                diff[end + 1] -= direction;
            }
        }

        // Calculate the prefix sum to get the final shifts
        int[] finalShifts = new int[n];
        int shift = 0;
        for (int i = 0; i < n; i++) {
            shift += diff[i];
            finalShifts[i] = shift;
        }

        // Apply the final shifts to the string
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            int newChar = (s.charAt(i) - 'a' + finalShifts[i]) % 26;
            if (newChar < 0) {
                newChar += 26;
            }
            result[i] = (char) (newChar + 'a');
        }

        return new String(result);
    }
}
