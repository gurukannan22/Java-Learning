package InterviewProblems;
/**
 * # Example1: input_string_lst = ['flower','flow','flaunt']
 *  Expected output is : 'fl' As fl is common among all substrings.
 */
public class StringProblems {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flaunt"};
        String result = findCommonSubString(input);
        System.out.println("Longest common prefix: " + result);
    }

    public static String findCommonSubString(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return ""; // Handle edge cases
        }

        String prefix = strArr[0]; // Start with the first string as the prefix

        for (int i = 1; i < strArr.length; i++) {
            // Shorten the prefix until it matches the start of the current string
            while (strArr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // No common prefix
                }
            }
        }

        return prefix;
    }
}

