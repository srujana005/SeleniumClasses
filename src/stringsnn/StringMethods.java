package stringsnn;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "  Hello, World!  ";
		        String str2 = "hello, world!";

		        // 1. Length
		        System.out.println("Length: " + str.length());

		        // 2. Trim
		        System.out.println("Trimmed: '" + str.trim() + "'");

		        // 3. toUpperCase and toLowerCase
		        System.out.println("Upper: " + str.toUpperCase());
		        System.out.println("Lower: " + str.toLowerCase());

		        // 4. charAt
		        System.out.println("Char at 1: " + str.charAt(1));

		        // 5. substring
		        System.out.println("Substring (2, 8): " + str.substring(2, 8));

		        // 6. equals and equalsIgnoreCase
		        System.out.println("Equals: " + str.equals(str2));
		        System.out.println("EqualsIgnoreCase: " + str.trim().equalsIgnoreCase(str2.trim()));

		        // 7. compareTo
		        System.out.println("CompareTo: " + str.compareTo(str2));

		        // 8. contains
		        System.out.println("Contains 'World': " + str.contains("World"));

		        // 9. startsWith and endsWith
		        System.out.println("Starts with '  He': " + str.startsWith("  He"));
		        System.out.println("Ends with '!  ': " + str.endsWith("!  "));

		        // 10. replace
		        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));

		        // 11. split
		        String[] parts = str.split(",");
		        System.out.println("Split by ',': ");
		        for (String part : parts) {
		            System.out.println("-> " + part.trim());
		        }

		        // 12. indexOf and lastIndexOf
		        System.out.println("Index of 'o': " + str.indexOf('o'));
		        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

		        // 13. isEmpty and isBlank (isBlank is from Java 11+)
		        String empty = "";
		        System.out.println("Is empty: " + empty.isEmpty());
		        System.out.println("Is blank (Java 11+): " + empty.isBlank());

		        // 14. concat
		        System.out.println("Concat: " + str.trim().concat(" Welcome!"));

		        // 15. matches
		        System.out.println("Matches regex '[A-Za-z ,!]+': " + str.matches("[A-Za-z ,!]+"));

		        // 16. toCharArray
		        char[] chars = str.toCharArray();
		        System.out.print("To char array: ");
		        for (char c : chars) {
		            System.out.print(c + " ");
		        }

		        // 17. format
		        String formatted = String.format("Number: %d, String: %s", 123, "Java");
		        System.out.println("\nFormatted: " + formatted);
		    }
		}


	

