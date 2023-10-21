
import java.util.Scanner;

public class Tugasperulangan {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase().replaceAll("\\s", "");  // Ubah menjadi huruf kecil dan hapus spasi
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String kata1 = "Katak";
        String kata2 = "Makan";
        String kata3 = "Kasur";
        String kata4 = "Kasur ini rusak";
    
        System.out.println(kata1 + ": " + (isPalindrome(kata1) ? "palindrome" : "bukan palindrome"));
        System.out.println(kata2 + ": " + (isPalindrome(kata2) ? "palindrome" : "bukan palindrome"));
        System.out.println(kata3 + ": " + (isPalindrome(kata3) ? "palindrome" : "bukan palindrome"));
        System.out.println(kata4 + ": " + (isPalindrome(kata4) ? "palindrome" : "bukan palindrome"));
    }

    
}