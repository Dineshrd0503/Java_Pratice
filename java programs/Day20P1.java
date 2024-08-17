import java.util.*;

public class Day20P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Finding all possible substrings");
        HashSet<String> substrings = new HashSet<>();

        for (int len = 1; len <= str.length(); len++) {
            for (int i = 0; i <= str.length() - len; i++) {
                String substr = str.substring(i, i + len);
                substrings.add(substr);
                System.out.println(substr + " :" + i);
            }
        }

        System.out.println("Enter a random string to check if it's a substring");
        String randomStr = sc.nextLine();

        if (substrings.contains(randomStr)) {
            System.out.println(randomStr + " is a substring of " + str);
        } else {
            System.out.println(randomStr + " is not a substring of " + str);
        }
    }
}