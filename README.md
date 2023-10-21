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

        System.out.println();

    int[] deretA = {1, 2, 4, 3, 4, 6, 5, 6, 8, 7};
        for (int angka : deretA) {
        System.out.println(angka);
        }
        System.out.println();

    int[] deretB = {1, 2, 3, 6, 11, 20, 37, 68};
        for (int angka : deretB) {
        System.out.println(angka);
       }
        
        System.out.println();
    for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 4; j++) {
            int angka = i + (j - 1) * 3;
            System.out.print(angka + " ");
        }
        System.out.println();
    }

    }   
}
