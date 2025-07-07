package stringsnn;


public class Palindromeword {
    public static void main(String[] args) {
        String s = "madam and mom are good friends";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }

            if (word.equalsIgnoreCase(rev)) {
                System.out.println(word + " is a palindrome");
            }
        }
    }
}

