import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("au"));
    }
    public static int lengthOfLongestSubstring(String s) {
       ArrayList<Character> list = new ArrayList<>();
       int lls = 0;
       for (int i =0 ; i<s.length();i++){
           list.add(s.charAt(i));
       }
       if (list.size() ==1) return 1;
        while (list.size()>1){
             HashSet<Character> SubList = new HashSet<>();
             SubList.add(list.get(0));
             int k = 1;
             boolean Repeat = false;
             while(!Repeat) {
                 if (SubList.contains(list.get(k))) Repeat = true;
                 if (!Repeat) {
                     SubList.add(list.get(k));
                     k++;
                     if (k == list.size()) Repeat = true;
                 }
             }
             if (k >= lls) lls =k;
             list.remove(0);
        }
        return lls;
    }
}
