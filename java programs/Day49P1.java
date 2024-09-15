import java.util.*;
public class Day49P1 {
    public static void main(String[] args){
        String s = "The quick fox jumps over the lazy brown dog";
        Set<Character> vowels = new HashSet<>();
        Set<Character> consonants = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels.add(c);
                } else {
                    consonants.add(c);
                }
            }
        }
        System.out.println("Vowels:");
        for (char c : vowels) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Consonants:");
        for (char c : consonants) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Calculate total number of unique vowels and consonants
        int totalVowels = vowels.size();
        int totalConsonants = consonants.size();

        System.out.println("Total number of unique vowels: " + totalVowels);
        System.out.println("Total number of unique consonants: " + totalConsonants);


        }
    }
