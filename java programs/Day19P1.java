
import java.util.*;
import java.lang.String;
public class Day19P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        System.out.println("Finding duplicate characters in string");
        System.out.println("Duplicate characters are");
        iterative(a);
        System.out.println("using hassets");
        hashset(a);
        sc.close();
    }
    public static void iterative(String a) {
        boolean[] seen = new boolean[256]; // assuming ASCII characters
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                for (int j = i + 1; j < a.length(); j++) {
                    if (a.charAt(j) == ch) {
                        System.out.println("Duplicate character: " + ch);
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("Total duplicate characters: " + count);
    }
   
    public static void hashset(String a) {
        HashSet<Character> unique = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();
        for (char c : a.toCharArray()) {
            if (!unique.add(c)) {
                duplicate.add(c);
            }
        }
        System.out.println("Duplicate characters: " + duplicate);
        System.out.println("No. of duplicate characters: " + duplicate.size());

    }
}
