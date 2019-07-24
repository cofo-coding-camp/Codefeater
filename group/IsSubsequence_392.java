package wechat.group;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) return false;
        int m = s.length(), n = t.length();

        int i = 0, j = 0;
        while (j < n){
            if (s.charAt(i) == t.charAt(j)) i ++;
            j ++;
        }
        System.out.println(i);
        if (i == m) return true;
        return false;
    }


    public static void main(String[] args){
        IsSubsequence_392 is = new IsSubsequence_392();

        System.out.println(is.isSubsequence("abc", "ahbgdc"));
    }
}
