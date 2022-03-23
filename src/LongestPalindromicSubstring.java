import java.util.ArrayList;
import java.util.HashSet;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
//        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("abjojbd"));
    }
    public static String longestPalindrome(String s) {
        if(s.length()<=1) return s;
//        HashSet<String> Substrings = new HashSet<>();
        String answer = "";
        int lps = 0;
        for (int i = 0; i< s.length(); i++){
            for (int j = i; j<=s.length();j++){
                int sublength = s.substring(i,j).length();
                if (i!=j && isPalindrome(s.substring(i,j)) && sublength>lps){
                    lps = sublength;
                    answer = s.substring(i,j);
                }
            }
        }
        return answer;
    }
    public static boolean isPalindrome(String s){
        if (s.length() == 1) return true;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
            if (i == s.length()-1-i) break;
        }
        return true;
    }
}
