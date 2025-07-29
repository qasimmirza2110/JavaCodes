public class pal {
    // Method with parameter to check palindrome
    public static boolean isPalin(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;}
        return true;
    }
    public static void main(String[] args) {
        String word = "Madam";  // Change this to test other words
        if (isPalin(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
            String check="sujata"; // eg 2
            if (isPalin(check)) {
                System.out.println(check + " is a palindrome.");
            } else {
                System.out.println(check + " is not a palindrome.");
            }
        }
    }

