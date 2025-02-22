/*Every character has a weight The weight of an English uppercase alphabet
A-Z is given below. A-1 B=2*A+A C=3*B+B D=4*C+C...Y-25*X+X
Z=26*Y+Y The weight of any string made up of these characters is the
summation of weights of each character. Given a total string weight.
determine shortest string of that given weight. If there is more than one
solution, return the lexicographically smallest of them. For example, given
weight = 25, and the weights of the first few characters of the alphabet are
A=1, B=3, C=12, D=60 it is certain that no letter larger than C is required,
Some of the strings with a total weight equal to the largest are ABBBBC,
ACC, and AAAAAAABBBBBB. The shortest of these is ACC. While any
permutation of these characters will have the same weight, this is the
lexicographically smallest of them. Function Description Complete the
function smallestString in the editor below. */

public class WeightedSubString {

    public static String shortestString(int weight) {
        if (weight == 0) {
            return "";
        }
        
        for (int charIndex = 25; charIndex > 0; charIndex--) {
            int charWeight = calculateWeight(charIndex);
            if (charWeight <= weight) {
                return (char) ('A' + charIndex - 1) + shortestString(weight - charWeight);
            }
        }
        return "";
    }

    private static int calculateWeight(int charIndex) {
        if (charIndex == 1) {
            return 1;
        }
        return charIndex * calculateWeight(charIndex - 1) + calculateWeight(charIndex - 1);
    }

    public static void main(String[] args) {
        int weight = 12;
        String result = shortestString(weight);
        System.out.println("Shortest String for weight " + weight + ": " + result);
    }
}

