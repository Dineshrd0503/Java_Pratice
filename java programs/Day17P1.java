import java.util.*;
public class Day17P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to strings demo");
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Reversed string is:\n"+reverseString(str));
        System.out.println("counting vowels and constants in strings");
        vowelsconstants(str);
    }

    public static String reverseString(String str) {
        for(int i=str.length()-1;i>=0;i--){
            str+=str.charAt(i);

        }
        return str;
    }

    public static void vowelsconstants(String str) {
        int vowelCount = 0, constCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c+" -vowel");
                vowelCount++;
            } else if (c != ' ') {
                System.out.println(c+" -constants");
                constCount++;
            }
        }
        System.out.println("Number of vowels :"+vowelCount);
        System.out.println("Number of constants :"+constCount);
    }
}